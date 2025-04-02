/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

/**
 * Motor con sus características principales.
 * @author Juan Esteban Vera Velez
 * versión 1.0
 * @since 2025-04-01
 */
public class Motor {
    /**
     * Cilindraje del motor, puede ser expresado en litros o centímetros cúbicos.
     */
    private String cilindraje;

    /**
     * La velocidad máxima que el motor puede alcanzar en km/h.
     */
    private double velocidadMaxima;

    /**
     * Constructor Motor que recibe como parametro un String
     * que es Cilindraje
     * @param cilindraje 
     */
     public Motor(String cilindraje) {
        this.cilindraje = cilindraje;
        
        /**
         * Switch para determinar la velocidad maxima en km/h
         * variando la velocidad
         */
        switch(cilindraje) {
            case "1000":
                this.velocidadMaxima = 100.0;
                break;
            case "2000":
                this.velocidadMaxima = 160.0;
                break;
            case "3000":
                this.velocidadMaxima = 220.0;
                break;
            default:
                this.velocidadMaxima = 100.0; 
        }
    }
    
    /**
     * Obtengo el valor del Cilindraje del Vehiculo
     * 
     * @return Cilindraje
     */
    public String getCilindraje() {
        return cilindraje;
    }
    
    /**
     * Obtengo la VelocidadMaxima que puede tener el Vehiculo
     * 
     * @return velocidadMaxima
     */
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    double getvelocidadMaxima() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}