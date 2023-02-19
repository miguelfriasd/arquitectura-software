package Builder;

import Strategy.ContextoTransporte;

/**
 * Clase Builder que crea un contexto de transporte
 * @author Miguel Frías
 */
public class ContextoTransporteBuilder implements Builder {

    private String tipoServicio;
    private String tipoPaquete;
    private double distancia;

    /**
     * Metodo para establecer el tipo de servicio requerido
     * @param tipoServicio Tipo de servicio seleccionado
     * @return Se regresa a si mismo
    */    
    @Override
    public ContextoTransporteBuilder setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
        return this;
    }

    /**
     * Metodo para establecer el tipo de paquete requerido
     * @param tipoPaquete Tipo de paquete seleccionado
     * @return Se regresa a si mismo
    */    
    @Override
    public ContextoTransporteBuilder setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
        return this;

    }

    /**
     * Metodo para establecer la distancia requerida
     * @param distancia Distancia requerida
     * @return Se regresa a si mismo
    */    
    @Override
    public ContextoTransporteBuilder setDistancia(double distancia) {
        this.distancia = distancia;
        return this;

    }

    public ContextoTransporte build() {
        return new ContextoTransporte(this.tipoPaquete, this.tipoServicio, this.distancia);
    }

}
