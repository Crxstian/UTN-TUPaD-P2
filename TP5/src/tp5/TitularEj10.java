/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class TitularEj10 {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public TitularEj10(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria!=null && cuentaBancaria.getTitular()!=this) {
            cuentaBancaria.setTitular(this);
        }
    }
}
