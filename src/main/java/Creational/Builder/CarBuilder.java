package Creational.Builder;

public class CarBuilder implements Builder {
    private Car car = new Car();

    @Override
    public void reset() {
        car.setInstruction("");
        car.setSeats(0);
        car.setInstruction("");
    }

    @Override
    public void setSeats(final Integer seats) {
        car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public Car getResult() {
        return car;
    }
}
