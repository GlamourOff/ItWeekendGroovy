package com.it.weekend.transformation

import groovy.transform.Canonical

class CanonicalGroovy {

    @Canonical
    private static class Human {
        String firstName
        String lastName
        int age
    }

    static void main(args) {
        def human1 = new Human(firstName: 'Dima', lastName: 'Voloshko', age: 30)
        def human2 = new Human(firstName: 'Dima', lastName: 'Voloshko', age: 30)
        def human3 = new Human(firstName: 'Dmitry', lastName: 'Voloshko', age: 30)
        def human4 = new Human('Dimon', 'Voloshko', 30)

        Set humans = [human1, human2, human3, human4]
        println "The Set object size = ${humans.size()} and contains: $humans"

        human1.age = 31
        println "Human has been changed: $human1"
    }
}
