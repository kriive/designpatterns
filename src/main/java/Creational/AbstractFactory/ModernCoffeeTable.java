package Creational.AbstractFactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void spillCoffee() {
        System.out.println("You spilled coffee on a modern coffee table. At least is designed to not get dirty!");
    }
}
