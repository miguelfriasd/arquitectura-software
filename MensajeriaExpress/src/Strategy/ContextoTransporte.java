package Strategy;


/**
 * Clase que se encarga de seleccionar la estrategia de transporte
 * @author Miguel Frías
 */
public class ContextoTransporte {
    private EstrategiaTransporte estrategia;
    private String tipoPaquete = "";
    private String tipoServicio = "";
    private double distancia = 0;

    /**
     * Constructor de el contexto de transporte
     * @param tipoPaquete Tipo de paquete utilizado para construir el contexto
     * @param tipoServicio Tipo de servicio utilizado para construir el contexto
     * @param distancia Distancia indicada para construir el contexto
    */
    public ContextoTransporte(String tipoPaquete, String tipoServicio, double distancia) {
        
        this.tipoPaquete = tipoPaquete;
        this.tipoServicio = tipoServicio;
        this.distancia = distancia;
        
        switch (tipoPaquete) {
            case "sobre":
            case "caja pequeña":
                if (tipoServicio.equals("Express")) {
                    if (distancia <= 1) {
                        this.estrategia = new EstrategiaDron();
                    }
                    else {
                        this.estrategia = new EstrategiaMoto();
                    }
                }
                else if (tipoServicio.equals("Estándar")) {
                    this.estrategia = new EstrategiaBicicleta();
                }   break;
            case "caja mediana":
                if (distancia <= 5 && tipoServicio.equals("Estándar")) {
                    this.estrategia = new EstrategiaBicicleta();
                } else {
                    this.estrategia = new EstrategiaMoto();
                }   break;
            case "caja grande":
                this.estrategia = new EstrategiaAuto();
                break;
            default:
                System.out.println("Contexto invalido, utilize los metodos necesarios para crear el contexto.");
                break;
        }
    }

    public void calcularServicio() {
        estrategia.calcularServicio(this.tipoPaquete, this.tipoServicio, this.distancia);
    }
}
