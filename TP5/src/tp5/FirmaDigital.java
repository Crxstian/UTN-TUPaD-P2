/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioEj8 usuario; //Agregacion

    public FirmaDigital(String codigoHash, String fecha, UsuarioEj8 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public UsuarioEj8 getUsuario() {
        return usuario;
    }
}
