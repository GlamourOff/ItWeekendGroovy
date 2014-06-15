package com.it.weekend.collection

class GroovyCollectionLooping {

    void collect() {
        def list = [1, 2, 3, 4, 5, 6]
        println "The new collection: ${list.collect { it * it }}"
    }

    void findResults() {
        def list = [1, 2, 3, 4, 5, 6]
        println "The new collection w\\o null: ${list.findResults { it % 2 > 0 ? it : null }}"
    }

    void each() {
        def list = [1, 2, 3, 4, 5, 6]
        list.each { println "each it: $it" }
    }

    void flatten() {
        def list = [1, 2, 3, [4], [[5, 6], [7]]]
        println "This list was flattened: ${list.flatten()}"
    }

    void grep() {
        def list = [1, 2, 3, 4, 5, 6]
        list = list.collect {it % 2 > 0 ? it : null}
        println "The list w\\ null items: $list - w\\o ${list.grep()}"
    }

    static void main(args) {
        def groovyCollectionLooping = new GroovyCollectionLooping()
        groovyCollectionLooping.collect()
        groovyCollectionLooping.findResults()
        groovyCollectionLooping.each()
        groovyCollectionLooping.flatten()
        groovyCollectionLooping.grep()
    }
}
