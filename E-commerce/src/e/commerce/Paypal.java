/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce;

/**
 *
 * @author HP
 */
public class Paypal implements Pago{
    private String telefono;
    private double saldo;

    public Paypal(String telefono, double saldo) {
        this.telefono = telefono;
        this.saldo = saldo;
    }
    
    
    

    @Override
    public void procesarPago(double monto) {
        // lógica para descontar del saldo
    }
    
}
