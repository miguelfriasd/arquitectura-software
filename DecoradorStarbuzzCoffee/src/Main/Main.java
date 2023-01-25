package Main;

import Condiment.*;
import Beverage.*;

public class Main {

    public static void main(String[] args) {
        Beverage ChocolateEspresso = new ChocolateDecorator(new Espresso());

        System.out.println("Espresso Chocolate:");
        System.out.println("Descripcion: " + ChocolateEspresso.getDescription());
        System.out.println("Precio: " + ChocolateEspresso.cost());

        System.out.println("");

        Beverage MilkWhippedCreamDecaf = new MilkDecorator(new WhippedCreamDecorator(new Decaf()));
        System.out.println("Decaf WhippedCream Milk: ");
        System.out.println("Descripcion: " + MilkWhippedCreamDecaf.getDescription());
        System.out.println("Precio: " + MilkWhippedCreamDecaf.cost());

    }

}
