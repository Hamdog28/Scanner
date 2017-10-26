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
Num = [1-9]{Digito}*
Numero = ({Num}|(0{Octal}{Octal}*)|({Digito}*"."{Num}))

Letra = [a-zA-Z_]
Palabra = {Letra}({Letra}|{Digito})*
Espacio = " "
SaltoDeLinea = \r|\n|\r\n


Quote= \'
SingleCharacter = [^\r\n\'\\]

PalabraReservada = "auto"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while"
Operadores = ","|"++"|"--"|"=="|">="|">"|"?"|"<="|"<"|"!="|"||"|"&&"|"!"|"="|"+"|"-"|"*"|"/"|"%"|":"|"."|"+="|"-="|"*="|"/="|"&"|"^"|"|"|">>"|"<<"|"~"|"%="|"&="|"^="|"|="|"<<="|">>="|"->"

String = ({Numero}|{Espacio}|{Palabra}|{Operadores}|\\|[^\r\n\"\\])* 

ComentarioLinea = "//"({Numero}|{Espacio}|{Palabra}|{Operadores}|\\|[^\r\n\"\\])*{SaltoDeLinea}
ComentarioBloque = "/*"({Todo}|.)+

SKIPME = [\x21-\x29\x2B-\x40\x5B-\x5E\x60\x7B-\xFF]
ASCII = [\x00-\x7E]
NOASCII = [\x80-\xFF]
/* Finaliza expresiones regulares */

%{
public String lexeme;
%}
%%
{ComentarioLinea} {lexeme=yytext(); return SaltoDeLinea;}
{ComentarioBloque}"*/" {lexeme=yytext(); return Comentario;}
{ComentarioBloque} {lexeme=yytext(); return Comentario;}

{SaltoDeLinea} {lexeme=yytext(); return SaltoDeLinea;}

\"{String}\" {lexeme=yytext(); return Literal;}
\"{String} {lexeme=yytext(); return ERROR;}

{Quote}{SingleCharacter}\' {lexeme=yytext(); return Literal;}
{Quote}"\\b"\'                        {lexeme=yytext(); return Literal;}
{Quote}"\\t"\'                        {lexeme=yytext(); return Literal;}
{Quote}"\\n"\'                        {lexeme=yytext(); return Literal;}
{Quote}"\\f"\'                        {lexeme=yytext(); return Literal;}
{Quote}"\\r"\'                        {lexeme=yytext(); return Literal;}
{Quote}"\\\""\'                       {lexeme=yytext(); return Literal;}
{Quote}"\\'"\'                        {lexeme=yytext(); return Literal;}
{Quote}"\\\\"\'                       {lexeme=yytext(); return Literal;}


{Quote}"\\b"                        {lexeme=yytext(); return ERROR;}
{Quote}"\\t"                        {lexeme=yytext(); return ERROR;}
{Quote}"\\n"                        {lexeme=yytext(); return ERROR;}
{Quote}"\\f"                        {lexeme=yytext(); return ERROR;}
{Quote}"\\r"                        {lexeme=yytext(); return ERROR;}
{Quote}"\\\""                       {lexeme=yytext(); return ERROR;}
{Quote}"\\'"\                       {lexeme=yytext(); return ERROR;}
{Quote}"\\\\"                       {lexeme=yytext(); return ERROR;}
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

(({Palabra}{NOASCII}+|{NOASCII}+{Palabra}){Palabra}*)+ {lexeme=yytext(); return ERROR;} /*Se vuela las tildes*/
{Palabra} {lexeme=yytext(); return Identificador;}

(0[xX]{Hexadecimal}{Hexadecimal}*)|({Digito}*"."{Num}[eE]{Num})|({Digito}*"."{Num}"-"[eE]{Num})|({Num}[eE]{Digito}*)|({Num}"-"[eE]{Num}) {lexeme=yytext(); return Literal;}
{Numero}{Palabra} {lexeme=yytext(); return ERROR;}
0({Octal}*([8-9]|{Octal}[8-9]|[8-9]{Octal}){Octal}*)+ {lexeme=yytext(); return ERROR;} /*Se vuela los octales con digitos mayores a 7*/
{Numero} {lexeme=yytext(); return Literal;}


({Espacio}|[ \t\f])* {/*Ignore*/}

/* ESTO ES PARA EL ARBOL CON TILDE :)
({SKIPME}|[^\\\"\r|\n|\r\n ])({SKIPME}|{Palabra}|"*")*{Palabra} {lexeme=yytext(); return ERROR;}*/
. {lexeme=yytext(); return ERROR;}