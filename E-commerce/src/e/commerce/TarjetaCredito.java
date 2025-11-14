/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce;

/**
 *
 * @author HP
 */
public class TarjetaCredito implements PagoConDescuento{
    private String titular;
    private String numero;
    private double montoDisponible;

    public TarjetaCredito(String titular, String numero, double montoDisponible) {
        this.titular = titular;
        this.numero = numero;
        this.montoDisponible = montoDisponible;
    }
    
    @Override
    public void procesarPago(double monto) {
        if (monto <=montoDisponible){
            montoDisponible -= monto;
            System.out.println("Pago porcesado con tarejta. Monto restante: $ " + montoDisponible);
            
        }else{
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        // lógica para calcular descuento
        return montoDisponible * (1 - porcentaje / 100);
    }

    
    
}
