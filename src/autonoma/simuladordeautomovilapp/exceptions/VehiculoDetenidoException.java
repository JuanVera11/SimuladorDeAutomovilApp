/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Excepción cuando el vehiculo esta detenido
 * 
 * Esta excepción se lanza cuando se intenta frenar un vehículo que ya tiene
 * una velocidad de 0 km/h.
 * 
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * since 2025-04-08
 */
public class VehiculoDetenidoException extends Exception {

    /**
     * Constructor de la clase CarroDetenidoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public VehiculoDetenidoException(String message) {
        super(message);
    }
}
