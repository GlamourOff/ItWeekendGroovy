package com.it.weekend.performance

import groovyx.gpars.GParsPool

class ParallelCollection {

    void each(List<Integer> list) {
        final long start = System.currentTimeMillis()
        list.each {it * 2}
        final long time = System.currentTimeMillis() - start;
        System.out.println("For-each time = " + (time / 1000.0) + " sec");
    }

    void eachParallel(final List<Integer> list) {
        final long start = System.currentTimeMillis()
        GParsPool.withPool {
            list.eachParallel {it * 2}
        }
        final long time = System.currentTimeMillis() - start;
        System.out.println("Parallel For-each time = " + (time / 1000.0) + " sec");
    }

    static void main(args) {
        def list = []
        1_000_000.times {list << it}

        def parallelCollection = new ParallelCollection()
        parallelCollection.each(list)
        parallelCollection.eachParallel(list)
    }
}
