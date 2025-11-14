/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ValidarEdad {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: debe estar entre 0 y 120.");
            }
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
