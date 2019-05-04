package hello.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhotovoltaicRepository extends CrudRepository<Photovoltaic, Integer> {

        List<Photovoltaic> findByName(String name);

        @Query("SELECT NEW hello.model.PhotovoltaicWithValue(p.name, p.latitude, p.longitude, sum(e.value)) FROM Photovoltaic p, EnergyReading e where e.photovoltaic.id = p.id group by p.id")
        public List<PhotovoltaicWithValue> findAllWithAggregatedEnergy();

}
