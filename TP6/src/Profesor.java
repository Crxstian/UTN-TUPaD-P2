
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Profesor {
private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Cursos que dicta

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void mostrarInfo() {
        System.out.println("---------------------------------");
        System.out.println("Profesor: " + this.nombre + " (ID: " + this.id + ")");
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Cursos a cargo: " + this.cursos.size());
    }

    public void listarCursos() {
        if (this.cursos.isEmpty()) {
            System.out.println("  -> No tiene cursos asignados.");
        } else {
            for (Curso c : this.cursos) {
                System.out.println("  -> " + c.getCodigo() + " - " + c.getNombre());
            }
        }
    }
    public void agregarCurso(Curso c) {
        // Si ya tengo este curso, no hago nada.
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
            // Sincroniza el otro lado: le dice al curso que este es su profesor
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        // Guardia: Si no tengo este curso, no hago nada.
        if (this.cursos.contains(c)) {
            this.cursos.remove(c);
            
            // Sincroniza el otro lado: si el curso aún me tiene como profesor, me quita.
            if (c.getProfesor() == this) {
                c.setProfesor(null); // Pone el profesor del curso en null
            }
        }
    }
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }    
}
