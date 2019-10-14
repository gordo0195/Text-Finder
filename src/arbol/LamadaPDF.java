/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author marco
 */
import java.io.IOException;

/**
 *
 * @author Azeem
 */
public class LamadaPDF {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        LectorPDF pdfManager = new LectorPDF();
        pdfManager.setFilePath("/home/marco/Descargas/Tarea #2 - Tutoria.pdf");
        try {
            String text = pdfManager.toText();
            System.out.println(text);
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }

}