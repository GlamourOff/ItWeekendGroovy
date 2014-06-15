package com.it.weekend.operation


class PropertyOperation {
    def storage = [:]

    def getProperty(String name) {
        storage[name]
    }

    void setProperty(String name, value) {
        storage[name] = value
    }


    static void main(args) {
        def propertyOperation = new PropertyOperation()
        propertyOperation.cool = "yeah"
        println "The value is: $propertyOperation.cool"
    }
}
