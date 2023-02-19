package Builder;

import Strategy.ContextoTransporte;

public class ContextoTransporteBuilder implements Builder {

    private String tipoServicio;
    private String tipoPaquete;
    private double distancia;

    public ContextoTransporteBuilder setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
        return this;
    }

    public ContextoTransporteBuilder setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
        return this;

    }

    public ContextoTransporteBuilder setDistancia(double distancia) {
        this.distancia = distancia;
        return this;

    }

    public ContextoTransporte build() {
        return new ContextoTransporte(this.tipoPaquete, this.tipoServicio, this.distancia);
    }

}
