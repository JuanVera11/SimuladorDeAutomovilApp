/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Excepción cuando el vehiculo esta apagado en el momento
 * 
 * @author  Juan Esteban Vera Velez
 *  Versión 1.0
 * @ since 2025-04-13
 */
public class VehiculoYaApagadoException extends Exception {

    /**
     * Constructor de la clase CarroYaApagadoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public VehiculoYaApagadoException(String message) {
        super(message);
    }
}
