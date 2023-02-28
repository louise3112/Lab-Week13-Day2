package carsTests;

import cars.Electric;
import cars.Size;
import components.Engine;
import components.Tyre;
import components.Windscreen;
import org.junit.Before;
import org.junit.Test;

public class ElectricTest {

    private Electric electricCar;
    private Size size;
    private Engine engine;
    private Windscreen windscreen;
    private Tyre tyre;

    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        windscreen = new Windscreen(200.00, 0);
        tyre = new Tyre(80.00, 2);
        electricCar = new Electric(5000.00, "Tesla", size.MIDSIZE, "black", engine, windscreen, tyre);
    }

}
