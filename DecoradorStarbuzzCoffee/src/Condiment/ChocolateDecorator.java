package Condiment;

import Beverage.Beverage;

public class ChocolateDecorator extends CondimentDecorator{

    //Componente a decorar
    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return super.cost() + 5.0;
    }
}
