package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * @param args the command line arguments
     */
    static List<Identificador> tokenslist;
    static List<Identificador> operadores;
    static List<Identificador> identificadores;
    static List<Identificador> palabrasReservadas;
    static List<Identificador> literales;
    static List<Identificador> errores;
    
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
        int linea=1;
        tokenslist = new LinkedList<Identificador>();
        operadores = new LinkedList<Identificador>();
        identificadores = new LinkedList<Identificador>();
        palabrasReservadas = new LinkedList<Identificador>();
        literales = new LinkedList<Identificador>();
        errores = new LinkedList<Identificador>();
        Identificador tokenitem=new Identificador();
        
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);
        
        while (true) {
            
            Token token = lexer.yylex();
            
            if (token == null)
                break;
            
            System.out.println(token);
            
            switch (token){
                case SaltoDeLinea:
                    linea++;
                    break;
                case ERROR:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    errores.add(tokenitem);
                    break;
                case LlaveI: {
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
                case PalabraReservada: {
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    palabrasReservadas.add(tokenitem);
                    break;
                }
                case ID: {
                    
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    tokenslist.add(tokenitem);
                    break;
                }
                case INT:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=linea;
                    literales.add(tokenitem);
                    break;
            }
        }
    }
}
