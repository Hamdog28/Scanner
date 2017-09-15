package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token

/* Inicio de Expresiones regulares */
Todo = ([^\\\"]|\\.)*
Digito = [0-9]
Numero = {Digito}{Digito}*

Letra = [a-zA-Z_]
Palabra = {Letra}({Letra}|{Digito})*
Espacio = " "
SaltoDeLinea = \n|\r|\r\n
PalabraReservada = "auto"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while"
Operadores = ","|"++"|"--"|"=="|">="|">"|"?"|"<="|"<"|"!="|"||"|"&&"|"!"|"="|"+"|"-"|"*"|"/"|"%"|":"|"."|"+="|"-="|"*="|"/="|"&"|"^"|"|"|">>"|"<<"|"~"|"%="|"&="|"^="|"|="|"<<="|">>="|"->"
String = \"([^\\\"]|\\.|[^\r\n])*\"
ComentarioLinea = "//"{Todo}{SaltoDeLinea}
ComentarioBloque = "/*"{Todo}"*/"
/* Finaliza expresiones regulares */

%{
public String lexeme;
%}
%%
{ComentarioLinea} {/*Ignore*/}
{ComentarioBloque} {/*Ignore*/}
{SaltoDeLinea} {lexeme=yytext(); return SaltoDeLinea;}
{String} {lexeme=yytext(); return Literal;}

{Operadores} {lexeme=yytext(); return Operador;}
";" {lexeme=yytext(); return PuntoComa;}
"(" {lexeme=yytext(); return ParentesisI;}
")" {lexeme=yytext(); return ParentesisD;}
"[" {lexeme=yytext(); return ParentesisCI;}
"]" {lexeme=yytext(); return ParentesisCD;}
"{" {lexeme=yytext(); return LlaveI;}
"}" {lexeme=yytext(); return LlaveD;}
{PalabraReservada} {lexeme=yytext(); return PalabraReservada;}
{Palabra} {lexeme=yytext(); return Identificador;}

{Numero} {lexeme=yytext(); return Literal;}


{Espacio} {/*Ignore*/}
. {return ERROR;}