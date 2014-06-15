package com.it.weekend.transformation

import groovy.transform.ToString

class SingletonGroovy {

    @ToString(includeNames = true, includePackage = false)
    @Singleton
    private static class Human {
        String firstName
        String lastName
        int age
    }

    static void main(args) {
        //println new Human(firstName: 'Dima', lastName: 'Voloshko', age: 30)
        Human.instance.firstName = 'Dima'
        Human.instance.lastName = 'Voloshko'
        Human.instance.age = 30

        println Human.instance
    }
}
