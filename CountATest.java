package lab10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountATest {

    @Test
    public void testCountA() {
        JUnitTesting obj = new JUnitTesting();
        int output = obj.countA("Java Application");
        assertEquals(4, output);
    }
}
