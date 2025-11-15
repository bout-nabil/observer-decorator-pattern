package nbo.decorator;

import nbo.decorator.decoration.Caramel;
import nbo.decorator.decoration.Chocolate;
import nbo.decorator.decoration.Noisette;
import nbo.decorator.drink.Deca;
import nbo.decorator.drink.Drink;
import nbo.decorator.drink.Espresso;

public class DecoMain {
    public static void main(String[] args) {
        Drink drink;
        drink = new Espresso();
        System.out.println(drink.getDescription());
        System.out.println(drink.price());
        System.out.println("-------------------------------");
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.price());
        System.out.println("-------------------------------");
        Drink drink2 = new Deca();
        System.out.println(drink2.getDescription());
        System.out.println(drink2.price());
        System.out.println("-------------------------------");
        drink2 = new Noisette(drink2);
        System.out.println(drink2.getDescription());
        System.out.println(drink2.price());
        System.out.println("-------------------------------");
        drink2 = new Espresso();
        drink2 = new Chocolate(new Caramel(drink2));
        System.out.println(drink2.getDescription());
        System.out.println(drink2.price());
    }
}
