package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatorService calc = new CalculatorService();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== Scientific Calculator =====");
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
            int choice = sc.nextInt();

            double a,b;

            try {

                switch(choice) {

                    case 1:
                        System.out.print("Enter a: ");
                        a = sc.nextDouble();
                        System.out.print("Enter b: ");
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.add(a,b));
                        break;

                    case 2:
                        System.out.print("Enter a: ");
                        a = sc.nextDouble();
                        System.out.print("Enter b: ");
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.subtract(a,b));
                        break;

                    case 3:
                        System.out.print("Enter a: ");
                        a = sc.nextDouble();
                        System.out.print("Enter b: ");
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.multiply(a,b));
                        break;

                    case 4:
                        System.out.print("Enter a: ");
                        a = sc.nextDouble();
                        System.out.print("Enter b: ");
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.divide(a,b));
                        break;

                    case 5:
                        System.out.print("Enter base: ");
                        a = sc.nextDouble();
                        System.out.print("Enter power: ");
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.power(a,b));
                        break;

                    case 6:
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.sqrt(a));
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        int n = sc.nextInt();
                        System.out.println("Result: " + calc.factorial(n));
                        break;

                    case 8:
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.log(a));
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid option");
                }

            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
}