package web.model;

public class Car {
    private int id;
    private String model;
    private float enjine;

    public Car(int id, String model, float enjine) {
        this.id = id;
        this.model = model;
        this.enjine = enjine;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public float getEnjine() {
        return enjine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", enjine=" + enjine +
                '}';
    }
}
