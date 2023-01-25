package Beverage;

//Clase de la que heredaran las otras bebidas y los decoradores
public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }

    //Cada bebida tendrá su propia implementación de el metodo
    public abstract double cost ();
}
