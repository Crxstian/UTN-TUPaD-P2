/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class CodigoQR {
    private String valor;
    private UsuarioEj13 usuarioEj13;

    public CodigoQR(String valor, UsuarioEj13 usuarioEj13) {
        this.valor = valor;
        this.usuarioEj13 = usuarioEj13;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public UsuarioEj13 getUsuarioEj13() {
        return usuarioEj13;
    }

    public void setUsuarioEj13(UsuarioEj13 usuarioEj13) {
        this.usuarioEj13 = usuarioEj13;
    }
}
