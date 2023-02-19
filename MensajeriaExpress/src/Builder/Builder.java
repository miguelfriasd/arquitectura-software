package Builder;

/**
 * Interfaz implementada por cada Builder
 * @author Miguel Frías
 */
public interface Builder {

    /**
     * Metodo para establecer el tipo de servicio requerido
     * @param tipoServicio Tipo de servicio seleccionado
     * @return Se regresa a si mismo
    */
    public Builder setTipoServicio(String tipoServicio);

    /**
     * Metodo para establecer el tipo de paquete requerido
     * @param tipoPaquete Tipo de paquete seleccionado
     * @return Se regresa a si mismo
    */
    public Builder setTipoPaquete(String tipoPaquete);

    /**
     * Metodo para establecer la distancia requerida
     * @param distancia Distancia requerida
     * @return Se regresa a si mismo
    */
    public Builder setDistancia(double distancia);

}
