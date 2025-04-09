/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Esta excepción es para cuando el carro pasa los 60 km/h 
 *  y este ocasiona un accidente
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * @Since 2025-04-08 
 */
public class ApagarAltaVelocidadException extends Exception {
    /**
     * Constructor que indica que el vehiculo fue apagado 
     * por estar a más de 60 km/h ,genero un accidente
     */
    public ApagarAltaVelocidadException(){
        super(" Se apago el vehiculo a más de 60 km/h , generaste un accidente");
    }
}
