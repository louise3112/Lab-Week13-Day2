package carOwnersTests;

import carOwners.Customer;
import carOwners.Dealership;
import carParts.Battery;
import carParts.Engine;
import carParts.FuelTank;
import cars.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Engine engine;
    Battery battery;
    FuelTank fuelTank;
    Size size;
    Fuel fuelCar;
    Hybrid hybridCar;
    Electric electricCar;
    ArrayList<Car> carStock, carCollection;
    Customer customer;

    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        battery = new Battery(80.00, 2);
        fuelTank = new FuelTank(200.00, 0);
        fuelCar = new Fuel(1000.00, "Toyota", size.COMPACT, "red", engine, fuelTank);
        electricCar = new Electric(5000.00, "Tesla", size.MIDSIZE, "black", engine, battery);
        hybridCar = new Hybrid(3000.00, "BMW", size.FAMILY, "silver", engine, fuelTank, battery);
        carStock = new ArrayList<>(Arrays.asList(fuelCar, hybridCar));

        dealership = new Dealership(20000.00, carStock);

        carCollection = new ArrayList<>(Arrays.asList(fuelCar, electricCar));
        customer = new Customer("Steve", 10000.00, carCollection);
    }

    @Test
    public void hasTill() {
        assertEquals(20000.00, dealership.getTill(), 0.0);
    }

    @Test
    public void hasCarStock() {
        assertEquals(2, dealership.getCarStock().size());
    }

    @Test
    public void canBuyACar() {
        dealership.buyCar(electricCar);
        assertEquals(3, dealership.getCarStock().size());
        assertEquals(15000, dealership.getTill(), 0.0);
    }

    @Test
    public void canSellACar() {
        dealership.sellCar(hybridCar, customer);
        assertEquals(1, dealership.getCarStock().size());
        assertEquals(23000, dealership.getTill(), 0.0);
        assertEquals(3, customer.getCarCollection().size());
        assertEquals(7000, customer.getMoney(), 0.0);
    }
}
