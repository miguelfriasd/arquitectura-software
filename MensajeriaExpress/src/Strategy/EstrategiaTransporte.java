package Strategy;

/**
 * Interfaz implementada por cada estrategia de transporte
 * @author Miguel Frías
 */
public interface EstrategiaTransporte {

    /**
     * Método utilizado para calcular el servicio
     * @param tipoPaquete Tipo de paquete utilizado para calcular el servicio
     * @param tipoServicio Tipo de servicio utilizado para calcular el servicio
     * @param distancia Distancia indicada para calcular el servicio
    */    
    void calcularServicio(String tipoPaquete, String tipoServicio, double distancia);

}
