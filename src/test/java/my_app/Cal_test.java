package my_app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Cal_test {
	@Test
    public void testAdd() {
        Cal_sum cal = new Cal_sum();
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
}
