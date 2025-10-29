/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.grupo.pkg4;

/**
 *
 * @author gonza
 */
public class Pelicula {

    private String nombrePelicula;
    private int duracion;

    public Pelicula(String nombrePelicula, int duracion) {
        this.nombrePelicula = nombrePelicula;
        this.duracion = duracion;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + nombrePelicula + "\nDuracion: " + duracion + " min";
    }
    
    

}
