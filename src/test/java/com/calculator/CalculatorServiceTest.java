package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    CalculatorService calc = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2,3));
        assertEquals(0, calc.add(-2,2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3,2));
        assertEquals(-4, calc.subtract(-2,2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2,3));
        assertEquals(0, calc.multiply(0,5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6,3));
        assertThrows(ArithmeticException.class, () -> calc.divide(5,0));
    }

    @Test
    public void testPower() {
        assertEquals(8, calc.power(2,3));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3, calc.sqrt(9));
        assertThrows(ArithmeticException.class, () -> calc.sqrt(-1));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertThrows(ArithmeticException.class, () -> calc.factorial(-3));
    }

    @Test
    public void testLog() {
        assertEquals(0, calc.log(1));
        assertThrows(ArithmeticException.class, () -> calc.log(0));
    }
}