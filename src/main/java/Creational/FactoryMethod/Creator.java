package Creational.FactoryMethod;

public abstract class Creator {
    public void doSomeStuff() {
        System.out.println("Boring stuff... nothing to see here");
    }

    // This needs to be implemented in subclasses
    public abstract Product createProduct();
}
