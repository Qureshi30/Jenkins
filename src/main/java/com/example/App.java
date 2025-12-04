package com.example;

/**
 * Main application class
 * Demonstrates calculator functionality
 * 
 * @author Jenkins Demo Team
 * @version 1.0
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Welcome to Jenkins Calculator Demo!");
        System.out.println("========================================\n");
        
        Calculator calculator = new Calculator();
        
        // Basic operations
        System.out.println("Basic Operations:");
        System.out.println("  5 + 3 = " + calculator.add(5, 3));
        System.out.println("  10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("  6 * 7 = " + calculator.multiply(6, 7));
        System.out.println("  20 / 4 = " + calculator.divide(20, 4));
        
        // Advanced operations
        System.out.println("\nAdvanced Operations:");
        System.out.println("  2^8 = " + calculator.power(2, 8));
        System.out.println("  √64 = " + calculator.sqrt(64));
        System.out.println("  17 % 5 = " + calculator.modulo(17, 5));
        
        System.out.println("\n========================================");
        System.out.println("  Calculator Demo Completed!");
        System.out.println("========================================");
    }
}
