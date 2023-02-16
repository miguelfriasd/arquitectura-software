package Builder;

import ChainOfResponsibility.CreacionHandler;
import ChainOfResponsibility.Handler;
import ChainOfResponsibility.VerificacionHandler;

public class ServicioBuilder implements Builder {

    private char tipoServicio;
    private char tipoPaquete;
    private int distancia;

    public ServicioBuilder setTipoServicio(char tipoServicio) {
        this.tipoServicio = tipoServicio;
        return this;
    }

    public ServicioBuilder setTipoPaquete(char tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
        return this;

    }

    public ServicioBuilder setDistancia(int distancia) {
        this.distancia = distancia;
        return this;

    }

    public char getTipoServicio() {
        return tipoServicio;
    }

    public char getTipoPaquete() {
        return tipoPaquete;
    }

    public int getDistancia() {
        return distancia;
    }

    public void build() {
        Handler handler = new VerificacionHandler();
        handler.setNext(new CreacionHandler());
        handler.handle(this);
    }

}
