/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class Calculadora {
    public void calcular(Impuesto impuesto ){
                String nombre = (impuesto.getContribuyente() != null)
                ? impuesto.getContribuyente().getNombre()
                : "(sin contribuyente)";
        System.out.println("Calculando impuesto de " + nombre +" por monto $" + impuesto.getMonto());
    }
}
