package com.example;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Unit tests for Calculator class
 * 
 * @author Jenkins Demo Team
 * @version 1.0
 */
public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-8, calculator.add(-5, -3));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-10, calculator.subtract(-5, 5));
        assertEquals(-2, calculator.subtract(-5, -3));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-25, calculator.multiply(-5, 5));
        assertEquals(15, calculator.multiply(-5, -3));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
        assertEquals(-1.0, calculator.divide(-5, 5), 0.001);
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
    
    @Test
    public void testPower() {
        assertEquals(256.0, calculator.power(2, 8), 0.001);
        assertEquals(1000.0, calculator.power(10, 3), 0.001);
        assertEquals(1.0, calculator.power(5, 0), 0.001);
        assertEquals(0.25, calculator.power(2, -2), 0.001);
    }
    
    @Test
    public void testSqrt() {
        assertEquals(8.0, calculator.sqrt(64), 0.001);
        assertEquals(10.0, calculator.sqrt(100), 0.001);
        assertEquals(0.0, calculator.sqrt(0), 0.001);
        assertEquals(1.414, calculator.sqrt(2), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSqrtNegative() {
        calculator.sqrt(-25);
    }
    
    @Test
    public void testModulo() {
        assertEquals(2, calculator.modulo(17, 5));
        assertEquals(0, calculator.modulo(20, 4));
        assertEquals(3, calculator.modulo(23, 10));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testModuloByZero() {
        calculator.modulo(10, 0);
    }
}
