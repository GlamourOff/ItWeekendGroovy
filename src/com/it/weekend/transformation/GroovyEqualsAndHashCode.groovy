package com.it.weekend.transformation

import groovy.transform.EqualsAndHashCode

class GroovyEqualsAndHashCode {

    @EqualsAndHashCode
    private static class Human {
        String firstName
        String lastName
        int age

        @Override
        String toString() {
            "Human: (Last name - $lastName, First name - $firstName, Age - $age)"
        }
    }


    static void main(args) {
        def human1 = new Human(firstName: 'Dima', lastName: 'Voloshko', age: 30)
        def human2 = new Human(firstName: 'Dima', lastName: 'Voloshko', age: 30)
        def human3 = new Human(firstName: 'Dmitry', lastName: 'Voloshko', age: 30)
        def human4 = new Human(firstName: 'Dimon', lastName: 'Voloshko', age: 30)

        Set humans = [human1, human2, human3, human4]
        println "The Set object size = ${humans.size()} and contains: $humans"
    }
}
