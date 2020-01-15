package Creational.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton stn = Singleton.getInstance();

        System.out.println(stn.getBlu());

        Singleton stnTheSecond = Singleton.getInstance();
        System.out.println(stnTheSecond.getBlu());
    }
}
