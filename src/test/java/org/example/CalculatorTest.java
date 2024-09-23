package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator(2, 3);
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator(5, 3);
        assertEquals(2, calculator.sub(5, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator(2, 3);
        assertEquals(6, calculator.mul(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator(6, 3);
        assertEquals(2, calculator.div(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator(6, 0);
        assertThrows(IllegalArgumentException.class, () -> calculator.div(6, 0));
    }
}