package Creational.Builder;

public class CarManualBuilder implements Builder {
    private Manual manual = new Manual();

    @Override
    public void reset() {
        manual.setEngine("");
        manual.setSeats(0);
    }

    @Override
    public void setSeats(Integer seats) {
        manual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    public Manual getResult() {
        return manual;
    }
}
