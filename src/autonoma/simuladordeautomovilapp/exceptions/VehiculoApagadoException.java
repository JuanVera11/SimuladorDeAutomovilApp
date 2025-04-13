/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Excepción cuando el vehiculo se encuentra apagado
 * 
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * since 2025-04-08
 */
public class VehiculoApagadoException extends Exception {

    /**
     * Constructor de la clase CarroYaApagadoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public VehiculoApagadoException(String message) {
        super(message);
    }
}