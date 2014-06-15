package com.it.weekend.transformation

import groovy.transform.ThreadInterrupt

class ThreadInterruptGroovy {

    @ThreadInterrupt
    private static class Execute implements Runnable {

        @Override
        void run() {
            while(true) {
                //if(Thread.currentThread().isInterrupted()) {throw new InterruptedException("Execution interrupted.")}
                //eats CPU
                println "Executing..."
            }
        }
    }

    static void main(args) {
        def thread = new Thread(new Execute())
        thread.start()

        Thread.sleep(100)
        thread.interrupt()
    }

}
