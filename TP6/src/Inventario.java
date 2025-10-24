
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Cristian
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado.");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Producto p : this.productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p; // Se encontró, se retorna el producto
            }
        }
        return null; // 
    }

    public void eliminarProducto(String id) {
    Iterator<Producto> iterator = productos.iterator();
    boolean eliminado = false;
    
    while (iterator.hasNext()) {
        Producto p = iterator.next();
        if (p.getId().equals(id)) {
            iterator.remove();
            eliminado = true;
        }
    }
    if (eliminado) {
        System.out.println("Producto con ID " + id + " eliminado.");
    } else {
        System.out.println("No se encontró producto con ID " + id + ".");
           }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto " + id + " actualizado a " + nuevaCantidad);
        } else {
            System.out.println("No se pudo actualizar: Producto " + id + " no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("--- Productos de la categoría: " + categoria.name() + " ---");
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }

    public int obtenerTotalStock() {
        int total = 0; // Variable acumuladora
        // Bucle for-each para sumar las cantidades
        for (Producto p : productos) {
            total = total + p.getCantidad(); // o total += p.getCantidad()
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto productoMax = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > productoMax.getCantidad()) {
                productoMax = p; 
            }
        }
        return productoMax;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.printf("--- Productos con precio entre $%.2f y $%.2f ---%n", min, max);
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorías Disponibles ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}
