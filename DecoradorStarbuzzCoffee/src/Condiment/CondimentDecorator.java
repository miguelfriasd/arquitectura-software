package Condiment;

import Beverage.Beverage;

//Un decorador es una bebida. Pero necesita un componente de bebida para decorar.
public abstract class CondimentDecorator extends Beverage {

    //Componente a decorar
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription();
    }
}
