/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;

/**
 * Esta clase tendra todos los atributos, métodos y excepciones de
 * uso para el Vehiculo y lo que se solicita en los puntos
 * @author Juan Esteban Vera Velez
 * versión 1.0
 * @ since 2025-04-01
 */
public class Vehiculo {
    /**
     * Indica si el vehículo está encendido (true) o apagado (false).
     */
    private boolean encendido;

    /**
     * Indica si el vehículo ha sufrido un accidente (true) o no (false).
     */
    private boolean accidentado;

    /**
     * La velocidad actual del vehículo en km/h.
     */
    private double velocidad;

    /**
     * Objeto de la clase Llanta que representa las llantas del vehículo.
     */
    private Llanta llanta;

    /**
     * Objeto de la clase Motor que representa el motor del vehículo.
     */
     private Motor motor;
     
     /**
     * Constructor de la clase Vehiculo.
     *
     * @param llanta Objeto Llanta que representa las llantas del vehículo.
     * @param motor Objeto Motor que representa el motor del vehículo.
     */
    public Vehiculo(Llanta llanta, Motor motor) {
        this.encendido = false;
        this.accidentado = false;
        this.velocidad = 0;
        this.llanta = llanta;
        this.motor = motor;
    }

    /**
     * Enciende el vehículo.
     *
     * @throws autonoma.simuladordeautomovilapp.models.VehiculoExcepcion
     * @throws VehiculoExcepcion Si el vehículo ya está encendido.
     */
    public void encender() throws VehiculoExcepcion {
        if (encendido) {
            throw new VehiculoExcepcion("El vehículo ya está encendido.");
        }
        encendido = true;
        System.out.println("Vehículo encendido.");
    }

    /**
     * Apaga el vehículo.
     *
     * @throws VehiculoExcepcion Si el vehículo ya está apagado.
     */
    public void apagar() throws VehiculoExcepcion {
        if (!encendido) {
            throw new VehiculoExcepcion("El vehículo ya está apagado.");
        }
        encendido = false;
        System.out.println("Vehículo apagado.");
    }

    /**
     * Acelera el vehículo.
     *
     * @param magnitud La magnitud en km/h a la que se acelera el vehículo.
     * @throws VehiculoExcepcion Si el vehículo está apagado o si la aceleración excede la capacidad del motor.
     */
    public void acelerar(int magnitud) throws VehiculoExcepcion {
        if (!encendido) {
            throw new VehiculoExcepcion("No se puede acelerar un vehículo apagado.");
        }
        if (accidentado) {
            throw new VehiculoExcepcion("El vehículo está accidentado y no se puede acelerar.");
        }
        if (velocidad + magnitud > motor.getvelocidadMaxima()) {
            accidentado = true;
            velocidad = 0;
            encendido = false;
            throw new VehiculoExcepcion("El vehículo se accidentó por exceso de velocidad del motor.");
        }
        velocidad += magnitud;
        System.out.println("Velocidad aumentada a " + velocidad + " km/h.");
    }

    /**
     * Frena el vehículo.
     *
     * @param magnitud La magnitud en km/h a la que se frena el vehículo.
     * @throws VehiculoExcepcion Si el vehículo está apagado, si ya está detenido o si la magnitud de frenado excede la velocidad actual.
     */
    public void frenar(int magnitud) throws VehiculoExcepcion {
        if (!encendido) {
            throw new VehiculoExcepcion("No se puede frenar un vehículo apagado.");
        }
        if (velocidad == 0) {
            throw new VehiculoExcepcion("El vehículo ya está detenido.");
        }
        if (magnitud > velocidad) {
            accidentado = true;
            velocidad = 0;
            throw new VehiculoExcepcion("El vehículo patinó al frenar.");
        }
        velocidad -= magnitud;
        System.out.println("Velocidad reducida a " + velocidad + " km/h.");
    }

    /**
     * Frena bruscamente el vehículo.
     *
     * @throws VehiculoExcepcion Si el vehículo está apagado o si la velocidad excede el límite de las llantas.
     */
    public void frenarBruscamente() throws VehiculoExcepcion {
        if (!encendido) {
            throw new VehiculoExcepcion("No se puede frenar un vehículo apagado.");
        }
        if (velocidad > llanta.getlimiteVelocidad()) {
            accidentado = true;
            velocidad = 0;
            throw new VehiculoExcepcion("El vehículo patinó al fr enar bruscamente.");
        }
        velocidad = 0;
        System.out.println("El vehículo frenó bruscamente y se detuvo.");
    }

    /**
     * Obtiene el estado de encendido del vehículo.
     *
     * @return true si el vehículo está encendido, false de lo contrario.
     */
    public boolean encendido() {
        return encendido;
    }

    /**
     * Obtiene el estado de accidente del vehículo.
     *
     * @return true si el vehículo está accidentado, false de lo contrario.
     */
    public boolean accidentado() {
        return accidentado;
    }

    /**
     * Obtiene la velocidad actual del vehículo.
     *
     * @return La velocidad actual del vehículo en km/h.
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * Obtiene las llantas del vehículo.
     *
     * @return Objeto Llanta que representa las llantas del vehículo.
     */
    public Llanta getLlanta() {
        return llanta;
    }

    /**
     * Obtiene el motor del vehículo.
     *
     * @return Objeto Motor que representa el motor del vehículo.
     */
    public Motor getMotor() {
        return motor;
    }
}
