package lab10;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void testSquare() {
        JUnitTesting obj = new JUnitTesting();
        int output = obj.square(5);
        assertEquals(25, output);
    }
}
