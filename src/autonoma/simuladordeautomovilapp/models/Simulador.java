/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

import java.util.Scanner;

/**
 *
 * 
 * @since 08/04/2025
 * @version 1.0
 * @author Rafael
 */
public class Simulador {
    private Vehiculo vehiculo;
    
    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void iniciarSimulacion() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        System.out.println("BIENVENIDO AL SIMULADOR DE AUTOMOVIL");
        mostrarEstado();
        
        while (!salir) {
            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1. Encender el vehiculo");
            System.out.println("2. Apagar el vehiculo");
            System.out.println("3. Acelerar");
            System.out.println("4. Frenar");
            System.out.println("5. Frenar bruscamente");
            System.out.println("6. Ver estado actual");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            
            int opcion = scanner.nextInt();
            
            try {
                switch(opcion) {
                    case 1:
                        vehiculo.encender();
                        System.out.println("El vehiculo se ha encendido");
                        break;
                    case 2:
                        vehiculo.apagar();
                        System.out.println("El vehiculo se ha apagado");
                        break;
                    case 3:
                        System.out.print("Cuanto quieres acelerar (km/h)? ");
                        int magnitudAcelerar = scanner.nextInt();
                        vehiculo.acelerar(magnitudAcelerar);
                        System.out.println("Velocidad actual: " + vehiculo.getVelocidad() + " km/h");
                        break;
                    case 4:
                        System.out.print("Cuanto quieres frenar (km/h)? ");
                        int magnitudFrenar = scanner.nextInt();
                        vehiculo.frenar(magnitudFrenar);
                        System.out.println("Velocidad actual: " + vehiculo.getVelocidad() + " km/h");
                        break;
                    case 5:
                        vehiculo.frenarBruscamente();
                        System.out.println("Frenado brusco, El auto se detuvo");
                        break;
                    case 6:
                        mostrarEstado();
                        break;
                    case 7:
                        salir = true;
                        System.out.println("Saliendo del simulador ");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (VehiculoExcepcion e) {
                System.out.println("Error: " + e.getMessage());
                mostrarEstado();
            }
        }
        
        scanner.close();
    }
    
    private void mostrarEstado() {
        System.out.println("\n ESTADO DEL AUTO ");
        System.out.println("Motor: " + (vehiculo.encendido() ? "Encendido" : "Apagado"));
        System.out.println("Estado: " + (vehiculo.accidentado() ? "Accidentado" : "En buen estado"));
        System.out.println("Velocidad: " + vehiculo.getVelocidad() + " km/h");
        System.out.println("Llantas: " + vehiculo.getLlanta().getTipo() + 
                         " (Limite: " + vehiculo.getLlanta().getLimiteVelocidad() + " km/h)");
        System.out.println("Motor: " + vehiculo.getMotor().getCilindraje() + 
                         " (Maxima: " + vehiculo.getMotor().getVelocidadMaxima() + " km/h)");
    }
}