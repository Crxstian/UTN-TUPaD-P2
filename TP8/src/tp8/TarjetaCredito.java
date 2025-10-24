package tp8;

/**
 *
 * @author Cristian
 */
public class TarjetaCredito implements Pago{
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito... Pago Aprobado.");
        return true;
    }    
}
