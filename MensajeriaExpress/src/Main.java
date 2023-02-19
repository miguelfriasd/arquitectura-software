import Builder.ContextoTransporteBuilder;
import Strategy.ContextoTransporte;

public class Main {

    public static void main(String[] args) {
        ContextoTransporte ct = new ContextoTransporteBuilder().setTipoServicio("Estándar").setTipoPaquete("caja pequeña").setDistancia(4).build();
        ct.calcularCosto();
        
        ContextoTransporte ct2 = new ContextoTransporteBuilder().setTipoServicio("Express").setTipoPaquete("caja mediana").setDistancia(12).build();
        ct2.calcularCosto();        
    }

}
