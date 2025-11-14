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
public class DivisionSegura {
    public static void ejecutar (){
        Scanner scanner =new Scanner (System.in);
        try{
            System.out.println("Ingrese un numero para el dividendo:");
            int a = scanner.nextInt();
            System.out.println("Ingrese un nuemro oara el divisor:");
            int b= scanner.nextInt();
            int resultado = a/b;
            System.out.println("El resultado es : " +resultado);
        }catch (ArithmeticException e){
            System.out.println("No se peude dividir");
        }
    }
    
}
