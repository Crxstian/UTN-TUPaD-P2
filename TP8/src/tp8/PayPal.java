/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

/**
 *
 * @author Cristian
 */
public class PayPal implements PagoConDescuento{
    private static final double TASA_DESCUENTO = 0.05; // 5%

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * TASA_DESCUENTO;
        System.out.println("Aplicando descuento PayPal (5%): -$" + String.format("%.2f", descuento));
        return monto - descuento;
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago de $" + String.format("%.2f", montoConDescuento) + " con PayPal... Pago Aprobado.");
        return true;
    }    
}
