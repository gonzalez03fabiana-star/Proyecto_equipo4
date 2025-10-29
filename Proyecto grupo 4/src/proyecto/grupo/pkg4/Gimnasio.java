/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.grupo.pkg4;

/**
 *
 * @author gonza
 */
public class Gimnasio {

    private String reservaEmpleado;
    private String horaReservada;
    private boolean reservado;

    public Gimnasio(String reservaEmpleado, String horaReservada, boolean reservado) {
        this.reservaEmpleado = reservaEmpleado;
        this.horaReservada = horaReservada;
        this.reservado = reservado;
    }

    Gimnasio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getReservaEmpleado() {
        return reservaEmpleado;
    }

    public void setReservaEmpleado(String reservaEmpleado) {
        this.reservaEmpleado = reservaEmpleado;
    }

    public String getHoraReservada() {
        return horaReservada;
    }

    public void setHoraReservada(String horaReservada) {
        this.horaReservada = horaReservada;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    //Metodo para reservar
    public String reservar(String id, String hora) {
        if (!reservado) {
            this.reservaEmpleado = id;
            this.horaReservada = hora;
            this.reservado = true;
            return "Reserva realizada para: " + id + " a las " + hora;
        }else {
            return "El gimnasio ya fue reservado a esa hora";
        }
    }
    
    //Metodo para liberar espacios
    public String liberar() {
        if (reservado) {
            String mensaje = "Reserva liberada" + reservaEmpleado + " a las " + horaReservada;
            this.reservaEmpleado = null;
            this.horaReservada = null;
            this.reservado = false;
            return mensaje;
        }else {
            return "No hay reservas que liberar.";
        }
    }
    

    @Override
    public String toString() {
        if (reservado){
            return "El entrenador fue reservado por: " + reservaEmpleado + " a las " + horaReservada;
        }else {
            return "Gimnasio disponible de 2pm a 7pm";
        }
        
    }

}
