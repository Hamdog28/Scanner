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
Numero = ({Num}|(0{Octal}{Octal}*)|({Digito}*"."{Num}))

Letra = [a-zA-Z_]
Palabra = {Letra}({Letra}|{Digito})*
Espacio = " "
SaltoDeLinea = \r|\n|\r\n

PalabraReservada = "auto"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while"
Operadores = ","|"++"|"--"|"=="|">="|">"|"?"|"<="|"<"|"!="|"||"|"&&"|"!"|"="|"+"|"-"|"*"|"/"|"%"|":"|"."|"+="|"-="|"*="|"/="|"&"|"^"|"|"|">>"|"<<"|"~"|"%="|"&="|"^="|"|="|"<<="|">>="|"->"

String = ({Numero}|{Espacio}|{Palabra}|{Operadores}|\\|[^\r\n\"\\])* 

ComentarioLinea = "//"({Numero}|{Espacio}|{Palabra}|{Operadores}|\\|[^\r\n\"\\])*{SaltoDeLinea}
ComentarioBloque = "/*"{Todo}"*/"

SKIPME = [\x21-\x29\x2B-\x40\x5B-\x5E\x60\x7B-\xFF]
/* Finaliza expresiones regulares */

%{
public String lexeme;
%}
%%
{ComentarioLinea} {lexeme=yytext(); return SaltoDeLinea;}
{ComentarioBloque} {lexeme=yytext(); return Comentario;}

{SaltoDeLinea} {lexeme=yytext(); return SaltoDeLinea;}

\"{String}\" {lexeme=yytext(); return Literal;}
\"{String} {lexeme=yytext(); return ERROR;}

\'.\' {lexeme=yytext(); return Literal;}
\'. {lexeme=yytext(); return ERROR;}
\'.+\' {lexeme=yytext(); return ERROR;}
{Operadores} {lexeme=yytext(); return Operador;}
";" {lexeme=yytext(); return PuntoComa;}
"(" {lexeme=yytext(); return ParentesisI;}
")" {lexeme=yytext(); return ParentesisD;}
"[" {lexeme=yytext(); return ParentesisCI;}
"]" {lexeme=yytext(); return ParentesisCD;}
"{" {lexeme=yytext(); return LlaveI;}
"}" {lexeme=yytext(); return LlaveD;}
{PalabraReservada} {lexeme=yytext(); return PalabraReservada;}
(\"({Palabra}|{Espacio})*{SaltoDeLinea}|{Palabra}\") {lexeme=yytext(); return ERROR;}

{Palabra} {lexeme=yytext(); return Identificador;}
(0"x"{Hexadecimal}{Hexadecimal}*)|({Digito}*"."{Num}("e"|"E"){Num})|({Digito}*"."{Num}"-"("e"|"E"){Num})|({Num}("e"|"E"){Digito}*)|({Num}"-"("e"|"E"){Num}) {lexeme=yytext(); return Literal;}
{Numero}{Palabra} {lexeme=yytext(); return ERROR;}

{Numero} {lexeme=yytext(); return Literal;}


({Espacio}|[ \t\f])* {/*Ignore*/}

/* ESTO ES PARA EL ARBOL CON TILDE :)
({SKIPME}|[^\\\"\r|\n|\r\n ])({SKIPME}|{Palabra}|"*")*{Palabra} {lexeme=yytext(); return ERROR;}*/
. {lexeme=yytext(); return ERROR;}