package nbo.decorator.decoration;

import nbo.decorator.drink.Drink;

public class Noisette extends DecoratorDrink {

    public Noisette(Drink drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 1.2;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " au noisette";
    }
}
