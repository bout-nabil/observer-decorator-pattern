package nbo.decorator.drink;

public class Deca extends Drink{

    public Deca(){
        description = "Deca";
    }
    @Override
    public double price() {
        return 15;
    }
}
