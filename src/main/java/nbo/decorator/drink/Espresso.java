package nbo.decorator.drink;

public class Espresso extends Drink{

    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double price() {
        return 12;
    }
}
