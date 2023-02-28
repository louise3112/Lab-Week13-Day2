package carsTests;

import cars.Electric;
import cars.Size;
import carParts.Engine;
import carParts.Battery;
import carParts.FuelTank;
import org.junit.Before;

public class ElectricTest {

    private Electric electricCar;
    private Size size;
    private Engine engine;
    private Battery battery;

    @Before
    public void before() {
        engine = new Engine(500.00, 1);
        battery = new Battery(80.00, 2);
        electricCar = new Electric(5000.00, "Tesla", size.MIDSIZE, "black", engine, battery);
    }

}
