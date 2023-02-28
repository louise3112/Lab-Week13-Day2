package carPartsTests;

import carParts.FuelTank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuelTankTest {

    private FuelTank fuelTank;

    @Before
    public void before() {
        fuelTank = new FuelTank(80.00, 0);
    }

    @Test
    public void getValue() {
        assertEquals(80.00, fuelTank.getValue(), 0.0);
    }

    @Test
    public void getDamage() {
        assertEquals(0, fuelTank.getDamage());
    }

    @Test
    public void canGetMaxDamage() {
        assertEquals(3, fuelTank.getMaxDamage());
    }
}
