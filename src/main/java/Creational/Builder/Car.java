package Creational.Builder;

public class Car {
    private Integer seats = 2;
    private String engine = "HR40";
    private String firstTripComputerInstruction = "F*CK";

    public void setSeats(final Integer seats) {
        this.seats = seats;
    }

    public void setInstruction(final String instruction) {
        this.firstTripComputerInstruction = instruction;
    }

    public void setEngine(final String engine) {
        this.engine = engine;
    }
}
