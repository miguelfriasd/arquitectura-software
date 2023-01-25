package Condiment;

import Beverage.Beverage;

public class SoyDecorator extends CondimentDecorator{

    //Componente a decorar
    public SoyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return super.cost() + 12.0;
    }

}
