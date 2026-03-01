package com.calculator;

public class CalculatorService {

    public double squareRoot(double x) throws CalculatorException{
        if (x < 0) {
            throw new CalculatorException("Square root is not defined for negative numbers.");
        }

        return Math.sqrt(x);
    }

    public long factorial(int n) throws CalculatorException {

        if (n < 0) {
            throw new CalculatorException("Factorial is not defined for negative numbers.");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public double naturalLog(double x) throws CalculatorException {

        if (x <= 0) {
            throw new CalculatorException("Natural log is defined only for positive numbers.");
        }

        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

}
