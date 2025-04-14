/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.main;

import autonoma.persistencia.PersistenciaVehiculos;
import autonoma.simuladordeautomovilapp.models.Llanta;
import autonoma.simuladordeautomovilapp.models.LlantasBaratas;
import autonoma.simuladordeautomovilapp.models.LlantasBonitas;
import autonoma.simuladordeautomovilapp.models.LlantasBuenas;
import autonoma.simuladordeautomovilapp.models.Motor;
import autonoma.simuladordeautomovilapp.models.Motor1000;
import autonoma.simuladordeautomovilapp.models.Motor2000;
import autonoma.simuladordeautomovilapp.models.Motor3000;
import autonoma.simuladordeautomovilapp.models.Vehiculo;
import autonoma.simuladordeautomovilapp.views.Cabina;

/**
 * Clase SimuladorDeAutomovilApp donde
 * Leere archivos para la configuración 
 * y se instanciaran el motor y las llantas del vehiculo
 * 
 * 
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * since 2025-04-13
 */
public class SimuladorDeAutomovilApp {
    public static void main(String[] args) {
        
           try {
            // Leer archivo y obtener configuración
            String[] configuracion = PersistenciaVehiculos.leerConfiguracionVehiculo();
            String tipoLlantas = configuracion[0]; 
            String tipoMotor = configuracion[1];  

            // Instanciar motor
            Motor motor;
            switch (tipoMotor) {
                case "3000":
                    motor = new Motor3000();
                    break;
                case "2000":
                    motor = new Motor2000();
                    break;
                case "1000":
                    motor = new Motor1000();
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de motor no válido: " + tipoMotor);
            }

            // Instanciar llantas
            Llanta llantas;
            if (tipoLlantas.equalsIgnoreCase("Bonitas")) {
                llantas = new LlantasBonitas();
            } else if (tipoLlantas.equalsIgnoreCase("Buenas")) {
                llantas = new LlantasBuenas();
            } else if (tipoLlantas.equalsIgnoreCase("Baratas")) {
                llantas = new LlantasBaratas();
            } else {
                throw new IllegalArgumentException("Tipo de llantas no válido: " + tipoLlantas);
            }

            // Crear el  Vehiculo
            Vehiculo vehiculo = new Vehiculo (motor, llantas);

            // Mostrar cabina
            java.awt.EventQueue.invokeLater(() -> new Cabina(vehiculo).setVisible(true));
          

        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        }
    }
}
        
        
        
    
   

