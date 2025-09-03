/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Cristian
 */
public class Gallina {
    private Integer idGallina;
    private Integer edad;
    private Integer huevosPuestos;

    public Gallina(Integer idGallina, Integer edad, Integer huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public Integer getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(Integer idGallina) {
        this.idGallina = idGallina;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(Integer huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    public void ponerHuevo(){
        this.huevosPuestos ++;
        System.out.println("La cantidad de huevos puestos por la gallina con id "+this.idGallina+ " ahora es: "+this.huevosPuestos);
    }
    public void envejecer(){
        this.edad --;
        System.out.println("La gallina con id "+this.idGallina+ " envejecio y ahora tiene "+this.edad+" años de edad");

    }
    public void mostrarEstado(){
        System.out.println("ID de Gallina: "+this.idGallina);
        System.out.println("Edad: "+this.edad);
        System.out.println("Cantidad de huevos puestos: "+this.huevosPuestos);
    }
}
