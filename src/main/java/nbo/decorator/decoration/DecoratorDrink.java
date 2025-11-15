package nbo.decorator.decoration;

import nbo.decorator.drink.Drink;

public abstract class DecoratorDrink extends Drink{
    protected Drink drink;

    public DecoratorDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public abstract String getDescription();
}
