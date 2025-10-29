/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.grupo.pkg4;

/**
 *
 * @author gonza
 */
public class Clase {
    private String tipo;
    private String horario;
    private String reservaEmpleado;
    private int cupoActual;
    private int cupoMaximo;

    public Clase(String tipo, String horario, String reservaEmpleado, int cupoActual, int cupoMaximo) {
        this.tipo = tipo;
        this.horario = horario;
        this.reservaEmpleado = reservaEmpleado;
        this.cupoActual = cupoActual;
        this.cupoMaximo = cupoMaximo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getReservaEmpleado() {
        return reservaEmpleado;
    }

    public void setReservaEmpleado(String reservaEmpleado) {
        this.reservaEmpleado = reservaEmpleado;
    }

    public int getCupoActual() {
        return cupoActual;
    }

    public void setCupoActual(int cupoActual) {
        this.cupoActual = cupoActual;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
    
    //Metodo para reservar
    public String reservar(String id) {
        if (cupoActual < cupoMaximo) {
            this.reservaEmpleado = id;
            this.cupoActual = cupoActual + 1;
            return "Reserva realizada para: " + id + " en clase de " + tipo + cupoActual + "/" + cupoMaximo;
        }else {
            return "No hay espacio disponible en la clase de " + tipo;
        }
    }
        
        //Metodo para liberar espacios
    public String liberar(){
        if (reservaEmpleado != null) {
            String mensaje = "Reserva liberada" + reservaEmpleado + " en la clase de " + tipo;
            this.reservaEmpleado = null;
            this.cupoActual = cupoActual - 1;
            return mensaje;
        }else {
            return "No hay reservas que liberar.";
        }
    }

    @Override
    public String toString() {
        return "La clase de " + tipo + " en el horario de " + horario + "cuenta con un cupo actual de " + cupoActual;
    }
    
    
 
}
