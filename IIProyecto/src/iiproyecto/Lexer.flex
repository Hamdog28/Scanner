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

/* */
%full
%ignorecase

/* Código personalizado */
%{

%}

%eofval{
  return new Symbol(Simbolos.EOF, yycolumn, yyline, yytext());
%eofval}

/* Definición de variables */

%%

/* Sección de palabras reservadas */
"auto"			{ return new Symbol(Simbolos.smbauto, yycolumn, yyline, yytext()); }
"break"			{ return new Symbol(Simbolos.smbbreak, yycolumn, yyline, yytext()); }
"case"			{ return new Symbol(Simbolos.smbcase, yycolumn, yyline, yytext()); }
"char"			{ return new Symbol(Simbolos.smbchar, yycolumn, yyline, yytext()); }
"const"			{ return new Symbol(Simbolos.smbconst, yycolumn, yyline, yytext()); }
"continue"		{ return new Symbol(Simbolos.smbcontinue, yycolumn, yyline, yytext()); }
"default"		{ return new Symbol(Simbolos.smbdefault, yycolumn, yyline, yytext()); }
"do"			{ return new Symbol(Simbolos.smbdo, yycolumn, yyline, yytext()); }
"double"		{ return new Symbol(Simbolos.smbdouble, yycolumn, yyline, yytext()); }
"else"			{ return new Symbol(Simbolos.smbelse, yycolumn, yyline, yytext()); }
"enum"			{ return new Symbol(Simbolos.smbenum, yycolumn, yyline, yytext()); }
"extern"		{ return new Symbol(Simbolos.smbextern, yycolumn, yyline, yytext()); }
"float"			{ return new Symbol(Simbolos.smbfloat, yycolumn, yyline, yytext()); }
"for"			{ return new Symbol(Simbolos.smbfor, yycolumn, yyline, yytext()); }
"goto"			{ return new Symbol(Simbolos.smbgoto, yycolumn, yyline, yytext()); }
"if"			{ return new Symbol(Simbolos.smbif, yycolumn, yyline, yytext()); }
"int"			{ return new Symbol(Simbolos.smbint, yycolumn, yyline, yytext()); }
"long"			{ return new Symbol(Simbolos.smblong, yycolumn, yyline, yytext()); }
"register"		{ return new Symbol(Simbolos.smbregister, yycolumn, yyline, yytext()); }
"return"		{ return new Symbol(Simbolos.smbreturn, yycolumn, yyline, yytext()); }
"short"			{ return new Symbol(Simbolos.smbshort, yycolumn, yyline, yytext()); }
"signed"		{ return new Symbol(Simbolos.smbsigned, yycolumn, yyline, yytext()); }
"sizeof"		{ return new Symbol(Simbolos.smbsizeof, yycolumn, yyline, yytext()); }
"static"		{ return new Symbol(Simbolos.smbstatic, yycolumn, yyline, yytext()); }
"struct"		{ return new Symbol(Simbolos.smbstruct, yycolumn, yyline, yytext()); }
"switch"		{ return new Symbol(Simbolos.smbswitch, yycolumn, yyline, yytext()); }
"typedef"		{ return new Symbol(Simbolos.smbtypedef, yycolumn, yyline, yytext()); }
"union"			{ return new Symbol(Simbolos.smbunion, yycolumn, yyline, yytext()); }
"unsigned"		{ return new Symbol(Simbolos.smbunsigned, yycolumn, yyline, yytext()); }
"void"			{ return new Symbol(Simbolos.smbvoid, yycolumn, yyline, yytext()); }
"volatile"		{ return new Symbol(Simbolos.smbvolatile, yycolumn, yyline, yytext()); }
"while"			{ return new Symbol(Simbolos.smbwhile, yycolumn, yyline, yytext()); }

/* Identificadores revervados */
"read"			{ return new Symbol(Simbolos.smbread, yycolumn, yyline, yytext()); }
"write"			{ return new Symbol(Simbolos.smbwrite, yycolumn, yyline, yytext()); }

/* Simbolos y operadores */
","				{ return new Symbol(Simbolos.smbcoma, yycolumn, yyline, yytext()); }
"++"			{ return new Symbol(Simbolos.smbmasmas, yycolumn, yyline, yytext()); }
"--"			{ return new Symbol(Simbolos.smbmenosmenos, yycolumn, yyline, yytext()); }
"=="			{ return new Symbol(Simbolos.smbigualigual, yycolumn, yyline, yytext()); }
">="			{ return new Symbol(Simbolos.smbmayorigual, yycolumn, yyline, yytext()); }
">"				{ return new Symbol(Simbolos.smbmayor, yycolumn, yyline, yytext()); }
"?"				{ return new Symbol(Simbolos.smbpregunta, yycolumn, yyline, yytext()); }
"<="			{ return new Symbol(Simbolos.smbmenorigual, yycolumn, yyline, yytext()); }
"<"				{ return new Symbol(Simbolos.smbmenor, yycolumn, yyline, yytext()); }
"!="			{ return new Symbol(Simbolos.smbdiferente, yycolumn, yyline, yytext()); }
"||"			{ return new Symbol(Simbolos.smbor, yycolumn, yyline, yytext()); }
"&&"			{ return new Symbol(Simbolos.smband, yycolumn, yyline, yytext()); }
"!"				{ return new Symbol(Simbolos.smbadmiracion, yycolumn, yyline, yytext()); }
"="				{ return new Symbol(Simbolos.smbigual, yycolumn, yyline, yytext()); }
"+"				{ return new Symbol(Simbolos.smbmas, yycolumn, yyline, yytext()); }
"-"				{ return new Symbol(Simbolos.smbmenos, yycolumn, yyline, yytext()); }
"*"				{ return new Symbol(Simbolos.smbmultiplicacion, yycolumn, yyline, yytext()); }
"/"				{ return new Symbol(Simbolos.smbdivision, yycolumn, yyline, yytext()); }
"%"				{ return new Symbol(Simbolos.smbdivisionentera, yycolumn, yyline, yytext()); }
":"				{ return new Symbol(Simbolos.smbdospuntos, yycolumn, yyline, yytext()); }
"."				{ return new Symbol(Simbolos.smbpunto, yycolumn, yyline, yytext()); }
"+="			{ return new Symbol(Simbolos.smbmasigual, yycolumn, yyline, yytext()); }
"-="			{ return new Symbol(Simbolos.smbmenosigual, yycolumn, yyline, yytext()); }
"*="			{ return new Symbol(Simbolos.smbmultiplicacionigual, yycolumn, yyline, yytext()); }
"/="			{ return new Symbol(Simbolos.smbdivisionigual, yycolumn, yyline, yytext()); }
"&"				{ return new Symbol(Simbolos.smbamperson, yycolumn, yyline, yytext()); }
"^"				{ return new Symbol(Simbolos.smbcircunflejo, yycolumn, yyline, yytext()); }
"|"				{ return new Symbol(Simbolos.smbpipe, yycolumn, yyline, yytext()); }
">>"			{ return new Symbol(Simbolos.smbfeclasderecha, yycolumn, yyline, yytext()); }
"<<"			{ return new Symbol(Simbolos.smbflechasizquierda, yycolumn, yyline, yytext()); }
"~"				{ return new Symbol(Simbolos.smbrabocerdo, yycolumn, yyline, yytext()); }
"%="			{ return new Symbol(Simbolos.smbporcentajeigual, yycolumn, yyline, yytext()); }
"&="			{ return new Symbol(Simbolos.smbampersonigual, yycolumn, yyline, yytext()); }
"^="			{ return new Symbol(Simbolos.smbcircunflejoigual, yycolumn, yyline, yytext()); }
"<<="			{ return new Symbol(Simbolos.smbfeclasderechaigual, yycolumn, yyline, yytext()); }
">>="			{ return new Symbol(Simbolos.smbflechasizquierdaigual, yycolumn, yyline, yytext()); }
"->"			{ return new Symbol(Simbolos.smbflecha, yycolumn, yyline, yytext()); }