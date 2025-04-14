/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * * Clase que gestiona la persistencia de datos relacionados con los vehículos.
 * Permite leer la configuración de un vehículo desde un archivo de texto.
 * 
 * El archivo debe contener especificaciones en el formato:
 * - llantas tipo de llantas
 * - motor  tipo de motor
 * 
 *
 * @author Juan Esteban Vera Velez
 * Versión 1.0 
 * @since 2025-04-13
 */
public class PersistenciaVehiculos {
  
    public static String[] leerConfiguracionVehiculo() {
        String[] configuracion = new String[2]; // [0] = llantas, [1] = motor

        try (BufferedReader lector = new BufferedReader(new FileReader("data/especificaciones.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split("\\s+"); // Divide por espacios
                if (partes.length == 2) {
                    if (partes[0].equalsIgnoreCase("llantas")) {
                        configuracion[0] = partes[1];
                    } else if (partes[0].equalsIgnoreCase("motor")) {
                        configuracion[1] = partes[1];
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        return configuracion;
    }
}





