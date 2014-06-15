package com.it.weekend.operation

class JavaFieldOperation {
    String name

    String getName() {
        return "$name and Overriden Getter"
    }

    void setName(String name) {
        this.name = "Overriden $name"
    }


    static void main(args) {
        JavaFieldOperation overriddenField = new JavaFieldOperation()
        overriddenField.name = "Setter"
        println "The name is: $overriddenField.name"

        JavaFieldOperation field = new JavaFieldOperation()
        field.@name = "Setter"
        println "The name is: ${field.@name}"

        println ([overriddenField, field]*.@name)
    }
}
