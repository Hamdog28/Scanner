package iiproyecto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.SilentExit;
/**
 * @author ML & JL
 */
public class IIProyecto {

    public static void main(String[] args) {
        String[] scannerFile = {"src\\iiproyecto\\Scanner.flex"};
        String[] parserFile = {"-parser", "Parser", "-symbols", "Simbolos", "src\\iiproyecto\\Parser.cup"};
        
        try {
            jflex.Main.generate(scannerFile);
            java_cup.Main.main(parserFile);
        } catch (SilentExit ex) {
            Logger.getLogger(IIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(IIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Files.move(Paths.get("Simbolos.java"), Paths.get("src\\iiproyecto\\Simbolos.java"), REPLACE_EXISTING);
            Files.move(Paths.get("Parser.java"), Paths.get("src\\iiproyecto\\Parser.java"), REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(IIProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
