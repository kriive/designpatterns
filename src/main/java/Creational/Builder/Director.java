package Creational.Builder;

public class Director {
    public void makeSUV(final Builder builder) {
        builder.setEngine("BIG");
        builder.setSeats(8);
    }

    public void makeSportsCar(final Builder builder) {
        builder.setEngine("SUPERFAST");
        builder.setSeats(2);
    }
}
