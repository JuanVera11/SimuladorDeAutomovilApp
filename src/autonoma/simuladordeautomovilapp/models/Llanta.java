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
     * Límite de patinaje de la llanta.
     * Representa la velocidad máxima a la que la llanta puede frenar sin patinar.
     */
    protected int limitePatinaje;

    /**
     * Obtiene el límite de patinaje de la llanta.
     * 
     * @return El límite de patinaje en km/h.
     */
    public int getLimitePatinaje() {
        return limitePatinaje;
    }
}
