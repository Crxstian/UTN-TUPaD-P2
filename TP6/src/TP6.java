/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        // EJercicio 1
        Inventario inventario = new Inventario();
        // 1. Crear y agregar 5 productos
        System.out.println("--- 1. Agregando productos ---");
        inventario.agregarProducto(new Producto("P001", "Laptop HP 15'", 2500, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P002", "Pack Manzanas", 1500, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P003", "Camiseta Deportiva", 1200, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Silla de Oficina", 2800, 5, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Mouse Inalámbrico", 800, 20, CategoriaProducto.ELECTRONICA));
        System.out.println("\n");

        // 2. Listar todos los productos
        System.out.println("--- 2. Listado de todos los productos ---");
        inventario.listarProductos();
        System.out.println("\n");

        // 3. Buscar un producto por ID
        System.out.println("--- 3. Buscar producto P003 ---");
        Producto pBuscado = inventario.buscarProductoPorId("P003");
        if (pBuscado != null) {
            pBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println("\n");

        // 4. Filtrar por categoría
        System.out.println("--- 4. Filtrar por ELECTRONICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        System.out.println("\n");

        // 5. Eliminar un producto y listar restantes
        System.out.println("--- 5. Eliminar P002 y listar restantes ---");
        inventario.eliminarProducto("P002"); // Adiós Manzanas
        inventario.listarProductos();
        System.out.println("\n");

        // 6. Actualizar el stock
        System.out.println("--- 6. Actualizar stock de P001 a 15 ---");
        inventario.actualizarStock("P001", 15);
        Producto pActualizado = inventario.buscarProductoPorId("P001");
        if (pActualizado != null) {
            pActualizado.mostrarInfo();
        }
        System.out.println("\n");

        // 7. Mostrar total de stock
        System.out.println("--- 7. Total de stock disponible ---");
        System.out.println("Stock total: " + inventario.obtenerTotalStock());
        System.out.println("\n");

        // 8. Obtener producto con mayor stock
        System.out.println("--- 8. Producto con mayor stock ---");
        Producto pMaxStock = inventario.obtenerProductoConMayorStock();
        if (pMaxStock != null) {
            System.out.println("El producto con más stock es:");
            pMaxStock.mostrarInfo();
        }
        System.out.println("\n");

        // 9. Filtrar productos por precio
        System.out.println("--- 9. Productos entre $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("\n");

        // 10. Mostrar categorías
        System.out.println("--- 10. Categorías disponibles ---");
        inventario.mostrarCategoriasDisponibles();
        
        
        // Ejercicio 2
        
        // 1. Creamos una biblioteca
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Mariano Moreno");
        System.out.println("Biblioteca '" + miBiblioteca.getNombre() + "' creada.\n"); // (getNombre() no fue pedido, pero es útil tenerlo)

        // 2. Crear al menos tres autores
        System.out.println("--- 2. Creando autores ---");
        Autor autor1 = new Autor("A01", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A02", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A03", "Stephen King", "Estadounidense");
        System.out.println("Autores creados.\n");

        // 3. Agregar 5 libros asociados a alguno de los Autores
        System.out.println("--- 3. Agregando 5 libros ---");
        miBiblioteca.agregarLibro("978-03073", "Cien años de soledad", 1967, autor1);
        miBiblioteca.agregarLibro("978-07475", "Harry Potter y la piedra filosofal", 1997, autor2);
        miBiblioteca.agregarLibro("978-03077", "El amor en los tiempos del cólera", 1985, autor1);
        miBiblioteca.agregarLibro("978-06708", "It (Eso)", 1986, autor3);
        miBiblioteca.agregarLibro("978-04390", "Harry Potter y la cámara secreta", 1998, autor2);
        System.out.println("\n");

        // 4. Listar todos los libros con su información
        System.out.println("--- 4. Listado de todos los libros ---");
        miBiblioteca.listarLibros();
        System.out.println("\n");

        // 5. Buscar un libro por su ISBN
        System.out.println("--- 5. Buscar libro '978-06708' ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-06708");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        System.out.println("\n");

        // 6. Filtrar y mostrar libros publicados en 1997
        System.out.println("--- 6. Filtrar libros del año 1997 ---");
        miBiblioteca.filtrarLibrosPorAnio(1997);
        System.out.println("\n");

        // 7. Eliminar un libro por su ISBN y listar los restantes
        System.out.println("--- 7. Eliminar '978-03073' y listar restantes ---");
        miBiblioteca.eliminarLibro("978-03073"); // Adiós Cien años de soledad
        miBiblioteca.listarLibros();
        System.out.println("\n");

        // 8. Mostrar la cantidad total de libros
        System.out.println("--- 8. Cantidad total de libros ---");
        System.out.println("Total de libros en la biblioteca: " + miBiblioteca.obtenerCantidadLibros());
        System.out.println("\n");

        // 9. Listar todos los autores de los libros disponibles
        System.out.println("--- 9. Listar autores disponibles ---");
        miBiblioteca.mostrarAutoresDisponibles();
        

    // --------Ejercicio 3
    
        // 1. y 2. Crear Universidad, Profesores y Cursos, y agregarlos
        System.out.println("--- 1 y 2. Creando y agregando entidades ---");
        Universidad uni = new Universidad("Universidad Tecnologica Nacional");

        Profesor p1 = new Profesor("P001", "Ana Gómez", "Bases de Datos");
        Profesor p2 = new Profesor("P002", "Luis Castro", "Programación");
        Profesor p3 = new Profesor("P003", "Marta Sol", "Redes");
        
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C101", "SQL Básico");
        Curso c2 = new Curso("C102", "Java I");
        Curso c3 = new Curso("C103", "Algoritmos");
        Curso c4 = new Curso("C104", "Redes TCP/IP");
        Curso c5 = new Curso("C105", "Java II");
        
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
        System.out.println("----------------------------------------------\n");


        // 3. Asignar profesores a cursos
        System.out.println("--- 3. Asignando profesores a cursos ---");
        uni.asignarProfesorACurso("C101", "P001"); // SQL -> Ana
        uni.asignarProfesorACurso("C102", "P002"); // Java I -> Luis
        uni.asignarProfesorACurso("C103", "P002"); // Algoritmos -> Luis
        uni.asignarProfesorACurso("C104", "P003"); // Redes -> Marta
        // C105 (Java II) queda sin asignar por ahora
        System.out.println("----------------------------------------------\n");


        // 4. Listar cursos con profesor y profesores con cursos
        System.out.println("--- 4. Listado de estado inicial ---");
        uni.listarCursos();
        uni.listarProfesores();
        System.out.println("----------------------------------------------\n");


        // 5. Cambiar el profesor de un curso
        System.out.println("--- 5. Cambiando profesor de 'Algoritmos' (C103) a Ana (P001) ---");
        uni.asignarProfesorACurso("C103", "P001");
        
        System.out.println("\n--- Verificación de cambio (Profesor Luis P002) ---");
        Profesor luis = uni.buscarProfesorPorId("P002");
        luis.mostrarInfo();
        luis.listarCursos(); // Ya no debe tener C103
        
        System.out.println("\n--- Verificación de cambio (Profesor Ana P001) ---");
        Profesor ana = uni.buscarProfesorPorId("P001");
        ana.mostrarInfo();
        ana.listarCursos(); // Ahora debe tener C101 y C103
        System.out.println("----------------------------------------------\n");


        // 6. Remover un curso
        System.out.println("--- 6. Eliminando curso 'Redes TCP/IP' (C104) ---");
        uni.eliminarCurso("C104");
        
        System.out.println("\n--- Verificación de eliminación (Profesor Marta P003) ---");
        Profesor marta = uni.buscarProfesorPorId("P003");
        marta.mostrarInfo();
        marta.listarCursos(); // Ya no debe tener C104
        System.out.println("----------------------------------------------\n");


        // 7. Remover un profesor
        System.out.println("--- 7. Eliminando profesor 'Ana Gómez' (P001) ---");
        uni.eliminarProfesor("P001");
        
        System.out.println("\n--- Verificación de eliminación (Listado de Cursos) ---");
        uni.listarCursos(); // C101 (SQL) y C103 (Algoritmos) deben figurar "Sin asignar"
        System.out.println("----------------------------------------------\n");


        // 8. Reporte: cantidad de cursos por profesor
        System.out.println("--- 8. Reporte: Cursos por profesor (restantes) ---");
        for (Profesor p : uni.getProfesores()) { // Solo quedan Luis y Marta
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }    
         
}
