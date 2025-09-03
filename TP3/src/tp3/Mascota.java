/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Cristian
 */
public class Mascota {
    private String nombre;
    private String especie;
    private Integer edad;

    public Mascota(String nombre, String especie, Integer edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Especie: "+this.especie);
        System.out.println("Edad: "+this.edad);
    }
    public void cumplirAnios(){
        this.edad ++;
        System.out.println("Ahora la edad es de "+this.edad+ " Años");
    }
}
