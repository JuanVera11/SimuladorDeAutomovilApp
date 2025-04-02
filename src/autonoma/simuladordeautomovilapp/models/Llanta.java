/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

/**
 * Esta clase tendra los atributos de llanta, un constructor
 * y un switch donde se refleje el  tipo de llantas y el 
 * limite de velocidad km/h
 * @author Juan Esteban Vera Velez
 * versión 1.0
 * @ since 2025-04-01
 */
public class Llanta {
    /**
     * Tipo de llanta del vehiculo
     * Ejemplo : radiales, convencionales, de alto rendimiento,
     *  todoterreno, de carreras etc.
     */
    private String tipo;
    
    /**
     * Limite de velocidad en km/h que soporta la Llanta
     * Teniendo en cuenta como este hecha y las especificaciones
     * del fabricante 
     */
    private double limiteVelocidad;

    public double getlimiteVelocidad() {
        return limiteVelocidad;
    }
  
 }

    

