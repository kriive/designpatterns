package Creational.AbstractFactory;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("I'm sitting on a victorian chair!");
    }

    @Override
    public void hasLegs() {
        System.out.println("No doubt a victorian chair has legs!");
    }
}
