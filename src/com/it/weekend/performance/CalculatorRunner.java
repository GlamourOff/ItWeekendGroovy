package com.it.weekend.performance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Test calculator performance
 */
public class CalculatorRunner {

    public static void main(String[] args) {
        final long PREHEAT = 100 * 1000;
        performanceTestJava(PREHEAT);
        testReflectionCall(PREHEAT);
        performanceTestGroovyNoCompile(PREHEAT);
        performanceTestGroovyCompile(PREHEAT);

        final long CNT = 1000 * 1000 * 1000;
        performanceTestJava(CNT);
        testReflectionCall(CNT);
        performanceTestGroovyNoCompile(CNT);
        performanceTestGroovyCompile(CNT);
    }

    private static void performanceTestJava(final long cnt) {
        final long start = System.currentTimeMillis();
        double value = 0;
        for (long i = 0; i < cnt; ++i) {
            value = JavaCalculator.process(value);
        }
        final long time = System.currentTimeMillis() - start;
        System.out.println("Java time = " + (time / 1000.0) + " sec");
    }

    private static void performanceTestGroovyNoCompile(final long cnt) {
        final long start = System.currentTimeMillis();
        double value = 0;
        for (long i = 0; i < cnt; ++i) {
            value = GroovyCalculator.process(value);
        }
        final long time = System.currentTimeMillis() - start;
        System.out.println("Groovy no precompile time = " + (time / 1000.0) + " sec");
    }

    private static void performanceTestGroovyCompile(final long cnt) {
        final long start = System.currentTimeMillis();
        double value = 0;
        for (long i = 0; i < cnt; ++i) {
            value = GroovyStaticCalculator.process(value);
        }
        final long time = System.currentTimeMillis() - start;
        System.out.println("Groovy with precompile time = " + (time / 1000.0) + " sec");
    }

    private static void testReflectionCall(final long cnt) {
        try {
            final Method method = JavaCalculator.class.getDeclaredMethod("process", double.class);
            final long start = System.currentTimeMillis();
            double value = 0;
            for (long i = 0; i < cnt; ++i)
                value = (Double) method.invoke(null, value);
            final long time = System.currentTimeMillis() - start;
            System.out.println("Java reflection time = " + (time / 1000.0) + " sec");
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
