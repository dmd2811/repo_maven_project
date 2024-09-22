package my_app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
	@Test
    public void testAdd1() {
		Calculator cal = new Calculator();
		int result = cal.add(5, 5);
		assertEquals(10, result);
    }
	@Test
	public void testAdd2() {
		Calculator cal = new Calculator();
		int result = cal.add(1, 9);
		assertEquals(10, result);
    }
	@Test
    public void testAdd3() {
		Calculator cal = new Calculator();
		int result = cal.add(3, 7);
		assertEquals(10, result);
    }
	@Test
	public void testAdd4() {
		Calculator cal = new Calculator();
		int result = cal.add(8, 2);
		assertEquals(10, result);
    }
	@Test
    public void testAdd5() {
		Calculator cal = new Calculator();
		int result = cal.add(6, 4);
		assertEquals(10, result);
	}
	
}
