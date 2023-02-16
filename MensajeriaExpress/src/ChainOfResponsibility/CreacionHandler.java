package ChainOfResponsibility;

import Builder.ServicioBuilder;

public class CreacionHandler implements Handler {

    private Handler next;

    public Handler setNext(Handler handler) {
        this.next = handler;
        return this;
    }

    public void handle(ServicioBuilder servicio) {
        
    }
}
