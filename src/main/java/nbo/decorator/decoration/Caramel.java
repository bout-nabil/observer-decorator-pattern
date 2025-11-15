package nbo.decorator.decoration;

import nbo.decorator.drink.Drink;

public class Caramel extends DecoratorDrink {

    public Caramel(Drink drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 1.9;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " au caramel";
    }
}
