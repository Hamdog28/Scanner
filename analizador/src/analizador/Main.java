/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static List<identificador> tokenslist;
    static List<identificador> operadores;
    static List<identificador> identificadores;
    static List<identificador> palabrasReservadas;
    static List<identificador> literales;
    static List<identificador> errores;
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/MaríaLaura/Documents/Scanner/analizador/src/analizador/Lexer.flex";
        //String path = "C:/Users/Estuche/Dropbox/NetBeansProjects/Scanner/analizador/src/analizador/Lexer.flex";
        generarLexer(path);
        probarLexerFile();

    }
    public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
    public static void probarLexerFile() throws IOException{
        int linea=1;
        tokenslist = new LinkedList<identificador>();
        operadores = new LinkedList<identificador>();
        identificadores = new LinkedList<identificador>();
        palabrasReservadas = new LinkedList<identificador>();
        literales = new LinkedList<identificador>();
        errores = new LinkedList<identificador>();
        
        
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);
        String resultado="";
        
        while (true){
            identificador tokenitem=new identificador();
            Token token =lexer.yylex();
            
            if (token == null)
                break;
            
            System.out.println(token);
            /*
            if (token == null){
                for(int i=0;i<tokenslist.size();i++){
                    System.out.println(tokenslist.get(i).nombre + "=" + tokenslist.get(i).ID);
                }
                System.out.println(resultado);
                return;
            }*/
            switch (token){
                case Comentario:{
                    resultado = lexer.lexeme;
                    String[] lines = resultado.split("\r\n|\r|\n");
                    linea+=(lines.length)-1;
                    break;
                }
                case SaltoDeLinea:{
                    linea++;
                    break;
                }
                case ERROR:{
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    errores.add(tokenitem);
                    resultado=resultado+ "Error, simbolo no reconocido ";
                    break;
                }
                case LlaveI: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case LlaveD: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case ParentesisI: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case ParentesisD: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case ParentesisCI: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case ParentesisCD: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case PuntoComa: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case Identificador: {
                    resultado=lexer.lexeme;
                    if(resultado.substring(resultado.length() - 1)==" ")
                        resultado = resultado.replace(resultado.substring(resultado.length()-1), "");
                    tokenitem.nombre=resultado;
                    tokenitem.ID=linea;
                    identificadores.add(tokenitem);
                    break;
                }
                case Operador: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    break;
                }
                case PalabraReservada: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    palabrasReservadas.add(tokenitem);
                    break;
                }
                case ID: {
                    
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    literales.add(tokenitem);
                    break;
                }
                case Literal:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    literales.add(tokenitem);
                    break;
                default:
                    resultado=resultado+ "<"+ lexer.lexeme + "> ";
            }
            
    }
            System.out.println("operadores");
            for(int i=0;i<operadores.size();i++){
                System.out.println(operadores.get(i).nombre + "=" + operadores.get(i).ID);
            }
            System.out.println("palabras reservadas");
            for(int i=0;i<palabrasReservadas.size();i++){
                System.out.println(palabrasReservadas.get(i).nombre + "=" + palabrasReservadas.get(i).ID);
            }
            System.out.println("literales");
            for(int i=0;i<literales.size();i++){
                System.out.println(literales.get(i).nombre + "=" + literales.get(i).ID);
            }
            System.out.println("identificadores");
            for(int i=0;i<identificadores.size();i++){
                System.out.println(identificadores.get(i).nombre + "=" + identificadores.get(i).ID);
            }
            
            
 }
}
