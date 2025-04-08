/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 *
 * @author USER
 */
public class VehiculoApagadoOperacionException extends Exception {
    public VehiculoApagadoOperacionException(String accion) {
        super("No se puede " + accion + " un vehículo apagado.");
    }
}