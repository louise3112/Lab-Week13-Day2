package carPartsTests;

import carParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(900.00, 0);
    }

    @Test
    public void canGetValue() {
        assertEquals(900.00, engine.getValue(), 0.0);
    }

    @Test
    public void canGetDamage() {
        assertEquals(0, engine.getDamage());
    }

    @Test
    public void canGetMaxDamage() {
        assertEquals(5, engine.getMaxDamage());
    }

    @Test
    public void canFix() {
        engine.fix();
        assertEquals(0, engine.getDamage());
    }

    @Test
    public void canDamage() {
        engine.damage();
        assertEquals(1, engine.getDamage());
    }

//    @Test
//    public void canGetPriceBySize() {
//        assertEquals(900.00, engine.getPriceBySize(size.FAMILY), 0.0);
//    }

}
