package Condiment;

import Beverage.Beverage;

public class WhippedCreamDecorator extends CondimentDecorator{

    //Componente a decorar
    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped cream";
    }

    @Override
    public double cost() {
        return super.cost() + 6.0;
    }
}
