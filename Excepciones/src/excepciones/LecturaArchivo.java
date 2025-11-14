/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LecturaArchivo {
    public static void ejecutar() {
        try {
            File archivo = new File("archivo.txt");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
    
}
