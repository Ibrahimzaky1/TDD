import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    void testPositiveNumber() {
        Calculator Pos = new Calculator();
        assertTrue(Pos.isPositive(5));
        assertFalse(Pos.isPositive(-5));
        assertFalse(Pos.isPositive(0));
    }
}