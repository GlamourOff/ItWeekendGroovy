package com.it.weekend.operation

import java.util.regex.Pattern

class GroovyOperation {

    void safeOperationJava() {
        String string = null;
        if(string != null) {
            string = string.toUpperCase();
        }
        println "Exception was not thrown in Java: $string"
    }

    void safeOperation() {
        String string = null
        string = string?.toUpperCase()
        println "Exception was not thrown in Groovy: $string"
    }

    void elvisJava() {
        String string = null;
        string = string != null ? string : "string".toUpperCase();
        println "The Java String is: $string"
    }

    void elvis() {
        String string = null
        string = string ?: "string".toUpperCase()
        println "The Groovy String is: $string"
    }

    void findString() {
        def string = "This is IT-Weekend"
        //Creates a Matcher
        println "The String contains 'end': ${(string =~ /end/) as boolean}"
    }

    void matchString() {
        def string = "IT-Weekend"
        println "The String is 'IT': ${string ==~ /IT/}"
    }

    static void main(args) {
        def groovyOperation = new GroovyOperation()
        groovyOperation.safeOperationJava()
        groovyOperation.safeOperation()
        groovyOperation.elvisJava()
        groovyOperation.elvis()
        groovyOperation.findString()
        groovyOperation.matchString()
    }
}
