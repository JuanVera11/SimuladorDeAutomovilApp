/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Esta Excepción es para cuando el vehiculo esta detenido 
 * y no se puede frenar
 * 
 *@author Juan Esteban Vera Velez
 * Versión 1.0
 * since 2025-04-08
 */
public class FrenarVehiculoDetenidoException extends Exception {
    
    /**
     * Constructor que da un mensaje indicando que le  vehiculo 
     * esta detenido y no puede frenar más, quiere decir que este
     * en ese momento no esta  en movimiento
     */
    public FrenarVehiculoDetenidoException() {
        super("El vehículo ya está detenido. No se puede frenar más.");
    }
}
