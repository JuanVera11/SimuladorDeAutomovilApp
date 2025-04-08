/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Excepción cuando el vehiculo esta encendido
 * 
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * since 2025-04-08
 */
public class VehiculoYaEncendidoException extends Exception {
    public VehiculoYaEncendidoException() {
        super("El vehículo ya está encendido.");
    }
}