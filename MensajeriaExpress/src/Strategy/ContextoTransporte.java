package Strategy;

public class ContextoTransporte {
    private EstrategiaTransporte estrategia;
    private String tipoPaquete = "";
    private String tipoServicio = "";
    private double distancia = 0;


    public ContextoTransporte(String tipoPaquete, String tipoServicio, double distancia) {
        
        this.tipoPaquete = tipoPaquete;
        this.tipoServicio = tipoServicio;
        this.distancia = distancia;
        
        if (tipoPaquete.equals("sobre") || tipoPaquete.equals("caja pequeña")) {
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
            }
        } else if (tipoPaquete.equals("caja mediana")) {
            if (distancia <= 5 && tipoServicio.equals("Estándar")) {
                this.estrategia = new EstrategiaBicicleta();
            } else {
                this.estrategia = new EstrategiaMoto();
            }
        } else if (tipoPaquete.equals("caja grande")) {
            this.estrategia = new EstrategiaAuto();
        } else {
            System.out.println("Contexto invalido, utilize los metodos necesarios para crear el contexto.");
        }
    }

    public void calcularCosto() {
        estrategia.calcularServicio(this.tipoPaquete, this.tipoServicio, this.distancia);
    }
}
