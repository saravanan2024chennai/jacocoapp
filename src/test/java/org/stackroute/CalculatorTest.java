package org.stackroute;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(1, 4));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(-2, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    @Test
    void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(3));
        assertTrue(calculator.isEven(0));
    }

    @Test
    void testGreet() {
        assertEquals("Hello, John!", calculator.greet("John"));
        assertEquals("Hello, Guest!", calculator.greet(null)); // Test for null input
        assertEquals("Hello, Guest!", calculator.greet(""));   // Test for empty input
    }
}
