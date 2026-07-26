/*
 * Student Name: KHADIJA ABID
 * Seat Number: B25110006065
 * Section: B
 * Date: 25 July 2026
 * File: Main.java
 * Purpose: Demonstrates normal and edge cases for Calculator operations.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("BASIC OPERATIONS");
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));

        System.out.println("\nNEW OPERATION 1 - MODULUS");
        System.out.println("Normal case: 17 % 5 = " + calculator.modulus(17, 5));
        try {
            calculator.modulus(17, 0);
        } catch (IllegalArgumentException exception) {
            System.out.println("Edge case: " + exception.getMessage());
        }

        System.out.println("\nNEW OPERATION 2 - POWER");
        System.out.println("Normal case: 2^5 = " + calculator.power(2, 5));
        System.out.println("Edge case: 9^0 = " + calculator.power(9, 0));

        System.out.println("\nNEW OPERATION 3 - AVERAGE WITH VARARGS");
        System.out.println("Normal case: average(10, 20, 30, 40) = "
                + calculator.average(10, 20, 30, 40));
        try {
            calculator.average();
        } catch (IllegalArgumentException exception) {
            System.out.println("Edge case: " + exception.getMessage());
        }

        System.out.println("\nNEW OPERATION 4 - MAXIMUM WITH VARARGS");
        System.out.println("Normal case: maximum(4, 18, 7, 12) = "
                + calculator.maximum(4, 18, 7, 12));
        try {
            calculator.maximum();
        } catch (IllegalArgumentException exception) {
            System.out.println("Edge case: " + exception.getMessage());
        }

        System.out.println("\nINVALID DIVISION TEST");
        try {
            calculator.divide(10, 0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
