package Creational.Prototype;

public class ObjectA implements Prototype {
    private Integer field = 0;

    public ObjectA(ObjectA objectA) {
        this.field = objectA.field;
    }

    public ObjectA() {
    }

    @Override
    public Prototype clone() {
        return new ObjectA(this);
    }

    @Override
    public Integer getField() {
        return field;
    }

    public void setField(final Integer field) {
        this.field = field;
    }
}
