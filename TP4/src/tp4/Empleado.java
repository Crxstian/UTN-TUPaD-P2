/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Cristian
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private Double salario;
    
    private static int contadorEmpleados = 0;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, Double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    }

    public Empleado(String nombre, String puesto) {
        this.id= ++contadorEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 800.0;
        totalEmpleados ++;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    public void actualizarSalario(double porcentaje){
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
            }
    }
    
    public void actualizarSalario(int cantidadFija){
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
            }
    }

    @Override
    public String toString() {
        return "Empleado{" + "id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", salario: " + salario + '}';
    }
    
    
    
    
    
    
    
}
