package Creational.FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        Product a = new ConcreteCreatorA().createProduct();
        a.doStuff();

        Product b = new ConcreteCreatorB().createProduct();
        b.doStuff();
    }
}
