package com.it.weekend.performance;

/**
 * Java implementation of a calculator
 */
public class JavaCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double process(double value) {
        double res1 = add(value, 1d);
        double res2 = mult(res1, 2d);
        double res3 = div(res2, 2d);
        return add(res3, -1d);
    }
}
