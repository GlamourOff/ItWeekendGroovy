package com.it.weekend.performance

import groovy.transform.CompileStatic

/**
 * Groovy implementation of a calculator using static compilation
 */
class GroovyStaticCalculator {

    @CompileStatic
    static double add(double a, double b) {
        a + b
    }

    @CompileStatic
    static double mult(double a, double b) {
        a * b
    }

    @CompileStatic
    static double div(double a, double b) {
        a / b
    }

    @CompileStatic
    static double process(double value) {
        double res1 = add(value, 1d)
        double res2 = mult(res1, 2d)
        double res3 = div(res2, 2d)
        add(res3, -1d)
    }
}
