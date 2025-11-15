package nbo.decorator.decoration;

import nbo.decorator.drink.Drink;

public class Chocolate extends DecoratorDrink {

    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 1.5;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " au Chocolate";
    }
}
