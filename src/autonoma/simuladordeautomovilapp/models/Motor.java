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
public abstract class Motor {

    /**
     * Velocidad máxima que el motor puede alcanzar, en km/h.
     */
    protected int velocidadMaxima;

    /**
     * Obtiene la velocidad máxima del motor.
     * 
     * @return La velocidad máxima en km/h.
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}

