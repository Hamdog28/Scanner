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
		//System.out.println("Lexer: " + texto);
		return new Symbol(tipo, yycolumn + 1, yyline + 1, valor);
	}
%}

/* Simbolo de End Of File */
%eofval{
  return new Symbol(Simbolos.EOF, yycolumn + 1, yyline + 1, yytext());
%eofval}

/* Definición de variables */
Blancos = [\t\n\r\s]+

Ident = [:jletter:][:jletterdigit:]*

DecIntegerLiteral = 0|[1-9][0-9]*

OctDigit          = [0-7]
OctIntegerLiteral = 0{OctDigit}+

HexDigit          = [0-9a-fA-F]
HexIntegerLiteral = 0[xX]{HexDigit}+

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
	":"				{ return simbolo(":", Simbolos.smbdospuntos, yytext()); }
	"("				{ return simbolo("(", Simbolos.smbparentabrir, yytext()); }
	")"				{ return simbolo(")", Simbolos.smbparentcerrar, yytext()); }
	"["				{ return simbolo("[", Simbolos.smbcuadradoabrir, yytext()); }
	"]"				{ return simbolo("]", Simbolos.smbcuadradocerrar, yytext()); }
	"{"				{ return simbolo("{", Simbolos.smbllaveabrir, yytext()); }
	"}"				{ return simbolo("}", Simbolos.smbllavecerrar, yytext()); }

    /* Literales decimales, octales y hexadecimales */
    {HexIntegerLiteral}	{ return simbolo("Hex: " + yytext(), Simbolos.smbhex, yytext()); }
    {DecIntegerLiteral}	{ return simbolo("Dec: " + yytext(), Simbolos.smbdec, yytext()); }
    {OctIntegerLiteral}	{ return simbolo("Oct: " + yytext(), Simbolos.smboct, yytext()); }
        
	/* Simbolo para iniciar en un comentario de bloque */
	"/*"[[^*]|*]*"*/"	{ /* No haga nada */ System.out.println("Lexer: Com de Bloque: " + yytext()); }

	/* Simbolo para iniciar en un comentario de linea */
	"//".*			{ /* No haga nada */ System.out.println("Lexer: Com de Linea: " + yytext()); }

	/* Simbolo para iniciar en STRING */
	\"				{ string.setLength(0); yybegin(STRING); }
	/* " */

	/* Simbolo para iniciar en CHARLITERAL */
	\'                             { yybegin(CHARLITERAL); }
	/* Este comentario no hace nada, pero no se borra ' */

	/* Identificadores */ 
	//(({Ident}{NOASCII}+|{NOASCII}+{Ident}){Ident}*)+ {System.out.println("Error lexico en la linea " + yyline + ", columna " + yycolumn + " : Caracter ilegal <"+ yytext()+">");} /*Se vuela las tildes*/
	{Ident}			{ return simbolo("Identif: " + yytext(), Simbolos.smbidentificador, yytext()); }

	/* Error si no encuentra coincidencias */
	[^]|\n 			{ System.out.println("Error lexico en la linea " + (yyline + 1) + ", columna " + (yycolumn + 1) + " : Caracter ilegal <"+ yytext()+">"); }
	
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
    [^\r\n\'\\]\'	{ yybegin(YYINITIAL); return simbolo("CHAR: " + yytext().charAt(0), Simbolos.smbcharlit, String.valueOf(yytext().charAt(0))); }
    "\\b"\'			{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\b", Simbolos.smbcharlit, "\b"); }
    "\\t"\'			{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\t", Simbolos.smbcharlit, "\t"); }
    "\\n"\'			{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\n", Simbolos.smbcharlit, "\n"); }
    "\\f"\'			{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\f", Simbolos.smbcharlit, "\f"); }
    "\\r"\'			{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\r", Simbolos.smbcharlit, "\r"); }
    "\\\""\'		{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\"", Simbolos.smbcharlit, "\""); }
    "\\'"\'			{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\'", Simbolos.smbcharlit, "\'"); }
    "\\\\"\'		{ yybegin(YYINITIAL); return simbolo("CHAR: " + "\\", Simbolos.smbcharlit, "\\"); }
}