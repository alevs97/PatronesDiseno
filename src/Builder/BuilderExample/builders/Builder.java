package Builder.BuilderExample.builders;

import Builder.BuilderExample.cars.CarType;
import Builder.BuilderExample.components.Engine;
import Builder.BuilderExample.components.GPSNavigator;
import Builder.BuilderExample.components.Transmission;
import Builder.BuilderExample.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

