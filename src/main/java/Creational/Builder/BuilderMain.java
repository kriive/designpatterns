package Creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        CarManualBuilder builder = new CarManualBuilder();
        Director dir = new Director();
        dir.makeSportsCar(builder);

        Manual manual = builder.getResult();
        System.out.println(manual);
    }
}

