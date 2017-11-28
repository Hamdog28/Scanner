package iiiproyecto;

import java.io.BufferedReader;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import jflex.SilentExit;

/**
 * @author ML & JL
 */
public class IIIProyecto {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        char c;
        String s;     
        System.out.println("*****************************************");
        System.out.println("*                                       *");
        System.out.println("*              JFLEX & CUP              *");
        System.out.println("*              Teamworking              *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");
        
        System.out.println();
        
        do {
            System.out.println("1. Compilar JFLEX & CUP");
            System.out.println("2. Analizar archivo");
            System.out.println("3. Salir");
            
            s = reader.nextLine();
            
            if (s.equals(""))
                break;
            
            c = s.toLowerCase().charAt(0);
            
            switch (c) {
                case '1':
                    compilarJFlexYCup();
                    System.exit(0);
                    break;
                case '2':
                    analizarArchivo();
                    System.exit(0);
                    break;
                case '3':
                    break;
                default:
                    System.out.println("No se ha reconocido la opción");
            }
            
        } while (c != '3');   
    }
    
    public static void compilarJFlexYCup() {
        String[] scannerFile = {"src\\iiiproyecto\\Lexer.flex"};
        String[] parserFile = {"-parser", "Parser", "-symbols", "Simbolos", "src\\iiiproyecto\\Parser.cup"};
                
        try {
            jflex.Main.generate(scannerFile);
            java_cup.Main.main(parserFile);
        } catch (SilentExit ex) {
            Logger.getLogger(IIIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IIIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(IIIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Files.move(Paths.get("Simbolos.java"), Paths.get("src\\iiiproyecto\\Simbolos.java"), REPLACE_EXISTING);
            Files.move(Paths.get("Parser.java"), Paths.get("src\\iiiproyecto\\Parser.java"), REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(IIIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void analizarArchivo() {
        
        String filePath = "test\\testFile2.txt";
                        
        try {
            Lexer lexer = new Lexer(new BufferedReader(new FileReader(filePath)));
            Parser parser = new Parser(lexer);
            
            parser.parse();
            
            System.out.println("Parseo finalizado");
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(IIIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            Logger.getLogger(IIIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
