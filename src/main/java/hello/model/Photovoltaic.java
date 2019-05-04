package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photovoltaic {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Float latitude;
    private Float longitude;
    private String name;

    public Photovoltaic() {
    }
    public Photovoltaic(Float latitude, Float longitude, String name){
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }
    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }
}
