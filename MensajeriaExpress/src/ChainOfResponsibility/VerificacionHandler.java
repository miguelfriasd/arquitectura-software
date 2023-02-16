package ChainOfResponsibility;

import Builder.ServicioBuilder;

public class VerificacionHandler implements Handler {

    private Handler next;

    public Handler setNext(Handler handler) {
        this.next = handler;
        return this;
    }

    public void handle(ServicioBuilder servicio) {
        if (servicio.getDistancia() <= 0) {

        } else if (servicio.getTipoPaquete() != 'x') {

        } else if (servicio.getTipoServicio() != 'x') {

        } else {
            next.handle(servicio);
        }
    }
}
