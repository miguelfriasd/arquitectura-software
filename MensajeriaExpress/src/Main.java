import Builder.ServicioBuilder;

public class Main {
    public static void main(String[] args) {
        ServicioBuilder sb = new ServicioBuilder();

        sb.setTipoServicio('E').setTipoPaquete('M').setDistancia(2).build();
    }
}
