package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ML && JL
 */
public class Main {
    
    static List<Identificador> tokenslist;
    //static List<Identificador> operadores;
    //static List<Identificador> identificadores;
    //static List<Identificador> palabrasReservadas;
    //static List<Identificador> literales;
    //static List<Identificador> errores;

    public static void main(String[] args) throws IOException {
        //String path = "C:/Users/MaríaLaura/Documents/Scanner/analizador/src/analizador/Lexer.flex";
        String path = "C:/Users/Estuche/Dropbox/NetBeansProjects/Scanner/analizador/src/analizador/Lexer.flex";
        generarLexer(path);
        probarLexerFile();
        System.out.println("\n\n\n");
        imprimir();
    }

    public static void generarLexer(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }

    public static void probarLexerFile() throws IOException {
        int linea = 1;
        tokenslist = new LinkedList<>();
        //operadores = new LinkedList<Identificador>();
        //identificadores = new LinkedList<Identificador>();
        //palabrasReservadas = new LinkedList<Identificador>();
        //literales = new LinkedList<Identificador>();
        //errores = new LinkedList<Identificador>();

        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer(reader);
        String resultado = "";

        while (true) {
            Identificador tokenitem = new Identificador();
            Token token = lexer.yylex();

            if (token == null) break;

            /*
            if (token == null){
                for(int i=0;i<tokenslist.size();i++){
                    System.out.println(tokenslist.get(i).nombre + "=" + tokenslist.get(i).ID);
                }
                System.out.println(resultado);
                return;
            }*/
            
            tokenitem.nombre = lexer.lexeme;
            tokenitem.linea = linea;
            tokenitem.categoria = token;
            
            switch (token) {
                case Comentario: {
                    resultado = lexer.lexeme;
                    String[] lines = resultado.split("\r\n|\r|\n");
                    linea += (lines.length) - 1;
                    break;
                }
                case SaltoDeLinea: {
                    linea++;
                    break;
                }
                case ERROR: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Error";
                    
                    //errores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    resultado = resultado + "Error, simbolo no reconocido ";
                    break;
                }
                case LlaveI: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";
                    System.out.println("ML" + linea);
                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case LlaveD: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";
                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisI: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";

                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisD: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";

                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisCI: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";
                    
                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisCD: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";
                    
                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case PuntoComa: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";
                    
                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case Identificador: {
                    resultado = lexer.lexeme;
                    if (resultado.substring(resultado.length() - 1) == " ") {
                        resultado = resultado.replace(resultado.substring(resultado.length() - 1), "");
                    }
                    //tokenitem.nombre = resultado;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Identificador";
                    
                    //identificadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case Operador: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Operador";
                    
                    //operadores.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case PalabraReservada: {
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Palabra Reservada";
                    
                    //palabrasReservadas.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case ID: {

                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Literal";
                    
                    //literales.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                }
                case Literal:
                    //tokenitem.nombre = lexer.lexeme;
                    //tokenitem.linea = linea;
                    //tokenitem.categoria = token;
                    tokenitem.tipo = "Literal";
                    
                    //literales.add(tokenitem);
                    tokenslist.add(tokenitem);
                    break;
                default:
                    resultado = resultado + "<" + lexer.lexeme + "> ";
            }

        }
        System.out.println("operadores");
        for (int i = 0; i < tokenslist.size(); i++) {
            System.out.println(tokenslist.get(i).nombre + " - " + tokenslist.get(i).tipo + " - " + tokenslist.get(i).categoria + " - " + tokenslist.get(i).linea);
        }
    }
    
    static void imprimir() {
        
        int ultimaLinea;
        int repeticiones;
        
        for (int i = 0; i < tokenslist.size(); i++) {
            System.out.print(tokenslist.get(i).nombre + "\t" + tokenslist.get(i).tipo + "\t" + tokenslist.get(i).linea);
            
            ultimaLinea = tokenslist.get(i).linea;
            repeticiones = 1;
            
            for (int j = i + 1; j < tokenslist.size(); j++) {
                
                if (tokenslist.get(i).nombre.equals(tokenslist.get(j).nombre) && ultimaLinea == tokenslist.get(j).linea) {
                    repeticiones++;
                    tokenslist.remove(j);
                    j--;
                }
                else if (ultimaLinea != tokenslist.get(j).linea && repeticiones > 1) {
                    System.out.print("(" + repeticiones + ")");
                    repeticiones = 0;
                    ultimaLinea = tokenslist.get(j).linea;
                    j--;
                }
                else if (tokenslist.get(i).nombre.equals(tokenslist.get(j).nombre) && ultimaLinea != tokenslist.get(j).linea) {
                    System.out.print(", " + tokenslist.get(j).linea);
                    tokenslist.remove(j);
                    j--;
                }
            }
            
            System.out.println();
        }
    }
}
