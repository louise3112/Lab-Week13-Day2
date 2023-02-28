package carPartsTests;

import carParts.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    private Battery battery;

    @Before
    public void before() {
        battery = new Battery(50.00, 2);
    }

    @Test
    public void canGetValue() {
        assertEquals(50.00, battery.getValue(), 0.0);
    }

    @Test
    public void canGetDamage() {
        assertEquals(2, battery.getDamage());
    }

    @Test
    public void canGetMaxDamage() {
        assertEquals(1, battery.getMaxDamage());
    }

}
