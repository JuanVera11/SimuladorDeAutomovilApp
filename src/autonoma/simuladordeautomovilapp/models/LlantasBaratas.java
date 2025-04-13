/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

/**
 * Clase que representa un tipo específico de llantas: Llantas Baratas.
 * Estas llantas tienen un límite de patinaje bajo, lo que significa que son más propensas
 * a patinar al frenar bruscamente o a altas velocidades.
 * 
 *
 * @author Juan Esteban Vera Velez
 * versión 1.0 
 * @since 2025-04-13
 */
public class LlantasBaratas extends Llanta {

    /**
     * Constructor de la clase LlantasBaratas.
     * Establece el límite de patinaje en 50 km/h.
     */
    public LlantasBaratas() {
        this.limitePatinaje = 50;
    }
}

