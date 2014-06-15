package com.it.weekend.transformation

import groovy.transform.ToString
import groovy.transform.TupleConstructor

class TupleConstructorGroovy {

    @ToString(includeNames = true, includePackage = false)
    @TupleConstructor
    private static class Human {
        String firstName
        String lastName
        int age
    }

    static void main(args) {
        println new Human('Dima')
        println new Human('Dima', 'Voloshko')
        println new Human('Glasha', 'Kukurova', 30)
    }
}
