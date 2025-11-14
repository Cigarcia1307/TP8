/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce;

import java.util.List;


/**
 *
 * @author HP
 */
public class Pedido implements Pagable{
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(List<Producto> productos, Cliente cliente) {
        this.productos = productos;
        this.cliente = cliente;
    }

    
    
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El estado de tu pedido cambio a: " + nuevoEstado);
        }
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    
}
