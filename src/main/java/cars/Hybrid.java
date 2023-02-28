package cars;

import carParts.Engine;
import carParts.Battery;
import carParts.FuelTank;

public class Hybrid extends Car {

    public Hybrid (double value, String make, Size size, String colour, Engine engine, FuelTank fuelTank, Battery battery) {
        super(value, make, size, colour, engine);
        this.addCarPart("fuelTank", fuelTank);
        this.addCarPart("battery", battery);
    }
}
