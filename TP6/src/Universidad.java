
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class Universidad {

private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // No encontrado
    }
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null; // No encontrado
    }

    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
        System.out.println("Profesor " + p.getNombre() + " agregado a la universidad.");
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c);
        System.out.println("Curso " + c.getNombre() + " agregado a la universidad.");
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            // setProfesor se encarga de toda la lógica de sincronización.
            curso.setProfesor(profesor);
            System.out.println("Asignación exitosa: " + profesor.getNombre() + " -> " + curso.getNombre());
        } else {
            System.out.println("Error de asignación: No se encontró el curso o el profesor.");
        }
    }
    public void listarProfesores() {
        System.out.println("\n=== Listado de Profesores (" + this.nombre + ") ===");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            p.listarCursos(); // Mostramos también los cursos que dicta
        }
    }

    public void listarCursos() {
        System.out.println("\n=== Listado de Cursos (" + this.nombre + ") ===");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // 1. Romper la relación:
            // Esto notificará al profesor (si tiene uno) para que lo quite de su lista.
            curso.setProfesor(null);
            
            // 2. Eliminar de la lista maestra de la universidad
            this.cursos.remove(curso);
            System.out.println("Curso " + curso.getNombre() + " eliminado.");
        } else {
            System.out.println("No se puede eliminar: Curso " + codigo + " no encontrado.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // ¡Importante! No podemos modificar la lista 'profesor.getCursos()'
            // mientras la iteramos (causa ConcurrentModificationException).
            // Por eso, creamos una COPIA de la lista para iterar sobre ella.
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            
            // 1. Desasignar al profesor de todos sus cursos
            for (Curso c : cursosDelProfesor) {
                // setProfesor(null) se encargará de quitar el curso
                // de la lista 'profesor.getCursos()' automáticamente.
                c.setProfesor(null);
            }
            
            // 2. Eliminar al profesor de la lista maestra
            this.profesores.remove(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " eliminado.");
        } else {
            System.out.println("No se puede eliminar: Profesor " + id + " no encontrado.");
        }
    }
    public List<Profesor> getProfesores() {
        return profesores;
    }    
}
