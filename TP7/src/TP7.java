
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class TP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kata 1
        System.out.println("--- KATA 1: Vehículos y Herencia Básica ---");
        // Tarea: Instanciar un auto y mostrar su información
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();
        System.out.println("--------------------------------------------\n");
        
        
        
        // Kata 2
        System.out.println("--- KATA 2: Figuras y Métodos Abstractos ---");
        // Upcasting: Guardamos objetos 'Circulo' y 'Rectangulo' en un array 'Figura'
        Figura[] figuras = {
            new Circulo("Círculo 1", 10.0),
            new Rectangulo("Rectángulo 1", 5.0, 8.0)
        };
        for (Figura fig : figuras) {
            System.out.println("Área de " + fig.getNombre() + ": " + fig.calcularArea());
        }
        System.out.println("--------------------------------------------\n");
        
        
        // Kata 3
        System.out.println("--- KATA 3: Empleados y Polimorfismo (con instanceof) ---");
        // Upcasting: Guardamos objetos de subclases en una lista de la superclase
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", "P001", 3000, 500));
        empleados.add(new EmpleadoTemporal("Luis", "T001", 20, 80));

        for (Empleado emp : empleados) {
            System.out.println("Calculando sueldo de " + emp.getNombre() + "...");
            System.out.println("Sueldo: $" + emp.calcularSueldo());

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("-> Es un empleado de planta.");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("-> Es un empleado temporal.");
            }
            System.out.println(); 
        }
        System.out.println("--------------------------------------------\n");
        
        
        // Kata 4
        System.out.println("--- KATA 4: Animales y Comportamiento Sobrescrito ---");
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro("Fido"));
        granja.add(new Gato("Michi"));
        granja.add(new Vaca("Lola"));
        granja.add(new Animal("Genérico")); // Para ver el método base

        for (Animal animal : granja) {
            System.out.print(animal.nombre + " dice: ");
            // Java llama al hacerSonido() de la clase correcta
            animal.hacerSonido(); 
        }
        System.out.println("--------------------------------------------\n");
    }
    
}
