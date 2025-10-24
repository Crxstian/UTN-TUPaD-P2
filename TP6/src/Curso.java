/**
 *
 * @author Cristian
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor; // Profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Un curso se crea sin profesor
    }

    public void mostrarInfo() {
        System.out.println("---------------------------------");
        System.out.println("Curso: " + this.nombre + " (Código: " + this.codigo + ")");
        
        if (this.profesor != null) {
            System.out.println("Profesor: " + this.profesor.getNombre());
        } else {
            System.out.println("Profesor: Sin asignar");
        }
    }

    public void setProfesor(Profesor nuevoProfesor) {
        // Guardia: Si me intentan asignar el mismo profesor, no hago nada.
        if (this.profesor == nuevoProfesor) {
            return;
        }

        // 1. Guardar una referencia al profesor anterior
        Profesor profesorAnterior = this.profesor;

        // 2. Asignar el nuevo profesor al curso
        this.profesor = nuevoProfesor;

        // 3. Desvincular del profesor anterior (si existía)
        if (profesorAnterior != null) {
            // Le decimos al profesor anterior que elimine este curso de su lista
            profesorAnterior.eliminarCurso(this);
        }

        // 4. Vincular con el nuevo profesor (si no es null)
        if (this.profesor != null) { // this.profesor es igual a nuevoProfesor
            // Le decimos al nuevo profesor que agregue este curso a su lista
            this.profesor.agregarCurso(this);
        }
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }    
}
