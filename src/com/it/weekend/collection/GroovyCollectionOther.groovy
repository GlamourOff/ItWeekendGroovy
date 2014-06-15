package com.it.weekend.collection

class GroovyCollectionOther {

    void group() {
        def list = ['BMW', 'Ford GT', 'Chevrolet', 'Mercedes', 'Mazda3', 'Mazda6', 'Nissan']
        println "The gouped map ${list.groupBy {it.size()}}"
    }

    void sort() {
        def list = ['BMW', 'Ford GT', 'Chevrolet', 'Mercedes', 'Mazda3', 'Mazda6', 'Nissan']
        println "The sorted list: ${list.sort()}"
        println "The sorted list: ${list.sort {a, b -> b <=> a}}"
    }

    void sortBySize() {
        def list = ['BMW', 'Ford GT', 'Chevrolet', 'Mercedes', 'Mazda3', 'Mazda6', 'Nissan']
        println "The sorted list: ${list.sort {it.size()}}"
    }

    void any() {
        def list = ['BMW', 'Ford GT', 'Chevrolet', 'Mercedes', 'Mazda3', 'Mazda6', 'Nissan']
        println "The list contains at least one item more than 6 characters: ${list.any {it.size() > 6}}"
    }

    void every() {
        def list = ['BMW', 'Ford GT', 'Chevrolet', 'Mercedes', 'Mazda3', 'Mazda6', 'Nissan']
        println "The list contains all items more then 6 characters: ${list.every {it.size() > 6}}"
        println "The list contains only String objects: ${list.every {it in String}}"
    }

    static void main(args) {
        def groovyCollectionOther = new GroovyCollectionOther()
        groovyCollectionOther.group()
        groovyCollectionOther.sort()
        groovyCollectionOther.sortBySize()
        groovyCollectionOther.any()
        groovyCollectionOther.every()
    }
}
