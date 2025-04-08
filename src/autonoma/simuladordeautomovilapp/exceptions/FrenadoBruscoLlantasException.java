/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.exceptions;

/**
 * Esta Excepción es para cuando el vehiculo para de una manera
 *  brusca superando su limite de velocidad, donde por esto
 *  de cierta manera queda patinando.
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * since@ 2025-04-08
 */
public class FrenadoBruscoLlantasException extends Exception {
    /**
     * Constructor por defecto que laza un mensaje indicando
     * que la velocidad superó el limite permitido por las llantas
     */
    public FrenadoBruscoLlantasException(){
        super(" Velocidad  que supera el límite permitido por las llantas, por lo que el vehiculo esta patinando");
    }
}
