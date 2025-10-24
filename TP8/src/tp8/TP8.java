package tp8;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class TP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Parte 1
        System.out.println("--- Parte 1: E-Commerce ---");
        // 5. Crear Cliente que implementa Notificable
        Cliente cliente1 = new Cliente("Ana");
        // 3. Crear Pedido (que implementa Pagable y notifica)
        Pedido pedido1 = new Pedido(cliente1);
        // 2. Crear Productos (que implementan Pagable)
        Producto laptop = new Producto("Laptop Pro", 1200.50);
        Producto mouse = new Producto("Mouse USB", 25.00);
        pedido1.agregarProducto(laptop);
        pedido1.agregarProducto(mouse);
        System.out.println("---------------------------------");
        // 1. Usar polimorfismo de Pagable
        double totalPedido = pedido1.calculartotal();
        System.out.println("TOTAL DEL PEDIDO: $" + String.format("%.2f", totalPedido));
        System.out.println("---------------------------------");
        // 4. Usar polimorfismo de Pago
        // Opción 1: Pagar con Tarjeta (sin descuento)
        Pago pagoTarjeta = new TarjetaCredito();
        pagoTarjeta.procesarPago(totalPedido);
        System.out.println("...");
        // Opción 2: Pagar con PayPal (con descuento)
        PagoConDescuento pagoPayPal = new PayPal();
        pagoPayPal.procesarPago(totalPedido);
        
        // Parte 2
        
        Scanner scanner = new Scanner(System.in);

        // --- Ejercicio 1: División segura ---
        System.out.println("\n--- Ejercicio 1: División Segura ---");
        ejercicio1_DivisionSegura(scanner);

        // --- Ejercicio 2: Conversión de cadena ---
        System.out.println("\n--- Ejercicio 2: Conversión de Cadena ---");
        ejercicio2_Conversion(scanner);

        // --- Ejercicio 3: Lectura de archivo ---
        System.out.println("\n--- Ejercicio 3: Lectura de Archivo (Cierre Manual) ---");
        ejercicio3_LecturaArchivo();
        
        // --- Ejercicio 4: Excepción personalizada ---
        System.out.println("\n--- Ejercicio 4: Excepción Personalizada ---");
        ejercicio4_ExcepcionPersonalizada(scanner);

        // --- Ejercicio 5: Uso de try-with-resources ---
        System.out.println("\n--- Ejercicio 5: Lectura de Archivo (try-with-resources) ---");
        ejercicio5_TryWithResources();
        
        scanner.close();
        System.out.println("\n--- FIN DEL PROGRAMA ---");
    }

    // 1. División segura (Manejo de ArithmeticException)
    public static void ejercicio1_DivisionSegura(Scanner scanner) {
        try {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();
            
            System.out.print("Introduce el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir números enteros.");
            scanner.next(); // 
        }
    }

    // 2. Conversión de cadena (Manejo de NumberFormatException)
    public static void ejercicio2_Conversion(Scanner scanner) {
        try {
            System.out.print("Introduce un número (como texto): ");
            String texto = scanner.next();
            
            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un formato de número válido.");
        }
    }

    // 3. Lectura de archivo (Manejo de FileNotFoundException)
    public static void ejercicio3_LecturaArchivo() {
    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader("archivo_ej3.txt"));
        System.out.println("Archivo 'archivo_ej3.txt' encontrado. Leyendo...");
        
        // Leer solo la primera línea
        String linea = br.readLine();
        System.out.println(linea);  // Imprime directamente la única línea
        
    } catch (FileNotFoundException e) {
        System.out.println("Error: El archivo 'archivo_ej3.txt' no se ha encontrado.");
    } catch (IOException e) {
        System.out.println("Error de lectura: " + e.getMessage());
    } finally {
        if (br != null) {
            try {
                br.close();
                System.out.println("Recurso cerrado.");
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
}
    // 4. Excepción personalizada (Lanzar y capturar EdadInvalidaException)
    public static void ejercicio4_ExcepcionPersonalizada(Scanner scanner) {
        try {
            System.out.print("Introduce una edad (0-120): ");
            int edad = scanner.nextInt();
            
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
            }
            System.out.println("Edad ingresada: " + edad + " (Válida)");
        } catch (EdadInvalidaException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número entero.");
            scanner.next(); 
        }
    }

    // 5. Uso de try-with-resources (Manejo de IOException)
    public static void ejercicio5_TryWithResources() {
    try (BufferedReader br = new BufferedReader(new FileReader("archivo_ej5.txt"))) {
        System.out.println("Leyendo 'archivo_ej5.txt' con try-with-resources...");
        // Leer solo la primera línea
        String linea = br.readLine();
        System.out.println(linea);  

    } catch (FileNotFoundException e) {
        System.out.println("Error: El archivo 'archivo_ej5.txt' no se ha encontrado.");
    } catch (IOException e) {
        System.out.println("Error de E/S (I/O) al leer el archivo.");
    }
}
    
}
