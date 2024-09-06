import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 8 };
        assertFalse("Should not be equal", ArrayUtils.areEqual(a1, a2));
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 14 } };
        assertFalse("Should not be equal", ArrayUtils.areEqual(a11, a12));
    }

    @Test
    public void testDifferentTypesArrayEquality() {
        // Test for String arrays
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals("String arrays should be equal", s1, s2);

        // Test for double arrays
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals("Double arrays should be equal", d1, d2, 0.0);
    }
}