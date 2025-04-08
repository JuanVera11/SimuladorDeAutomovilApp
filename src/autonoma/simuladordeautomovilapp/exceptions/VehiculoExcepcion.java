/*
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

/**
 * Esta clase es para las excepciones encontradas en Vehiculo
 * @author Juan Esteban Vera Velez
 * versión 1.0
 * @since 2025-04-01
 */
/**
 * Excepción personalizada para errores relacionados con la clase Vehiculo.
 */
public class VehiculoExcepcion extends Exception {

    /**
     * Constructor de la excepción VehiculoExcepcion.
     *
     * @param mensaje El mensaje de error que describe la excepción.
     */
    public VehiculoExcepcion(String mensaje) {
        super(mensaje); 
    }
}