package org.example;

public class Calculator {

    private final double a;
    private final double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        else return a / b;
    }



}
