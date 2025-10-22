package com.example;

/**
 * Main application class
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins CI/CD Pipeline!");
        
        Calculator calculator = new Calculator();
        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("6 * 7 = " + calculator.multiply(6, 7));
        System.out.println("20 / 4 = " + calculator.divide(20, 4));
    }
}
