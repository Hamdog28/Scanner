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
Ident = [a-zA-Z$_] [a-zA-Z0-9$_]*
Blancos = [\t\n\r ]+	//El espacio al final es necesario

/* Definición de estados */
%state STRING
%state COMMENT

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

	/* Simbolo para iniciar en un comentario de bloque */
	"/*"[[^*]|*]*"*/"	{ /* No haga nada */ System.out.println("Lexer: C de Bloque: " + yytext()); }

	/* Simbolo para iniciar en un comentario de linea */
	"//".*			{ /* No haga nada */ System.out.println("Lexer: C de Linea: " + yytext()); }

	/* Simbolo para iniciar en STRING */
	\"				{ string.setLength(0); yybegin(STRING); }

	/* Este comentario no hace nada, pero no se borra " */

}

<STRING> {
	\"				{ yybegin(YYINITIAL); return simbolo("STRING: " + string.toString(), Simbolos.smbstring, string.toString()); }
	[^\n\r\"\\]+	{ string.append( yytext() ); }
	\\t 			{ string.append('\t'); }
	\\n 			{ string.append('\n'); }
	\\r 			{ string.append('\r'); }
	\\\" 			{ string.append('\"'); }
	\\\\			{ string.append('\\'); }

}

/* Error si no encuentra cohincidencias */
[^]|\n 				{ System.out.println("Error lexico en la linea " + yyline + ", columna " + yycolumn + " : Caracter ilegal <"+ yytext()+">"); }