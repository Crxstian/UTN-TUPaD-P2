/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author Cristian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Cristian","Siles","Programacion 2",8);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(2);
        estudiante.bajarCalificacion(3);
        
        Mascota mascota = new Mascota("Luna", "Gato",5);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        
        Libro libro = new Libro("El hobbit", "J.K Rowling", 2005);
        libro.setAnioPublicacion(2026);
        libro.setAnioPublicacion(2024);
        
        Gallina gallina1 = new Gallina(1,5,45);
        Gallina gallina2 = new Gallina(2,4,33);
       
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        NaveEspacial naveEspacial = new NaveEspacial("Apolo 17", 0);
       
        naveEspacial.avanzar(50); 
        naveEspacial.recargarCombustible(50); 
        naveEspacial.avanzar(10); 
        naveEspacial.despegar();
        naveEspacial.mostrarEstado();
    }
    
}
