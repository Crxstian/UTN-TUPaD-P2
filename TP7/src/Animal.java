
/**
 *
 * @author Cristian
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + this.nombre);
    }

    public void hacerSonido() {
        System.out.println("(Sonido genérico de animal)");
    }    
}
