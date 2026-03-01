package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculatorService service = new CalculatorService();

        while (true) {

            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter number: ");
                        double sqrtInput = scanner.nextDouble();
                        double sqrtResult = service.squareRoot(sqrtInput);
                        System.out.println("Result: " + sqrtResult);
                        break;

                    case 2:
                        System.out.print("Enter integer: ");
                        int factInput = scanner.nextInt();
                        long factResult = service.factorial(factInput);
                        System.out.println("Result: " + factResult);
                        break;

                    case 3:
                        System.out.print("Enter number: ");
                        double logInput = scanner.nextDouble();
                        double logResult = service.naturalLog(logInput);
                        System.out.println("Result: " + logResult);
                        break;

                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();
                        double powerResult = service.power(base, exponent);
                        System.out.println("Result: " + powerResult);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (CalculatorException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}