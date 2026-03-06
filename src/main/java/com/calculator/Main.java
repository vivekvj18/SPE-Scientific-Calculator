package com.calculator;

import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println("\n===== Scientific Calculator =====");
        System.out.println("0. Show Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.println("7. Factorial");
        System.out.println("8. Natural Log");
        System.out.println("9. Exit");
        System.out.print("Choose option: ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculatorService service = new CalculatorService();

        showMenu();

        while (true) {

            int choice = scanner.nextInt();

            switch (choice) {

                case 0:
                    showMenu();
                    break;

                case 1:
                    System.out.print("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + service.add(a, b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    System.out.println("Result: " + service.subtract(a, b));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    System.out.println("Result: " + service.multiply(a, b));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    System.out.println("Result: " + service.divide(a, b));
                    break;

                case 5:
                    System.out.print("Enter base: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    b = scanner.nextDouble();
                    System.out.println("Result: " + service.power(a, b));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    a = scanner.nextDouble();
                    System.out.println("Result: " + service.sqrt(a));
                    break;

                case 7:
                    System.out.print("Enter number: ");
                    int n = scanner.nextInt();
                    System.out.println("Result: " + service.factorial(n));
                    break;

                case 8:
                    System.out.print("Enter number: ");
                    a = scanner.nextDouble();
                    System.out.println("Result: " + service.log(a));
                    break;

                case 9:
                    System.out.println("Exiting calculator...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Press 0 to show menu again.");
            }

            System.out.print("\nEnter next option (0 to show menu): ");
        }
    }
}