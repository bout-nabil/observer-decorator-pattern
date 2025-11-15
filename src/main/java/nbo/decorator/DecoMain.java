package nbo.decorator;

import nbo.decorator.drink.Drink;
import nbo.decorator.drink.Espresso;

public class DecoMain {
    public static void main(String[] args) {
        Drink drink;
        drink = new Espresso();
        System.out.println(drink.getDescription());
        System.out.println(drink.price());
    }
}
