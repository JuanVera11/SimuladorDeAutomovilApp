/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Excepción cuando el vehiculo se encuentra apagado
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * since 2025-04-08
 */
public class VehiculoApagadoOperacionException extends Exception {
    
    /**
     * Constructor que recibe la acción que se intento realizar ,
     *  se incluye un mensaje que indicia que no se puede movilizar }
     * el Vehiculo porque se  encuentra apagado
     * @param accion ( Acelerar , frenar, retroceder).
     */
    public VehiculoApagadoOperacionException(String accion) {
        super("No se puede " + accion + " un vehículo apagado.");
    }
}