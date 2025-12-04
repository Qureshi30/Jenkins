package com.example;

/**
 * A simple calculator class for demonstration
 * Supports basic arithmetic operations
 * 
 * @author Jenkins Demo Team
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts second number from first
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divides first number by second
     * @param a dividend
     * @param b divisor
     * @return quotient of a divided by b
     * @throws IllegalArgumentException if divisor is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    /**
     * Calculates the power of a number
     * @param base the base number
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
    
    /**
     * Calculates the square root of a number
     * @param number the number to calculate square root for
     * @return square root of the number
     * @throws IllegalArgumentException if number is negative
     */
    public double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }
    
    /**
     * Calculates the modulo (remainder) of division
     * @param a dividend
     * @param b divisor
     * @return remainder of a divided by b
     * @throws IllegalArgumentException if divisor is zero
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot perform modulo with zero divisor");
        }
        return a % b;
    }
}
