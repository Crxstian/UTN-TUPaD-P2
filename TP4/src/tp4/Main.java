/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Cristian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Cristian", "Desarrollador", 700.0);
        Empleado empleado2 = new Empleado("Lucas", "Analista");
        
        Empleado empleado3 = new Empleado(3, "Federico", "Tester", 900.0);
        Empleado empleado4 = new Empleado("Julian", "Tech lead");
        //Diferenciamos los metodos por el tipo de dato del parametro, 
        //double es porcentaje e int es cantidad fija
        empleado1.actualizarSalario(200);
        empleado2.actualizarSalario(30.0);
        empleado3.actualizarSalario(150);
        empleado4.actualizarSalario(25.0);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        
        System.out.println("La cantidad total de empleados es: "+Empleado.mostrarTotalEmpleados());
        
        
    }
    
}
