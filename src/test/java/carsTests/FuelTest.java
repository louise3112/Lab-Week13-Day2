package carsTests;

import cars.Fuel;
import cars.Size;
import carParts.Engine;
import carParts.Battery;
import carParts.FuelTank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FuelTest {

    private Fuel fuelCar;
    private Size size;
    private Engine engine;
    private FuelTank fuelTank;


    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        fuelTank = new FuelTank(200.00, 0);
        fuelCar = new Fuel (1000.00, "Toyota", size.COMPACT, "red", engine, fuelTank);
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

    @Test
    public void canGetCarParts() {
        assertEquals(2, fuelCar.getCarParts().size());
    }

    @Test
    public void hasAnEngine() {
        assertEquals(engine, fuelCar.getCarPartByType("engine"));
    }

    @Test
    public void hasAFuelTank() {
        assertEquals(fuelTank, fuelCar.getCarPartByType("fuelTank"));
    }


}
