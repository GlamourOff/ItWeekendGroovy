package com.it.weekend.transformation

import groovy.transform.WithReadLock
import groovy.transform.WithWriteLock

import java.util.concurrent.locks.ReadWriteLock
import java.util.concurrent.locks.ReentrantReadWriteLock

class ReadWriteLockGroovy {

    private static class ProviderGroovy {

        private final Map<String, String> data = [:]

        @WithReadLock
        String getResource(String key) {
            data[key]
        }

        @WithWriteLock
        void setResource(String key, String value) {
            data[key] = value
        }
    }

    private static class ProviderJava {
        private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        private final Map<String, String> data = new HashMap<>();

        String getResource(String key) {
            readWriteLock.readLock().lock();
            try {
                return data.get(key);
            } finally {
                readWriteLock.readLock().unlock();
            }
        }

        void setResource(String key, String value) {
            readWriteLock.writeLock().lock();
            try {
                data.put(key, value)

            } finally {
                readWriteLock.writeLock().unlock()
            }
        }
    }

    static void main(args) {
        def provider = new ProviderGroovy()
        Thread.start {
            1000.times {provider.setResource(it.toString(), it.toString())}
        }

        1000.times {println provider.getResource(it.toString())}
    }

}
