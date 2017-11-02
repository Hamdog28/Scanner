package iiproyecto;

import java_cup.runtime.*;

%%

/* Nombre de la clase */
%class Lexer

/* Leer archivos de texto */
%unicode

/* Compatibilidad con CUP */
%cupsym Simbolos
%cup

/* Poder acceder a cantidad de carácteres, lineas y columnas */
%char
%line
%column

/* Ni idea */
%full
%ignorecase

/* Código personalizado */
%{
	StringBuffer string = new StringBuffer();

	private Symbol simbolo(String texto, int tipo, Object valor) {
		System.out.println("Lexer: " + texto);
		return new Symbol(tipo, yycolumn, yyline, valor);
	}
%}

/* Simbolo de End Of File */
%eofval{
  return new Symbol(Simbolos.EOF, yycolumn, yyline, yytext());
%eofval}

/* Definición de variables */
Ident = [:jletter:][:jletterdigit:]*
Blancos = [\t\n\r ]+	//El espacio al final es necesario

/* literales enteras */
DecIntegerLiteral = 0 | [1-9][0-9]*
DecLongLiteral    = {DecIntegerLiteral} [lL]

HexIntegerLiteral = 0 [xX] 0* {HexDigit} {1,8}
HexLongLiteral    = 0 [xX] 0* {HexDigit} {1,16} [lL]
HexDigit          = [0-9a-fA-F]

OctIntegerLiteral = 0+ [1-3]? {OctDigit} {1,15}
OctLongLiteral    = 0+ 1? {OctDigit} {1,21} [lL]
OctDigit          = [0-7]
    
Numero = {DecIntegerLiteral}|{DecLongLiteral}
Octal = {OctIntegerLiteral}|{OctLongLiteral}|{OctDigit}
Hexadecimal = {HexIntegerLiteral}|{HexLongLiteral}|{HexDigit}

NOASCII = [\x80-\xFF]

/* Definición de estados */
%state STRING, CHARLITERAL

%%

<YYINITIAL> {

	{Blancos}		{ /* No haga nada */ }

	/* Sección de palabras reservadas */
	"break"			{ return simbolo("break", Simbolos.smbbreak, yytext()); }
	"case"			{ return simbolo("case", Simbolos.smbcase, yytext()); }
	"char"			{ return simbolo("char", Simbolos.smbchar, yytext()); }
	"const"			{ return simbolo("const", Simbolos.smbconst, yytext()); }
	"continue"		{ return simbolo("continue", Simbolos.smbcontinue, yytext()); }
	"default"		{ return simbolo("default", Simbolos.smbdefault, yytext()); }
	"do"			{ return simbolo("do", Simbolos.smbdo, yytext()); }
	"else"			{ return simbolo("else", Simbolos.smbelse, yytext()); }
	"for"			{ return simbolo("for", Simbolos.smbfor, yytext()); }
	"if"			{ return simbolo("if", Simbolos.smbif, yytext()); }
	"int"			{ return simbolo("int", Simbolos.smbint, yytext()); }
	"long"			{ return simbolo("long", Simbolos.smblong, yytext()); }
	"return"		{ return simbolo("return", Simbolos.smbreturn, yytext()); }
	"short"			{ return simbolo("short", Simbolos.smbshort, yytext()); }
	"switch"		{ return simbolo("switch", Simbolos.smbswitch, yytext()); }
	"void"			{ return simbolo("void", Simbolos.smbvoid, yytext()); }
	"while"			{ return simbolo("while", Simbolos.smbwhile, yytext()); }

	/* Identificadores revervados */
	"read"			{ return simbolo("read", Simbolos.smbread, yytext()); }
	"write"			{ return simbolo("write", Simbolos.smbwrite, yytext()); }

	/* Aritmético y booleanos */
	"=="			{ return simbolo("==", Simbolos.smbigualigual, yytext()); }
	">="			{ return simbolo(">=", Simbolos.smbmayorigual, yytext()); }
	">"				{ return simbolo(">", Simbolos.smbmayor, yytext()); }
	"<="			{ return simbolo("<=", Simbolos.smbmenorigual, yytext()); }
	"<"				{ return simbolo("<", Simbolos.smbmenor, yytext()); }
	"!="			{ return simbolo("!=", Simbolos.smbdiferente, yytext()); }
	"||"			{ return simbolo("||", Simbolos.smbor, yytext()); }
	"&&"			{ return simbolo("&&", Simbolos.smband, yytext()); }
	"!"				{ return simbolo("!", Simbolos.smbadmiracion, yytext()); }
	"++"			{ return simbolo("++", Simbolos.smbmasmas, yytext()); }
	"--"			{ return simbolo("--", Simbolos.smbmenosmenos, yytext()); }
	"="				{ return simbolo("=", Simbolos.smbigual, yytext()); }
	"+"				{ return simbolo("+", Simbolos.smbmas, yytext()); }
	"-"				{ return simbolo("-", Simbolos.smbmenos, yytext()); }
	"*"				{ return simbolo("*", Simbolos.smbmultiplicacion, yytext()); }
	"/"				{ return simbolo("/", Simbolos.smbdivision, yytext()); }
	"%"				{ return simbolo("%", Simbolos.smbdivisionentera, yytext()); }
	"+="			{ return simbolo("+=", Simbolos.smbmasigual, yytext()); }
	"-="			{ return simbolo("-=", Simbolos.smbmenosigual, yytext()); }
	"*="			{ return simbolo("*=", Simbolos.smbmultiplicacionigual, yytext()); }
	"/="			{ return simbolo("/=", Simbolos.smbdivisionigual, yytext()); }

	/* Simbolos especiales */
	","				{ return simbolo(",", Simbolos.smbcoma, yytext()); }
	";"				{ return simbolo(";", Simbolos.smbpuntocoma, yytext()); }
	"("				{ return simbolo("(", Simbolos.smbparentabrir, yytext()); }
	")"				{ return simbolo(")", Simbolos.smbparentcerrar, yytext()); }
	"["				{ return simbolo("[", Simbolos.smbcuadradoabrir, yytext()); }
	"]"				{ return simbolo("]", Simbolos.smbcuadradocerrar, yytext()); }
	"{"				{ return simbolo("{", Simbolos.smbllaveabrir, yytext()); }
	"}"				{ return simbolo("}", Simbolos.smbllavecerrar, yytext()); }

        {Numero}{Ident} {System.out.println("Error lexico en la linea " + yyline + ", columna " + yycolumn + " : Caracter ilegal <"+ yytext()+">");}
        {Numero}            { return simbolo("INT: " + yytext(), Simbolos.smbint, yytext()); }
        {Octal}             { return simbolo("OCTAL: " + yytext(), Simbolos.smboct, yytext()); }
        {Hexadecimal}       { return simbolo("HEXADECIAMAL: " + yytext(), Simbolos.smbhexa, yytext()); }
        
	/* Simbolo para iniciar en un comentario de bloque */
	"/*"[[^*]|*]*"*/"	{ /* No haga nada */ System.out.println("Lexer: C de Bloque: " + yytext()); }

	/* Simbolo para iniciar en un comentario de linea */
	"//".*			{ /* No haga nada */ System.out.println("Lexer: C de Linea: " + yytext()); }

	/* Simbolo para iniciar en STRING */
	\"				{ string.setLength(0); yybegin(STRING); }
        /* Este comentario no hace nada, pero no se borra " */

        /* Simbolo para iniciar en CHARLITERAL */
        \'                             { yybegin(CHARLITERAL); }

        /* identifiers */ 
        (({Ident}{NOASCII}+|{NOASCII}+{Ident}){Ident}*)+ {System.out.println("Error lexico en la linea " + yyline + ", columna " + yycolumn + " : Caracter ilegal <"+ yytext()+">");} /*Se vuela las tildes*/
        {Ident}                   { return simbolo("IDENTIFICADOR: " + yytext(), Simbolos.smbidentificador, yytext()); }  
	
          
}

<STRING> {
	\"		{ yybegin(YYINITIAL); return simbolo("STRING: " + string.toString(), Simbolos.smbstring, string.toString()); }
	[^\n\r\"\\]+	{ string.append( yytext() ); }
	\\t 			{ string.append('\t'); }
	\\n 			{ string.append('\n'); }
	\\r 			{ string.append('\r'); }
	\\\" 			{ string.append('\"'); }
	\\\\			{ string.append('\\'); }
}

<CHARLITERAL> { 
    [^\r\n\'\\]\'          { yybegin(YYINITIAL); return simbolo("CHAR: " + yytext().charAt(0), Simbolos.smbchar, String.valueOf(yytext().charAt(0))); }
    "\\b"\'                { yybegin(YYINITIAL); return simbolo("CHAR: " + "\b", Simbolos.smbchar, "\b"); }
    "\\t"\'                { yybegin(YYINITIAL); return simbolo("CHAR: " + "\t", Simbolos.smbchar, "\t"); }
    "\\n"\'                { yybegin(YYINITIAL); return simbolo("CHAR: " + "\n", Simbolos.smbchar, "\n"); }
    "\\f"\'                { yybegin(YYINITIAL); return simbolo("CHAR: " + "\f", Simbolos.smbchar, "\f"); }
    "\\r"\'                { yybegin(YYINITIAL); return simbolo("CHAR: " + "\r", Simbolos.smbchar, "\r"); }
    "\\\""\'               { yybegin(YYINITIAL); return simbolo("CHAR: " + "\"", Simbolos.smbchar, "\""); }
    "\\'"\'                { yybegin(YYINITIAL); return simbolo("CHAR: " + "\'", Simbolos.smbchar, "\'"); }
    "\\\\"\'               { yybegin(YYINITIAL); return simbolo("CHAR: " + "\\", Simbolos.smbchar, "\\"); }
}

/* Error si no encuentra coincidencias */
[^]|\n 				{ System.out.println("Error lexico en la linea " + yyline + ", columna " + yycolumn + " : Caracter ilegal <"+ yytext()+">"); }