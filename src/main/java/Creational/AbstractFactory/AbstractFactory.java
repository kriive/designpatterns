package Creational.AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        FurnitureFactory fact = new ModernFurnitureFactory();
        Chair chair = fact.createChair();

        chair.hasLegs();
    }
}
