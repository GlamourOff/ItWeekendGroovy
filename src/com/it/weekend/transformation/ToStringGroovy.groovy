package com.it.weekend.transformation

import groovy.transform.ToString

class ToStringGroovy {

    @ToString(includeNames = true, includePackage = false)
    private static class Human {
        String firstName
        String lastName
        int age
    }

    static void main(args) {
        println new Human(firstName: 'Dima', lastName: 'Voloshko', age: 30)
    }
}
