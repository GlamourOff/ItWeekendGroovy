package com.it.weekend.transformation

import groovy.transform.InheritConstructors
import groovy.transform.ToString

class InheritConstructorGroovy {

    @ToString(includePackage = false)
    private abstract static class Human {
        String firstName
        String lastName
        int age

        Human(String firstName) {
            this.firstName = firstName
        }

        Human(String firstName, String lastName) {
            this(firstName)
            this.lastName = lastName
        }

        Human(String firstName, String lastName, int age) {
            this(firstName, lastName)
            this.age = age
        }

        abstract getSex()
    }

    @ToString(includePackage = false, includeSuper = true)
    @InheritConstructors
    private static class Man extends Human {
        String sex = 'Male'
    }

    @ToString(includePackage = false, includeSuper = true)
    @InheritConstructors
    private static class Woman extends Human {
        String sex = 'Female'
    }

    static void main(args) {
        println new Man('Dima')
        println new Man('Dima', 'Voloshko')
        println new Woman('Glasha', 'Kukurova', 30)
    }

}
