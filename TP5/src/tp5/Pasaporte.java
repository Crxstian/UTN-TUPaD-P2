/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author Cristian
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composicion 1:1 
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen,formato); // Se crea internamente
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void cambiarFoto(String imagen, String formato) {
        this.foto = new Foto(imagen,formato);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular!=null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);   
        }
    }
    
}
