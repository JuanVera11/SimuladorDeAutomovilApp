/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

/**
 * Esta clase tendra todos los atributos, métodos y excepciones de
 * uso para el Vehiculo y lo que se solicita en los puntos
 * @author Juan Esteban Vera Velez
 * versión 1.0
 * @ since 2025-04-01
 */
public class Vehiculo {
    /**
     * Indica si el vehículo está encendido (true) o apagado (false).
     */
    private boolean encendido;

    /**
     * Indica si el vehículo ha sufrido un accidente (true) o no (false).
     */
    private boolean accidentado;

    /**
     * La velocidad actual del vehículo en km/h.
     */
    private double velocidad;

    /**
     * Objeto de la clase Llanta que representa las llantas del vehículo.
     */
    private Llanta llanta;

    /**
     * Objeto de la clase Motor que representa el motor del vehículo.
     */
     private Motor motor;
     
     
}