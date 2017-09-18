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
    
    //Listas para tokens y errores
    static List<Identificador> tokenslist;
    static List<Identificador> tokenserror;

    public static void main(String[] args) throws IOException {
        String path = "C:/Users/MaríaLaura/Documents/Scanner/analizador/src/analizador/Lexer.flex";
       // String path = "C:/Users/Estuche/Dropbox/NetBeansProjects/Scanner/analizador/src/analizador/Lexer.flex";
        generarLexer(path);
        scanLexerFile();
        imprimirTokens();
        imprimirErrores();
    }

    //Actualiza el Lexer.java
    public static void generarLexer(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }

    public static void scanLexerFile() throws IOException {
        int linea = 1;
        tokenslist = new LinkedList<>();
        tokenserror = new LinkedList<>();

        //Abrir el archivo
        //String file = "test\\ArbolesRecursion.txt";
        //String file = "test\\DisplayOwnSource.txt";
        String file = "test\\HolaMundo.txt";
        //String file = "test\\SinSaltoDeLinea.txt";
        //String file = "test\\SumaMatriz.txt";
        //String file = "test\\Tokens.txt";
        
        Reader reader = new BufferedReader(new FileReader(file));
        Lexer lexer = new Lexer(reader);
        //String resultado = "";

        //Iterar por cada token
        while (true) {
            Identificador tokenitem = new Identificador();
            Token token = lexer.yylex();

            if (token == null) {
                break;
            }
            
            //Se toman los datos del token
            tokenitem.nombre = lexer.lexeme;
            tokenitem.linea = linea;
            tokenitem.categoria = token;

            //Se decide el tipo de token
            switch (token) {
                case Comentario: {
                    String resultado = lexer.lexeme;
                    String[] lines = resultado.split("\r\n|\r|\n");
                    linea += (lines.length) - 1;
                    break;
                }
                case SaltoDeLinea: {
                    linea++;
                    break;
                }
                case ERROR: {
                    String resultado= lexer.lexeme;
                    int aux=resultado.charAt(0);
                    tokenitem.tipo = "Error";
                    tokenserror.add(tokenitem);
                    System.out.println("estoo" + aux + "abc");
                    break;
                }
                case LlaveI: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case LlaveD: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisI: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisD: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisCI: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case ParentesisCD: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case PuntoComa: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case Identificador: {
                    tokenitem.tipo = "Identificador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case Operador: {
                    tokenitem.tipo = "Operador";
                    tokenslist.add(tokenitem);
                    break;
                }
                case PalabraReservada: {
                    tokenitem.tipo = "Palabra Reservada";
                    tokenslist.add(tokenitem);
                    break;
                }
                case ID: {
                    tokenitem.tipo = "Literal";
                    tokenslist.add(tokenitem);
                    break;
                }
                case Literal:
                    tokenitem.tipo = "Literal";
                    tokenslist.add(tokenitem);
                    break;
                default:
            }

        }

    }

    //Función que imprime los tokens, su categoria y línea
    static void imprimirTokens() {

        int ultimaLinea;
        int repeticiones;

        for (int i = 0; i < tokenslist.size(); i++) {
            System.out.print(tokenslist.get(i).nombre + "\t" + tokenslist.get(i).tipo + "\t" + tokenslist.get(i).linea);

            ultimaLinea = tokenslist.get(i).linea;
            repeticiones = 1;

            for (int j = i + 1; j < tokenslist.size(); j++) {
                
                if ((tokenslist.get(i).nombre.equals(tokenslist.get(j).nombre)
                        && ultimaLinea != tokenslist.get(j).linea || (j + 1) == tokenslist.size())
                        && repeticiones > 1) {
                    System.out.print("(" + repeticiones + ")");
                }
                
                if (tokenslist.get(i).nombre.equals(tokenslist.get(j).nombre) && ultimaLinea == tokenslist.get(j).linea) {
                    tokenslist.remove(j);
                    repeticiones++;
                    j--;
                } else if (tokenslist.get(i).nombre.equals(tokenslist.get(j).nombre) && ultimaLinea != tokenslist.get(j).linea) {
                    System.out.print(", " + tokenslist.get(j).linea);
                    ultimaLinea = tokenslist.get(j).linea;
                    tokenslist.remove(j);
                    repeticiones = 1;
                    j--;
                }
                
            }

            System.out.println();
        }
    }
    
    //Función que imprime los errores lexicos
    static void imprimirErrores() {
        
        System.out.println("ERRORES");
        
        if (tokenserror.isEmpty()) {System.out.println("Ningún error ha sido hallado");}
        
        for (int i = 0; i < tokenserror.size(); i++) {
            System.out.println("Token desconocido en la linea " + tokenserror.get(i).linea + ": " + tokenserror.get(i).nombre);
        }
    }
}