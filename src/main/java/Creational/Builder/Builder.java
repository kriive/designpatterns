package Creational.Builder;

public interface Builder {
    void reset();

    void setSeats(final Integer seats);

    void setEngine(final String engine);
}
