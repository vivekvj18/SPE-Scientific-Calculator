package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    public void testSquareRootValid() throws CalculatorException {
        assertEquals(5.0, service.squareRoot(25));
    }

    @Test
    public void testFactorialValid() throws CalculatorException {
        assertEquals(120, service.factorial(5));
    }

    @Test
    public void testNaturalLogValid() throws CalculatorException {
        assertEquals(Math.log(10), service.naturalLog(10));
    }

    @Test
    public void testPowerValid() {
        assertEquals(8.0, service.power(2, 3));
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(CalculatorException.class, () -> {
            service.squareRoot(-9);
        });
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(CalculatorException.class, () -> {
            service.factorial(-5);
        });
    }

    @Test
    public void testNaturalLogZero() {
        assertThrows(CalculatorException.class, () -> {
            service.naturalLog(0);
        });
    }
}