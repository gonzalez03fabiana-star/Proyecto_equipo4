/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.grupo.pkg4;

/**
 *
 * @author gonza
 */
public class Bebida {

    private String nombreBebida;
    private String tipo;

    public Bebida(String nombreBebida, String tipo) {
        this.nombreBebida = nombreBebida;
        this.tipo = tipo;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String tosString() {
        return "Bebida: " + nombreBebida + "Tipo de bebida: " + tipo;
    }

}
