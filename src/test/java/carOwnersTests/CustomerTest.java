package carOwnersTests;

import carOwners.Customer;
import carParts.Battery;
import carParts.Engine;
import carParts.FuelTank;
import cars.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Battery battery;
    FuelTank fuelTank;
    Size size;
    Fuel fuelCar;
    Hybrid hybridCar;
    Electric electricCar;
    ArrayList<Car> carCollection;

    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        battery = new Battery(80.00, 2);
        fuelTank = new FuelTank(200.00, 0);
        fuelCar = new Fuel (1000.00, "Toyota", size.COMPACT, "red", engine, fuelTank);
        electricCar = new Electric(5000.00, "Tesla", size.MIDSIZE, "black", engine, battery);
        hybridCar = new Hybrid(3000.00, "BMW", size.FAMILY, "silver", engine, fuelTank, battery);
        carCollection = new ArrayList<>(Arrays.asList(fuelCar, electricCar));

        customer = new Customer("Steve", 10000.00, carCollection);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(10000.00, customer.getMoney(), 0.0);
    }

    @Test
    public void hasCarCollection() {
        assertEquals(2, customer.getCarCollection().size());
    }

    @Test
    public void canBuyACar() {
        customer.buyCar(hybridCar);
        assertEquals(3, customer.getCarCollection().size());
        assertEquals(7000.00, customer.getMoney(), 0.0);
    }
}
