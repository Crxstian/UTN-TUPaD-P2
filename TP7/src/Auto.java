/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        // 'super()' debe ser la primera línea
        // Llama al constructor de Vehiculo(marca, modelo)
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }
    @Override
    public void mostrarInfo() {
        // 1. Llama al método original de la superclase
        super.mostrarInfo(); 
        // 2. Añade la información específica de 'Auto'
        System.out.println("Puertas: " + this.cantidadPuertas);
    }
    
}
