package componentsTests;

import components.Windscreen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WindscreenTest {

    private Windscreen windscreen;

    @Before
    public void before() {
        windscreen = new Windscreen(80.00, 0);
    }

//    @Test
//    public void canGetPriceBySize() {
//        assertEquals(100.00, windscreen.getPriceBySize(size.MIDSIZE), 0.0);
//    }

    @Test
    public void getValue() {
        assertEquals(80.00, windscreen.getValue(), 0.0);
    }

    @Test
    public void getDamage() {
        assertEquals(0, windscreen.getDamage());
    }

    @Test
    public void canGetMaxDamage() {
        assertEquals(1, windscreen.getMaxDamage());
    }
}
