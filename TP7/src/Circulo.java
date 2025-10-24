/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre); // Llama al constructor de Figura
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }    
}
