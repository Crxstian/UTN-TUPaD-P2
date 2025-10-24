
/**
 *
 * @author Cristian
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    public void mostrarInfo() {
        System.out.println("---------------------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.printf("Precio: $%.2f%n", this.precio); // Formato de moneda
        System.out.println("Stock: " + this.cantidad);
        System.out.println("Categoría: " + this.categoria.name() + " (" + this.categoria.getDescripcion() + ")");
        System.out.println("---------------------------------");
    }

    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
   
}
