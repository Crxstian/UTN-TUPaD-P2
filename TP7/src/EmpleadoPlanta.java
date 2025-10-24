/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class EmpleadoPlanta extends Empleado {
    
    private double sueldoBasico;
    private double bono;

    public EmpleadoPlanta(String nombre, String id, double sueldoBasico, double bono) {
        super(nombre, id);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }
    @Override
    public double calcularSueldo() {
        return this.sueldoBasico + this.bono;
    }
}