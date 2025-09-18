/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class GeneradorQR {
    public void generar(String valor, UsuarioEj13 usuarioEj13){
        CodigoQR codigoQR = new CodigoQR(valor, usuarioEj13);
        System.out.println("Se ha creado el QR '" + codigoQR.getValor()
                           + "' para el usuario " + usuarioEj13.getNombre());    }
}
