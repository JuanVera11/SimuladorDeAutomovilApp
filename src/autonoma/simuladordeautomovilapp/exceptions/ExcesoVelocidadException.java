/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Esta excepción se lanza cuando el vehículo se acelera 
 * más allá de la capacidad de su motor y este se accidentara.
 * 
 * @author Juan Esteban Vera Velez
 * @version 1.0
 * @since 2025-04-10
 */
public class ExcesoVelocidadException extends Exception {

    /**
     * Constructor de la excepción por exceso de velocidad del motor.
     * 
     * @param mensaje el mensaje que describe el error
     */
    public ExcesoVelocidadException(String mensaje) {
        super(mensaje);
        System.out.println(" Se generó una ExcesoVelocidadException: " + mensaje);
    }
    
}