/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class CuentaBancaria {
    private String cbu;
    private Double saldo;
    private ClaveSeguridad claveSeguridad;
    private TitularEj10 titular;

    public CuentaBancaria(String cbu, Double saldo,String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public TitularEj10 getTitular() {
        return titular;
    }

    public void setTitular(TitularEj10 titular) {
        this.titular = titular;
        if (titular!=null && titular.getCuentaBancaria()!=this) {
            titular.setCuentaBancaria(this);
        }
    }
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }
}
