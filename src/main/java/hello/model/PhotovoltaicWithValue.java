package hello.model;

public class PhotovoltaicWithValue extends Photovoltaic {

    private Double value;

    public PhotovoltaicWithValue(String name, Float latitude, Float longitude, Double value) {
        super(latitude, longitude, name);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
