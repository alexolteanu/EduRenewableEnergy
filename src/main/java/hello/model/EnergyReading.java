package hello.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity // This tells Hibernate to make a table out of this class
public class EnergyReading {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="wind_turbine_id", nullable=false)
    private WindTurbine windTurbine;

    private Timestamp time;

    private Float value;

    public EnergyReading(WindTurbine windTurbine, Timestamp time, Float value) {
        this.windTurbine = windTurbine;
        this.time = time;
        this.value = value;
    }

    public EnergyReading(){

    }

    public WindTurbine getWindTurbine() {
        return windTurbine;
    }

    public Timestamp getTime() {
        return time;
    }

    public Float getValue() {
        return value;
    }

}
