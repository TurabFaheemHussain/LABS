package lab10;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ArrayOperationsTest {
    @Test
    public void testFindMax() {
        ArrayOperations obj = new ArrayOperations();
        int[] arr = {5, 2, 9, 1, 7};
        assertEquals(9, obj.findMax(arr));
    }
    @Test
    public void testFindMin() {
        ArrayOperations obj = new ArrayOperations();
        int[] arr = {5, 2, 9, 1, 7};
        assertEquals(1, obj.findMin(arr));
    }
}
