package cars;

import components.Engine;
import components.Tyre;
import components.Windscreen;

public class Hybrid extends Car {

    public Hybrid (double value, String make, Size size, String colour, Engine engine, Windscreen windscreen, Tyre tyre) {
        super(value, make, size, colour, engine, windscreen, tyre);
    }
}
