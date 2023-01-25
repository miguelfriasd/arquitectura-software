package Condiment;

import Beverage.Beverage;

public class MilkDecorator extends CondimentDecorator{

    //Componente a decorar
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 7.0;
    }
}
