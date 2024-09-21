package my_app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
	@Test
    public void testAdd1() {
		Calculator cal = new Calculator();
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
	@Test
    public void testAdd2() {
		Calculator cal = new Calculator();
        int result = cal.add(2, 4);
        assertEquals(5, result);
    }
	@Test
    public void testAdd3() {
		Calculator cal = new Calculator();
        int result = cal.add(3, 2);
        assertEquals(5, result);
    }
	@Test
    public void testAdd4() {
		Calculator cal = new Calculator();
        int result = cal.add(4, 4);
        assertEquals(5, result);
    }
	@Test
    public void testAdd5() {
		Calculator cal = new Calculator();
        int result = cal.add(6, 3);
        assertEquals(5, result);
    }
}
