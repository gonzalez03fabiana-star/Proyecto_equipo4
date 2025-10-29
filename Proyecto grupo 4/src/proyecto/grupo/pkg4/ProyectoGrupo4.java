/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.grupo.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class ProyectoGrupo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables definidas
        Empleado empleado1 = new Empleado("11446", "Guillermo Sanchez", "Agente financiero");
        SalaCine sala1 = new SalaCine("Sala A", 30);
        Pelicula pelicula1 = new Pelicula("Rocky", 100);
        
        

        int menuPrincipal;

        do {
            menuPrincipal = Integer.parseInt(JOptionPane.showInputDialog("""
                    --- MENÚ PRINCIPAL ---
                    1. Empleado
                    2. Sala
                    3. Película
                    0. Salir
                    """));

            // Menu empleado
            switch (menuPrincipal) {
                case 1 -> {
                    int menuEmpleado = Integer.parseInt(JOptionPane.showInputDialog("""
                            --- MENÚ DE EMPLEADO ---
                            1. Ver información
                            2. Modificar datos
                            0. Volver
                            """));
                    if (menuEmpleado == 1){
                       JOptionPane.showMessageDialog(null, empleado1.toString());
                       
                    } else if (menuEmpleado == 2){
                        String nombreNuevo = JOptionPane.showInputDialog("Indique el nombre del empleado", empleado1.getNombre());
                        String puestoNuevo = JOptionPane.showInputDialog("Indique el puesto del empleado", empleado1.getPuesto());
                        empleado1.setNombre(nombreNuevo);
                        empleado1.setPuesto(puestoNuevo);
                        JOptionPane.showMessageDialog(null, "Informacion modificada: \n" + empleado1);
                    }

                }
                
                // Menú sala de cine
                
                case 2 -> {
                    int menuSala = Integer.parseInt(JOptionPane.showInputDialog("""
                            --- MENÚ SALA ---
                            1. Ver sala
                            2. Modificar sala
                            0. Volver
                            """));
                    
                    if (menuSala == 1){
                        JOptionPane.showMessageDialog(null, sala1.toString());
                        
                    }else if (menuSala == 2){
                        String salaNueva = JOptionPane.showInputDialog("Indique el nombre de la sala", sala1.getNombre());
                        int capacidadNueva = Integer.parseInt(JOptionPane.showInputDialog("Indique la nueva capacidad de la sala", sala1.getCapacidad()));
                        sala1.setNombre(salaNueva);
                        sala1.setCapacidad(capacidadNueva);
                        JOptionPane.showMessageDialog(null, "Sala modificada: \n" + sala1);
                    }
                }
                
                //Menú de la pelicula 
                
                case 3 -> {
                    int menuPelicula = Integer.parseInt(JOptionPane.showInputDialog("""
                            --- MENÚ DE LA PELÍCULA ---
                            1. Ver película
                            2. Modificar película
                            0. Volver
                            """));
                    
                    if (menuPelicula == 1){
                        JOptionPane.showMessageDialog(null, pelicula1.toString());
                        
                    }else if (menuPelicula == 2){
                        String nombreNueva = JOptionPane.showInputDialog("Indique el nombre de la pelicula", pelicula1.getNombrePelicula());
                        int duraciondNueva = Integer.parseInt(JOptionPane.showInputDialog("Indique la duracion de la pelicula", pelicula1.getDuracion()));
                        pelicula1.setNombrePelicula(nombreNueva);
                        pelicula1.setDuracion(duraciondNueva);
                        JOptionPane.showMessageDialog(null, "Pelicula modificada: \n" + pelicula1);
                    }
                }
                
                case 4 -> {
                    int menuGimnasio = Integer.parseInt(JOptionPane.showInputDialog("""
                            --- GIMNASIO ---
                            1. Ver estado
                            2. Reservar hora
                            3. Liberar hora
                            0. Volver
                            """));
                    
                }
                
                case 0 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                default -> JOptionPane.showMessageDialog(null, "Opcion Invalida, por favor intente nuevamente");

            }

        } while (menuPrincipal != 0);
        }
    }
