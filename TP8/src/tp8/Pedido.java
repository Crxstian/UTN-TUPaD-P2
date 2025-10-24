/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Pedido implements Pagable{
    
    private List<Producto> productos;
    private Cliente cliente; // Referencia al cliente para notificarle
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Creado";
        // Notificamos al crear el pedido
        notificarCambioDeEstado("Pedido " + this.hashCode() + " ha sido Creado.");
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        notificarCambioDeEstado("Producto '" + p.getNombre() + "' agregado.");
    }    

    @Override
    public double calculartotal() {
    double total = 0;
        for (Producto p : productos) {
            total += p.calculartotal(); // Llama al calcularTotal() de cada producto
        }
        return total;        
    }
    
    // Método para notificar al cliente
    private void notificarCambioDeEstado(String mensaje) {
        this.estado = mensaje;
        if (this.cliente != null) {
            this.cliente.notificar("El estado de su pedido cambió: " + this.estado);
        }
    }
}
