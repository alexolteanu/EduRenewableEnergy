package hello.model;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called energyReadingRepository
// CRUD refers Create, Read, Update, Delete

public interface EnergyReadingRepository extends CrudRepository<EnergyReading, Integer> {

}