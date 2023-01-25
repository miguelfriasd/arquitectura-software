package Beverage;

public class Decaf extends Beverage{

    public Decaf() {
        this.description="Decaf";
    }

    @Override
    public double cost() {
        return 40.0;
    }
}
