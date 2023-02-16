package ChainOfResponsibility;

import Builder.ServicioBuilder;

public interface Handler {

    public Handler setNext(Handler handler);

    public void handle(ServicioBuilder servicio);
}
