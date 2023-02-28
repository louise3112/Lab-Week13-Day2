package componentsTests;

import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    private Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre (50.00, 2);
    }

    @Test
    public void canGetValue() {
        assertEquals(50.00, tyre.getValue(), 0.0);
    }

    @Test
    public void canGetDamage() {
        assertEquals(2, tyre.getDamage());
    }

    @Test
    public void canGetMaxDamage() {
        assertEquals(3, tyre.getMaxDamage());
    }

}
