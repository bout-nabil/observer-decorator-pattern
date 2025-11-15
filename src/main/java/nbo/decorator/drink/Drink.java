package nbo.decorator.drink;

public abstract class Drink {
    protected String description;

    public abstract double price();

    public String getDescription() {
        return description;
    }
}
