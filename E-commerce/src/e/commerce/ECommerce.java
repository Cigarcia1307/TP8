/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commerce;

import java.util.Arrays;



public class ECommerce {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Zapatillas", 15000.00);
        Producto p2 = new Producto("Campera", 22000.50);

        // Crear cliente
        Cliente cliente = new Cliente("Cintia", "3511234567");

        // Crear pedido
        Pedido pedido = new Pedido(Arrays.asList(p1, p2), cliente);

        // Calcular total
        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Cambiar estado y notificar
        pedido.setEstado("En preparacion");

        // Simular pago con tarjeta
        TarjetaCredito tarjeta = new TarjetaCredito("Cintia", "1234-5678-9012-3456", 50000);
        double totalConDescuento = tarjeta.aplicarDescuento(10); // 10% de descuento
        tarjeta.procesarPago(totalConDescuento);
    }
 }