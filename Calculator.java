/*
 * Student Name: KHADIJA ABID
 * Seat Number: B25110006065
 * Section: B
 * Date: 25 July 2026
 * File: Calculator.java
 * Purpose: Provides basic and extended calculator operations.
 */
public class Calculator {
    public Calculator() {
        // This calculator is stateless, so no fields need initialization.
    }

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return first / second;
    }

    public double modulus(double first, double second) {
        if (second == 0.0) {
            throw new IllegalArgumentException("Cannot calculate modulus by zero.");
        }
        return first % second;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Average needs at least one number.");
        }

        double total = 0.0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    public double maximum(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Maximum needs at least one number.");
        }

        double largest = numbers[0];
        for (double number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
}
