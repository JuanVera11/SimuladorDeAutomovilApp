/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

import autonoma.simuladordeautomovilapp.exceptions.ExcesoVelocidadException;
import java.util.Scanner;

/**
 * 
 * @since 08/04/2025
 * @version 1.0
 * @author Rafael
 */
public class Taller {
    
    public static Vehiculo configurarVehiculo(String archivo) {
        // Valores por defecto
        String llantas = "Bonitas";
        String motor = "2000";
        
        try {
            Scanner scaner = new Scanner(new java.io.File(archivo));
            
            while (scaner.hasNextLine()) {
                String linea = scaner.nextLine();
                if (linea.startsWith("llantas ")) {
                    llantas = linea.substring(8).trim();
                } else if (linea.startsWith("motor ")) {
                    motor = linea.substring(6).trim();
                }
            }
            scaner.close();
        } catch (Exception e) {
            System.out.println("Error leyendo archivo, usando valores por defecto");
        }
        
        return new Vehiculo(new Llanta(llantas), new Motor(motor));
    }
    
      public void probarVelocidad(int velocidad) throws ExcesoVelocidadException {
    if (velocidad > 180) { 
        throw new ExcesoVelocidadException("El vehículo ha superado la capacidad de su motor.");
    }
}
    
}
