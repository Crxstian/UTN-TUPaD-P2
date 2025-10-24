/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre); // Llama al constructor de Figura
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}
