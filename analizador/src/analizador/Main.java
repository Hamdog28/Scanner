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
        //String path = "C:/Users/MaríaLaura/Desktop/analizador_1/src/analizador/Lexer.flex";
        String path = "C:/Users/Estuche/Dropbox/NetBeansProjects/Scanner/analizador/src/analizador/Lexer.flex";
        generarLexer(path);
        probarLexerFile();

    }
    public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
    public static void probarLexerFile() throws IOException{
        int linea=0;
        tokenslist = new LinkedList<identificador>();
        operadores = new LinkedList<identificador>();
        identificadores = new LinkedList<identificador>();
        palabrasReservadas = new LinkedList<identificador>();
        literales = new LinkedList<identificador>();
        errores = new LinkedList<identificador>();
        identificador tokenitem=new identificador();
        
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);
        String resultado="";
        
        while (true){
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
                case SaltoDeLinea:
                    linea++;
                    break;
                case ERROR:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    errores.add(tokenitem);
                    //resultado=resultado+ "<< " + lexer.lexeme + ">> ";
                    resultado=resultado+ "Error, simbolo no reconocido ";
                    //System.out.println("<< " + lexer.lexeme + ">> ");
                    break;
                case LlaveI: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    resultado=resultado+ "< " + lexer.lexeme + "> ";
                    break;
                }
                case ParentesisI: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    resultado=resultado+ "< " + lexer.lexeme + "> ";
                    break;
                }
                case ParentesisD: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    operadores.add(tokenitem);
                    resultado=resultado+ "< " + lexer.lexeme + "> ";
                    break;
                }
                case PalabraReservada: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    palabrasReservadas.add(tokenitem);
                    resultado=resultado+ "< " + lexer.lexeme + "> ";
                    break;
                }
                case ID: {
                    
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    tokenslist.add(tokenitem);
                    resultado=resultado+ "<" + lexer.lexeme + linea+ "> ";
                    break;
                }
                case INT:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    literales.add(tokenitem);
                    resultado=resultado+ "< " + lexer.lexeme + "> ";
                    break;
                default:
                    resultado=resultado+ "<"+ lexer.lexeme + "> ";
            }
    }
 }
}
