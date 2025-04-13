/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Excepción cuando el vehiculo esta patinando
 * 
 * @author  Juan Esteban Vera Velez
 *  Versión 1.0
 * @ since 2025-04-13
 */
public class VehiculoHaPatinadoException extends Exception {

    /**
     * Constructor de la clase CarroHaPatinadoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public VehiculoHaPatinadoException(String message) {
        super(message);
    }
}
