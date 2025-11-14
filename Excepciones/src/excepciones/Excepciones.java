/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author HP
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Division segura:");
        DivisionSegura.ejecutar();

        System.out.println("Conversion de cadena a número:");
        ConversionCadena.ejecutar();

        System.out.println(" Lectura de archivo:");
        LecturaArchivo.ejecutar();

        System.out.println(" Validacion de edad:");
        ValidarEdad.ejecutar();

        System.out.println("Lectura con BufferedReader y try-with-resources:");
        LecturaSegura.ejecutar();
    }
        
        
       
    
    
    
}
