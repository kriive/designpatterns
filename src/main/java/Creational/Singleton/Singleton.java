package Creational.Singleton;

public class Singleton {
    private static Singleton theInstance = new Singleton(678);
    private Integer blu;

    private Singleton(final Integer in) {
        this.blu = in;
    }

    public Integer getBlu() {
        return this.blu;
    }

    public static Singleton getInstance() {
        return theInstance;
    }
}
