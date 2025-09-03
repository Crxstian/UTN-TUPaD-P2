/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Cristian
 */
public class NaveEspacial {
    private String nombre;
    private Integer combustible;

    public NaveEspacial(String nombre, Integer combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCombustible() {
        return combustible;
    }

    public void setCombustible(Integer combustible) {
        this.combustible = combustible;
    }
    
    public void despegar(){
        System.out.println("La nave espacial esta despegando");
    }
    public void avanzar(int distancia){
        if (this.combustible < distancia) {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades");
        } else {
            System.out.println("La nave espacial avanza " + distancia + " unidades");
            this.combustible -= distancia;
            }
    }
    
    public void recargarCombustible(int cantidad){
        if (this.combustible <50 && ((this.combustible +cantidad)<=50)) {
            System.out.println("Cargando combustible...");
            combustible +=cantidad;
        }else{
            System.out.println("El combustible esta completo o no es posible cargar esa cantidad");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de Nave Espacial: "+this.nombre);
        System.out.println("Cantidad de Combustible: "+this.combustible + " unidades");
    }
}
