package carsTests;

import cars.Fuel;
import cars.Size;
import components.Engine;
import components.Tyre;
import components.Windscreen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuelTest {

    private Fuel fuelCar;
    private Size size;
    private Windscreen windscreen;
    private Engine engine;
    private Tyre tyre;

    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        windscreen = new Windscreen(200.00, 0);
        tyre = new Tyre(80.00, 2);
        fuelCar = new Fuel (1000.00, "Toyota", size.COMPACT, "red", engine, windscreen, tyre);
    }

    @Test
    public void canGetValue() {
        assertEquals(1000.00, fuelCar.getValue(), 0.0);
    }

    @Test
    public void canGetMake() {
        assertEquals("Toyota", fuelCar.getMake());
    }

    @Test
    public void canGetSize() {
        assertEquals(size.COMPACT, fuelCar.getSize());
    }

    @Test
    public void canGetColour() {
        assertEquals("red", fuelCar.getColour());
    }
}
