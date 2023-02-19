package Strategy;

public class EstrategiaBicicleta implements EstrategiaTransporte {
    private static final double PRECIO_BASE = 35;
    private static final double VELOCIDAD_PROMEDIO = 20;
    private static final double PRECIO_POR_KM = 5;
    private static final double PRECIO_PAQUETE_SOBRE = 5;
    private static final double PRECIO_PAQUETE_CAJA_PEQUENA = 10;

    @Override
    public void calcularServicio(String tipoPaquete, String tipoServicio, double distancia) {
        double costo = PRECIO_BASE;
        if (tipoPaquete.equals("sobre")) {
            costo += PRECIO_PAQUETE_SOBRE;
        } else if (tipoPaquete.equals("caja pequeña")) {
            costo += PRECIO_PAQUETE_CAJA_PEQUENA;
        }

        if (distancia > 10) {
            costo += (distancia - 10) * PRECIO_POR_KM;
        }        
        
        double minutos = distancia / VELOCIDAD_PROMEDIO * 60;
        System.out.println("El costo del servicio es de $" + costo + ", se entregará en Bicicleta en un tiempo aproximado de " + minutos + " minutos");
    }
}
