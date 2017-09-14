package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token

/* Inicio de Expresiones regulares */

Digito = [0-9]
Numero = {Digito} {Digito}*

Letra = [a-zA-Z_]
Palabra = {Letra} ({Letra}|{Digito})*
Espacio = " "
SaltoDeLinea = \n|\r|\r\n
PalabraReservada = "auto"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while"
Operadores = ","|"++"|"--"|"=="|">="|">"|"?"|"<="|"<"|"!="|"||"|"&&"|"!"|"="|"+"|"-"|"*"|"/"|"%"|":"|"."|"+="|"-="|"*="|"/="|"&"|"^"|"|"|">>"|"<<"|"~"|"%="|"&="|"^="|"|="|"<<="|">>="|"->"
/* Finaliza expresiones regulares */

%{
public String lexeme;
%}
%%
{Espacio} {/*Ignore*/}
{Operadores} {lexeme=yytext(); return Operador;}
";" {return PuntoComa;}
"(" {lexeme=yytext(); return ParentesisI;}
")" {lexeme=yytext(); return ParentesisD;}
"[" {return ParentesisCI;}
"]" {return ParentesisCD;}
"{" {lexeme=yytext(); return LlaveI;}
"}" {return LlaveD;}
{PalabraReservada} {lexeme=yytext(); return PalabraReservada;}
{Palabra} {lexeme=yytext(); return Identificador;}
{SaltoDeLinea} {lexeme=yytext(); return SaltoDeLinea;}
 {Numero} {lexeme=yytext(); return INT;}
. {return ERROR;}