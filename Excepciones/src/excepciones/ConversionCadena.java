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
public class ConversionCadena {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para ser convertido a entero: ");
        String texto = scanner.nextLine();
        try {
            int textoConvertido = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + textoConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no valida. No es un numero entero.");
        }
    }
    
}
