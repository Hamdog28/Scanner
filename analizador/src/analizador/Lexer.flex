package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token

/* Inicio de Expresiones regulares */
Todo = ([^\\\"]|\\.)*
Digito = [0-9]
Octal = [0-7]
Hexadecimal = [a-fA-F0-9]
Num = {Digito}{Digito}*
Numero = ({Num}|(0"x"{Hexadecimal}{Hexadecimal}*)|(0{Octal}{Octal}*)|({Digito}*"."{Num})|({Digito}*"."{Num}("e"|"E"){Num})|({Digito}*"."{Num}"-"("e"|"E"){Num})|({Num}("e"|"E"){Digito}*)|({Num}"-"("e"|"E"){Num}))

Letra = [a-zA-Z_]
Palabra = {Letra}({Letra}|{Digito})*
Espacio = " "
SaltoDeLinea = \r|\n|\r\n

PalabraReservada = "auto"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while"
Operadores = ","|"++"|"--"|"=="|">="|">"|"?"|"<="|"<"|"!="|"||"|"&&"|"!"|"="|"+"|"-"|"*"|"/"|"%"|":"|"."|"+="|"-="|"*="|"/="|"&"|"^"|"|"|">>"|"<<"|"~"|"%="|"&="|"^="|"|="|"<<="|">>="|"->"

String = \"({Numero}|{Espacio}|{Palabra}|{Operadores}|\\)*\"
ComentarioLinea = "//"({Numero}|{Espacio}|{Palabra}|{Operadores}|\\)*{SaltoDeLinea}
ComentarioBloque = "/*"{Todo}"*/"
/* Finaliza expresiones regulares */

%{
public String lexeme;
%}
%%
{ComentarioLinea} {lexeme=yytext(); return SaltoDeLinea;}
{ComentarioBloque} {lexeme=yytext(); return Comentario;}

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
(\"{Palabra}|{Palabra}\") {lexeme=yytext(); return ERROR;}

{Palabra} {lexeme=yytext(); return Identificador;}
{Numero}{Palabra} {lexeme=yytext(); return ERROR;}
{Numero} {lexeme=yytext(); return Literal;}


({Espacio}|[ \t\v\f])* {/*Ignore*/}
. {lexeme=yytext(); return ERROR;}