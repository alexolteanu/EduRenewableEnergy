package hello.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import hello.model.WindTurbine;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called windTurbineRepository
// CRUD refers Create, Read, Update, Delete

public interface WindTurbineRepository extends CrudRepository<WindTurbine, Integer> {

    List<WindTurbine> findByName(String name);

    @Query("SELECT NEW hello.model.WindTurbineWithValue(w.name, w.latitude, w.longitude, sum(e.value)) FROM WindTurbine w, EnergyReading e where e.windTurbine.id = w.id group by w.id")
    public List<WindTurbineWithValue> findAllWithAggregatedEnergy();

}