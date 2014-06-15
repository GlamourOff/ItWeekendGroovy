package com.it.weekend.collection

class GroovyCollectionSearch {

    void find() {
        def list = [null, 2, 3, 4, 5]
        println "The first non-null item: ${list.find()}"
        println "The first suitable item: ${list.find {it > 3}}"
    }

    void findAll() {
        def list = [1, 2, 3, 4, 5]
        println "The list of suitable items: ${list.findAll {it > 3}}"
    }

    void first() {
        def list = [null, 2, 3, 4, 5]
        //def list = []
        println "The first item: ${list.first()}"
    }

    void last() {
        def list = [1, 2, 3, 4, 5]
        println "The last item: ${list.last()}"
    }

    void min() {
        def list = [2, 3, 1, 4, 5]
        println "The last item: ${list.min{it > 5}}"
    }

    void max() {
        def list = [2, 3, 5, 4, 1]
        println "The last item: ${list.max()}"
    }

    void unique() {
        def list = [1, 2, 3, 5, 4, 5, 1]
        println "The last item: ${list.unique()}"
    }

    void take() {
        def list = [1, 2, 3, 5, 4, 5, 1]
        println "The last item: ${list.take(4)}"
    }

    static void main(args) {
        def groovyCollectionSearch = new GroovyCollectionSearch()
        groovyCollectionSearch.find()
        groovyCollectionSearch.findAll()
        groovyCollectionSearch.first()
        groovyCollectionSearch.last()
        groovyCollectionSearch.min()
        groovyCollectionSearch.max()
        groovyCollectionSearch.unique()
        groovyCollectionSearch.take()
    }
}
