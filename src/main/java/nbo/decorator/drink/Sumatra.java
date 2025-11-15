package nbo.decorator.drink;

public class Sumatra extends Drink{

    public Sumatra(){
        description = "Sumatra";
    }
    @Override
    public double price() {
        return 14;
    }
}
