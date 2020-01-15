package Creational.AbstractFactory;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void spillCoffee() {
        System.out.println("You spilled coffee on a ancient victorian coffee table!");
    }
}
