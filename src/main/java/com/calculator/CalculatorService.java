package com.calculator;

public class CalculatorService {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b)
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Square root of negative number");
        }
        return Math.sqrt(a);
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("Factorial of negative number");
        }

        long result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public double log(double a) {
        if (a <= 0) {
            throw new ArithmeticException("Log undefined for <= 0");
        }

        return Math.log(a);
    }
}