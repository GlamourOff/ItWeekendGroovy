package com.it.weekend.collection

class GroovyCollectionOperation {

    void addToList() {
        def list = [1, 2, 3]

        list << 4 << 5
        assert [1, 2, 3, 4, 5].equals(list)

        println "New items were added to List: $list"
    }

    void addToSet() {
        Set set = [1, 2, 3]

        set << 3 << 4 << 5
        assert ([1, 2, 3, 4, 5] as Set).equals(set)

        println "New items were added to Set: $set"
    }

    void addToMap() {
        def map = [key: 'value']
        map << [newKey: 'value']
        map.dynamicKey = 'value'

        assert [key: 'value', newKey: 'value', dynamicKey: 'value'].equals(map)
        println "New items were added to Map: $map"
    }

    void removeFromList() {
        def list = [1, 2, 3]

        list = list - 1
        assert [2, 3].equals(list)

        list = list - [2, 3]
        assert [].equals(list)

        println "Items were removed from List: $list"
    }

    void removeFromMap() {
        def map = [key: 'value', newKey: 'value', dynamicKey: 'value']

        map = map - [key: 'value', newKey: 'value']
        assert [dynamicKey: 'value'].equals(map)

        println "Items were removed from Map: $map"
    }

    void spreadField() {
        List<BigDecimal> list = [1.1, 2.2, 3.3, 4.4, 5.5]
        println "List of BigInteger ${list*.toBigInteger()}"
    }

    void contains() {
        def list = [1, 2, 3, 4, 5]
        println "The List contains 5: ${5 in list}"
    }

    static void main(args) {
        def groovyCollectionOperation = new GroovyCollectionOperation()
        groovyCollectionOperation.addToList()
        groovyCollectionOperation.addToSet()
        groovyCollectionOperation.addToMap()
        groovyCollectionOperation.removeFromList()
        groovyCollectionOperation.removeFromMap()
        groovyCollectionOperation.spreadField()
        groovyCollectionOperation.contains()
    }
}
