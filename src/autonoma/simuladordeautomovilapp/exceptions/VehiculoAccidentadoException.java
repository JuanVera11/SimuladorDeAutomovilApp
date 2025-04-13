/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;
/**
 * Excepción cuando el vehiculo se accidenta,
 * debio a que paso un limite de velocidad no permitido
 * 
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * since 2025-04-08
 */
public class VehiculoAccidentadoException extends Exception {

    /**
     * Constructor de la clase CarroAccidentadoException.
     * 
     * @param message Mensaje descriptivo del motivo del accidente.
     */
    public VehiculoAccidentadoException(String message) {
        super(message);
    }
}