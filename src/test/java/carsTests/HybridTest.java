package carsTests;

import cars.Hybrid;
import cars.Size;
import carParts.Engine;
import carParts.Battery;
import carParts.FuelTank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    private Hybrid hybridCar;
    private Size size;
    private FuelTank fuelTank;
    private Engine engine;
    private Battery battery;

    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        fuelTank = new FuelTank(200.00, 0);
        battery = new Battery(80.00, 2);
        hybridCar = new Hybrid(3000.00, "BMW", size.FAMILY, "silver", engine, fuelTank, battery);
    }

    @Test
    public void canGetCarParts() {
        assertEquals(3, hybridCar.getCarParts().size());
    }
}
