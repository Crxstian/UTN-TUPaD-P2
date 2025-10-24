/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

/**
 *
 * @author Cristian
 */
public class EdadInvalidaException extends Exception{
    public EdadInvalidaException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase padre (Exception)
    }
}
