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

    public Motor(String cilindraje, double velocidadMaxima) {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    double getvelocidadMaxima() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}