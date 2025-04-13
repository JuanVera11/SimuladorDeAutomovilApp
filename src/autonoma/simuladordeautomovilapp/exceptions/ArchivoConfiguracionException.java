package autonoma.simuladorapp.exceptions;

/**
 * Excepción para indicar problemas con la lectura o el formato del archivo de configuración.
 *
 * @author Juan Esteban Vera Velez
 * @version 1.0
 * @since 2025-04-13
 */
public class ArchivoConfiguracionException extends Exception {

    /**
     * Construye una nueva `ArchivoConfiguracionException` con el mensaje y la causa especificados.
     *
     * @param message El mensaje de detalle.
     * @param cause   La causa (que se guarda para su posterior recuperación mediante el método {@link #getCause()}).
     */
    public ArchivoConfiguracionException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Construye una nueva `ArchivoConfiguracionException` con el mensaje especificado.
     * La causa no se especifica y se inicializa a `null`.
     *
     * @param message El mensaje de detalle.
     */
    public ArchivoConfiguracionException(String message) {
        super(message);
    }
}