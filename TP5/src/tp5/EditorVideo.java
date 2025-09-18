/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto ){
        Render render = new Render(formato, proyecto);
        System.out.println("Se ha creado el Render "+render.getFormato() +"Para el proyecto "
        +render.getProyecto().getNombre());
    }
}
