import Builder.ContextoTransporteBuilder;
import Strategy.ContextoTransporte;



/**
 * Clase principal para correr el proyecto
 * @author Miguel Frías
 */
public class Main {

    /**
     * Método principal de la clase Main
     * @param args Argumentos que recibe
    */     
    public static void main(String[] args) {
        
        //Prueba 1
        ContextoTransporte ct = new ContextoTransporteBuilder().setTipoServicio("Estándar").setTipoPaquete("caja pequeña").setDistancia(4).build();
        ct.calcularServicio();
        
        //Prueba 2
        ContextoTransporte ct2 = new ContextoTransporteBuilder().setTipoServicio("Express").setTipoPaquete("caja mediana").setDistancia(12).build();
        ct2.calcularServicio();
    }

}
