package Strategy;

public class EstrategiaMoto implements EstrategiaTransporte {
    private static final double PRECIO_BASE = 15;
    private static final double VELOCIDAD_PROMEDIO = 45;
    private static final double PRECIO_POR_KM = 5;
    private static final double PRECIO_PAQUETE_SOBRE = 5;
    private static final double PRECIO_PAQUETE_CAJA_PEQUENA = 10;
    private static final double PRECIO_PAQUETE_CAJA_MEDIANA = 20;
    private static final double PRECIO_SERVICIO_EXPRESS = 50;
    private static final double PRECIO_SERVICIO_ESTANDAR = 30;

    public void calcularServicio(String tipoPaquete, String tipoServicio, double distancia) {
        double costo = PRECIO_BASE;
        
        if (tipoServicio.equals("Express")) {
            costo += PRECIO_SERVICIO_EXPRESS;
        }
        else{
            costo += PRECIO_SERVICIO_ESTANDAR;
        }
        
        if (tipoPaquete.equals("sobre")) {
            costo += PRECIO_PAQUETE_SOBRE;
        } else if (tipoPaquete.equals("caja pequeña")) {
            costo += PRECIO_PAQUETE_CAJA_PEQUENA;
        }
        else {
            costo += PRECIO_PAQUETE_CAJA_MEDIANA;
        }
        
        if (distancia > 10) {
            costo += (distancia - 10) * PRECIO_POR_KM;
        }

        double minutos = distancia / VELOCIDAD_PROMEDIO * 60;
        System.out.println("El costo del servicio es de $" + costo + ", se entregará en Motocicleta en un tiempo aproximado de " + minutos + " minutos");    
    }
}
