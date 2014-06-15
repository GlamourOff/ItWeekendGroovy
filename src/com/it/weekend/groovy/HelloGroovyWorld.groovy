package com.it.weekend.groovy

class HelloGroovyWorld {
    String name

    String greet() {
        "Hello $name"
    }

    static void main(args) {
        def hello = new HelloGroovyWorld(name: "Java")
        println hello.greet()
    }
}
