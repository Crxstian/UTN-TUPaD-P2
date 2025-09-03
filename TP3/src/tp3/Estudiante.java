/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Cristian
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private Integer calificacion;

    public Estudiante(String nombre, String apellido, String curso, Integer calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificacion: " + this.calificacion);
    }

    public void bajarCalificacion(int puntos) {
        this.calificacion -= puntos;
        System.out.println("Se bajo la califiacion, ahora es: "+this.calificacion);
    }

    public void subirCalificacion(int puntos) {
        this.calificacion += puntos;
        System.out.println("Se subio la califiacion, ahora es: "+this.calificacion);
    }
}
