import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalcolatrice {

    @Test
    public void testDivide() {
        Calcolatrice calcolatrice = new Calcolatrice();

        // Test divisione normale
        assertEquals(2, calcolatrice.divide(6, 3));

        // Test divisione per zero
        try {
            calcolatrice.divide(10, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
