package Beverage;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description="House Blend";
    }

    @Override
    public double cost() {
        return 55.0;
    }
}
