package my_app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
	@Test
    public void testAdd() {
		Calculator cal = new Calculator();
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
}
