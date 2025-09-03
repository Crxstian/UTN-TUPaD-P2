/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Cristian
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer anioPublicacion;    

    public Libro(String titulo, String autor, Integer anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio) {
        int anioActual = java.time.Year.now().getValue();
        if (anio<= anioActual){
            this.anioPublicacion = anio;
            System.out.println("Se cambio el año de publicacion correctamente a: "+this.anioPublicacion);
        }else{
            System.out.println("Año de publicación inválido: " + anio);
        }
    } 
}
