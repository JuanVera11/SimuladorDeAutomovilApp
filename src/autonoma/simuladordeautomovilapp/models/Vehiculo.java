/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.simuladordeautomovilapp.models;
import autonoma.simuladorapp.exceptions.ArchivoConfiguracionException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoAccidentadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoApagadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoDetenidoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoHaPatinadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoYaApagadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoYaEncendidoException;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


/**
 * Esta clase tendra todos los atributos, métodos y excepciones de
 * uso para el Vehiculo y lo que se solicita en los puntos
 * @author Juan Esteban Vera Velez
 * versión 1.0
 * @ since 2025-04-01
 */
public class Vehiculo {

    /**
     * Motor del vehículo.
     */
    private Motor motor;

    /**
     * Llantas del vehículo.
     */
    private Llanta llantas;

    /**
     * Estado del motor (encendido o apagado).
     */
    private boolean encendido;

    /**
     * Velocidad actual del vehículo en km/h.
     */
    private int velocidadActual;

    /**
     * Indica si el vehículo está patinando.
     */
    private boolean haPatinado;

    /**
     * Indica si el vehículo ha sufrido un accidente.
     */
    private boolean seHaAccidentado;

    /**
     * Constructor de la clase Vehiculo.
     * 
     * @param motor Motor del vehículo.
     * @param llantas Llantas del vehículo.
     */
    public Vehiculo(Motor motor, Llanta llantas) {
        this.motor = motor;
        this.llantas = llantas;
        this.encendido = false;
        this.velocidadActual = 0;
        this.haPatinado = false;
        this.seHaAccidentado = false;
    }

    /**
     * Enciende el motor del vehículo.
     * 
     * @throws VehiculoYaEncendidoException Si el vehículo ya está encendido.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void encender() throws VehiculoYaEncendidoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (encendido) throw new VehiculoYaEncendidoException("El vehículo ya está encendido.");
        encendido = true;
        try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(
            getClass().getResourceAsStream("/autonoma/sounds/startEngine.wav"))) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        }
        JOptionPane.showMessageDialog(null, "Motor Encendido correctamente", "Motor encendido", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Apaga el motor del vehículo.
     * 
     * @throws VehiculoYaApagadoException Si el vehículo ya está apagado.
     * @throws VehiculoAccidentadoException Si el vehículo está accidentado.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void apagar() throws VehiculoYaApagadoException, VehiculoAccidentadoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (!encendido) throw new VehiculoYaApagadoException("El vehículo ya está apagado.");
        if (velocidadActual > 60) {
            seHaAccidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new VehiculoAccidentadoException("¡Accidente! No se puede apagar a esa velocidad.");
        }
        encendido = false;
        try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(
            getClass().getResourceAsStream("/autonoma/sounds/stopEngine.wav"))) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        }
        JOptionPane.showMessageDialog(null, "Motor apagado correctamente", "Motor apagado", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Acelera el vehículo en una cantidad específica de km/h.
     * 
     * @param kmh Cantidad de km/h a acelerar.
     * @throws VehiculoApagadoException Si el vehículo está apagado.
     * @throws VehiculoAccidentadoException Si el vehículo está accidentado.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void acelerar(int kmh) throws VehiculoApagadoException, VehiculoAccidentadoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (!encendido) throw new VehiculoApagadoException("No se puede acelerar con el vehículo apagado.");
        velocidadActual += kmh;
        if (velocidadActual > motor.getVelocidadMaxima()) {
            seHaAccidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new VehiculoAccidentadoException("¡El motor falló! Aceleró más de lo permitido.");
        }
        try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(
            getClass().getResourceAsStream("/autonoma/sounds/engineAccelerating.wav"))) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        }
        JOptionPane.showMessageDialog(null, "Acelerando " + kmh + " km/h. Velocidad actual: " + velocidadActual, "Acelerando", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Frena el vehículo en una cantidad específica de km/h.
     * 
     * @param kmh Cantidad de km/h a frenar.
     * @throws VehiculoApagadoException Si el vehículo está apagado.
     * @throws VehiculoDetenidoException Si el vehículo ya está detenido.
     * @throws VehiculoHaPatinadoException Si el vehículo patina al frenar.
     * @throws VehiculoAccidentadoException Si el vehículo está accidentado.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void frenar(int kmh) throws VehiculoApagadoException, VehiculoDetenidoException, VehiculoHaPatinadoException, VehiculoAccidentadoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (!encendido) throw new VehiculoApagadoException("No se puede frenar con el vehículo apagado.");
        if (velocidadActual == 0) throw new VehiculoDetenidoException("El vehículo ya está detenido.");
        if (seHaAccidentado) throw new VehiculoAccidentadoException("El vehículo está accidentado y no puede realizar esta acción.");
        if (haPatinado) {
            JOptionPane.showMessageDialog(null, "El vehículo está patinando, no puedes frenar más hasta detenerse.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean esFrenadoBrusco = kmh > 30;

        if (esFrenadoBrusco && velocidadActual > llantas.getLimitePatinaje()) {
            haPatinado = true;
            throw new VehiculoHaPatinadoException("¡El vehículo patinó al frenar bruscamente!");
        }

        if (kmh > velocidadActual) {
            haPatinado = true;
            throw new VehiculoHaPatinadoException("¡El vehículo patinó porque el frenado fue mayor que la velocidad actual!");
        }

        velocidadActual -= kmh;

        if (velocidadActual <= 0) {
            velocidadActual = 0;
            haPatinado = false;
        }

        JOptionPane.showMessageDialog(null, "Frenando " + kmh + " km/h. Velocidad actual: " + velocidadActual, "Frenando", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Muestra el estado actual del vehículo.
     */
    public void mostrarEstado() {
        JOptionPane.showMessageDialog(null, 
            "=== Estado del Vehículo ===\n" +
            "Encendido: " + encendido + "\n" +
            "Velocidad Actual: " + velocidadActual + " km/h\n" +
            "Patinando: " + haPatinado + "\n" +
            "Accidentado: " + seHaAccidentado + "\n" +
            "===========================", 
            "Estado del Vehículo", JOptionPane.INFORMATION_MESSAGE);
    }

    public Object getLlanta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getMotor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
