
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Biblioteca {

private String nombre;
    private List<Libro> libros; // Composición

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // La Biblioteca es responsable de crear Libros
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca.");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca '" + this.nombre + "' no tiene libros.");
            return;
        }
        System.out.println("--- Catálogo de la Biblioteca: " + this.nombre + " ---");
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro; // Lo encontramos
            }
        }
        return null; // No se encontró
    }

    public void eliminarLibro(String isbn) {
    Iterator<Libro> iterator = this.libros.iterator();
    boolean eliminado = false;
    
    while (iterator.hasNext()) {
        Libro libro = iterator.next();
        if (libro.getIsbn().equals(isbn)) {
            iterator.remove();  // Elimina el elemento actual del iterator
            eliminado = true;
        }
    }
    if (eliminado) {
        System.out.println("Libro con ISBN " + isbn + " eliminado.");
    } else {
        System.out.println("No se encontró libro con ISBN " + isbn + ".");
    }
}

    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("--- Libros publicados en " + anio + " ---");
        boolean encontrados = false;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron libros de ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("--- Autores Disponibles en la Biblioteca ---");
        
        // Usamos una lista auxiliar para guardar los autores que ya mostramos
        ArrayList<Autor> autoresUnicos = new ArrayList<>();

        for (Libro libro : this.libros) {
            Autor autorActual = libro.getAutor();
            
            // Verificamos si ya está en nuestra lista de únicos
            boolean yaEstaEnLaLista = false;
            for (Autor autorUnico : autoresUnicos) {
                // Comparamos por ID, que es el identificador único
                if (autorUnico.getId().equals(autorActual.getId())) {
                    yaEstaEnLaLista = true;
                    break;
                }
            }
            // Si no está en la lista, lo agregamos y mostramos su info
            if (!yaEstaEnLaLista) {
                autoresUnicos.add(autorActual);
                autorActual.mostrarInfo(); // Usamos el método del autor
            }
        }
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
        }
    }    

    public String getNombre() {
        return nombre;
    }
}
