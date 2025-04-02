package autonoma.simuladordeautomovilapp.models;

/**
 * Esta clase tendrá los atributos de llanta, un constructor
 * y un switch donde se refleje el tipo de llantas y el
 * límite de velocidad km/h
 * 
 * @author Juan Esteban Vera Velez
 * @version 1.0
 * @since 2025-04-01
 */
public class Llanta {
    /**
     * Tipo de llanta del vehículo
     * Ejemplo: radiales, convencionales, de alto rendimiento,
     * todoterreno, de carreras, etc.
     */
    private String tipo;
    
    /**
     * Límite de velocidad en km/h que soporta la Llanta
     * teniendo en cuenta cómo está hecha y las especificaciones
     * del fabricante.
     */
    private double limiteVelocidad;

    /**
     * Constructor de la clase Llanta.
     * Establece el tipo de llanta y define el límite de velocidad.
     * 
     * @param tipo Tipo de llanta (ejemplo: "Buenas", "Bonitas", "Baratas")
     */
    public Llanta(String tipo) {
        this.tipo = tipo;
        
        switch (tipo) {
            case "Buenas":
                this.limiteVelocidad = 110.0;
                break;
            case "Bonitas":
                this.limiteVelocidad = 70.0;
                break;
            case "Baratas":
                this.limiteVelocidad = 50.0;
                break;
            default:
                this.limiteVelocidad = 50.0;
        }
    }

    /**
     * Para obtener el tipo de llanta del vehículo.
     * 
     * @return Tipo de llanta.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Para obtener el dato numérico del límite de velocidad del vehículo.
     * 
     * @return Límite de velocidad en km/h.
     */
    public double getLimiteVelocidad() {
        return limiteVelocidad;
    }
}
