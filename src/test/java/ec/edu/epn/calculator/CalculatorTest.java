package ec.edu.epn.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int result = calculator.sum(3, 3);
        assertEquals(6, result);
    }

    @Test
    public void testMinus() {
        int result = calculator.minus(3, 3);
        assertEquals(0, result);
    }

    @Test
    public void testDivideSuccess() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideFail() {
        assertThrows(ArithmeticException.class,
                    () -> calculator.divide(10, 0));
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

}
