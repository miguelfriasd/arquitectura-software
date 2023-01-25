package Beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description="Dark Roast";
    }

    @Override
    public double cost() {
        return 45.0;
    }
}
