package cars;

import carParts.Engine;
import carParts.Battery;
import carParts.FuelTank;

public class Fuel extends Car {

    public Fuel (double value, String make, Size size, String colour, Engine engine, FuelTank fuelTank) {
        super(value, make, size, colour, engine);
        this.addCarPart("fuelTank", fuelTank);
    }

}
