package iiproyecto;

import java_cup.runtime.*;

%%

/* Nombre de la clase */
%class Scanner

/* Leer archivos de texto */
%unicode

/* Compatibilidad con CUP */
%cup
%cupsym Simbolos

/* Poder acceder a cantidad de carácteres, lineas y columnas */
%char
%line
%column

/* Código personalizado */
%{

%}

%eofval{
  return new java_cup.runtime.Symbol(Simbolos.EOF);
%eofval}

/* Definición de variables */

%%

/* Sección de palabras reservadas */
";" { return new Symbol(Simbolos.coma, yycolumn, yyline, yytext()); }