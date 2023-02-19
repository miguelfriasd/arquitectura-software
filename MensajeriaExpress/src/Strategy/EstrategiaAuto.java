package Strategy;

public class EstrategiaAuto implements EstrategiaTransporte {
    private static final double PRECIO_BASE = 30;
    private static final double VELOCIDAD_PROMEDIO = 40;
    private static final double PRECIO_POR_KM = 5;
    private static final double PRECIO_PAQUETE_GRANDE = 50;
    private static final double PRECIO_SERVICIO_EXPRESS = 50;
    private static final double PRECIO_SERVICIO_ESTANDAR = 30;    


    public void calcularServicio(String tipoPaquete, String tipoServicio, double distancia) {

        double costo = PRECIO_BASE;
        costo += PRECIO_PAQUETE_GRANDE;
        
        if (tipoServicio.equals("Express")) {
            costo += PRECIO_SERVICIO_EXPRESS;
        }
        else{
            costo += PRECIO_SERVICIO_ESTANDAR;
        }
        
        if (distancia > 10) {
            costo += (distancia - 10) * PRECIO_POR_KM;
        }

        double minutos = distancia / VELOCIDAD_PROMEDIO * 60;
        System.out.println("El costo del servicio es de $" + costo + ", se entregará en Auto en un tiempo aproximado de " + minutos + " minutos");    
        
    }

}
