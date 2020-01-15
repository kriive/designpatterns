package Creational.AbstractFactory;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Oh, this modern chair is so comfortable!");
    }

    @Override
    public void hasLegs() {
        System.out.println("Of course! A modern chair may be minimalist, but it surely has got legs");
    }
}
