package Strategy;

/**
 * Clase encargada de calcular el servicio utilizando la estrategia Dron
 * @author Miguel Frías
 */
public class EstrategiaDron implements EstrategiaTransporte {
    private static final double PRECIO_BASE = 70;
    private static final double VELOCIDAD_PROMEDIO = 60;
    private static final double PRECIO_PAQUETE_SOBRE = 5;
    private static final double PRECIO_PAQUETE_CAJA_PEQUENA = 10;

    /**
     * Método utilizado para calcular el servicio
     * @param tipoPaquete Tipo de paquete utilizado para calcular el servicio
     * @param tipoServicio Tipo de servicio utilizado para calcular el servicio
     * @param distancia Distancia indicada para calcular el servicio
    */     
    @Override
    public void calcularServicio(String tipoPaquete, String tipoServicio, double distancia) {
        double costo = PRECIO_BASE;
        if (tipoPaquete.equals("sobre")) {
            costo += PRECIO_PAQUETE_SOBRE;
        } else if (tipoPaquete.equals("caja pequeña")) {
            costo += PRECIO_PAQUETE_CAJA_PEQUENA;
        }

        double minutos = distancia / VELOCIDAD_PROMEDIO * 60;
        System.out.println("El costo del servicio es de $" + costo + ", se entregará en Dron en un tiempo aproximado de " + minutos + " minutos");
    }
}
