package hello.model;

public class WindTurbineWithValue extends WindTurbine {

    private Double value;

    public WindTurbineWithValue(String name, Float latitude, Float longitude, Double value) {
        super(latitude, longitude, name);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
