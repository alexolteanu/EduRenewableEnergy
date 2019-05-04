package hello.service;

import hello.model.EnergyReading;
import hello.model.WindTurbine;
import org.springframework.stereotype.Service;

@Service
public class TurbineServiceImpl {

    public String combine(WindTurbine windTurbine, EnergyReading energyReading) {

        return windTurbine.getName() + energyReading.getValue();

    }
}
