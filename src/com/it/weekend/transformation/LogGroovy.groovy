package com.it.weekend.transformation

import groovy.util.logging.Log

class LogGroovy {

    @Log
    private static class Human {
        String firstName
        String lastName
        int age

        Human(String firstName, String lastName, int age) {
            this.firstName = firstName
            this.lastName = lastName
            this.age = age
            log.info('Human constructed')
        }
    }

    static void main(args) {
        new Human('Dima', 'Voloshko', 30)
    }
}
