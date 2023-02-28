package cars;

import carParts.Engine;
import carParts.Battery;
import carParts.FuelTank;

public class Electric extends Car {

    public Electric (double value, String make, Size size, String colour, Engine engine, Battery battery) {
        super(value, make, size, colour, engine);
        this.addCarPart("battery", battery);
    }
}
