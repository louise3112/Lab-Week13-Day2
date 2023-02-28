package carsTests;

import cars.Hybrid;
import cars.Size;
import components.Engine;
import components.Tyre;
import components.Windscreen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    private Hybrid hybridCar;
    private Size size;
    private Windscreen windscreen;
    private Engine engine;
    private Tyre tyre;

    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        windscreen = new Windscreen(200.00, 0);
        tyre = new Tyre(80.00, 2);
        hybridCar = new Hybrid(3000.00, "BMW", size.FAMILY, "silver", engine, windscreen, tyre);
    }

    @Test
    public void canGetCarParts() {
        assertEquals(3, hybridCar.getCarParts().size());
    }
}
