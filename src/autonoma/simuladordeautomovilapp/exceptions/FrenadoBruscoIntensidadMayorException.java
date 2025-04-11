/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Esta Excepción es para cuando el Vehiculo al frenar con su intensidad 
 *  y esta es mayor a la velocidad actual entonces este empieza a patinar
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * Since@ 2025-04-08
 */
public class FrenadoBruscoIntensidadMayorException extends Exception {
    
     /**
     * Constructor que da un mensaje indicando que la intensidad del frenado 
     * fue mayor que la velocidad actual del vehículo.
     */
    public FrenadoBruscoIntensidadMayorException() {
        super(" La intensidad del frenado es mayor que la velocidad actual y por esto el vehiculo esta patinando");
    }
}