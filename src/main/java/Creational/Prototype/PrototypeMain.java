package Creational.Prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        ObjectA a = new ObjectA();

        a.setField(4);

        Prototype aClone = a.clone();
        System.out.println(aClone.getField());
    }
}
