/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class EmpleadoTemporal extends Empleado {
    
    private double precioPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String id, double precioPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public double calcularSueldo() {
        return this.precioPorHora * this.horasTrabajadas;
    }
}
