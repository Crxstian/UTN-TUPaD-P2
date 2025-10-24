/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido() {
        System.out.println("Miau...");
    }
}
