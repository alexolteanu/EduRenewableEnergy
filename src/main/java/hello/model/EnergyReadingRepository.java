package hello.model;

import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called energyReadingRepository
// CRUD refers Create, Read, Update, Delete

public interface EnergyReadingRepository extends CrudRepository<EnergyReading, Integer> {

    List<EnergyReading> findByWindTurbineAndTime(WindTurbine windTurbine, Timestamp time);

    List<EnergyReading> findByPhotovoltaicAndTime(Photovoltaic photovoltaic, Timestamp time);


}