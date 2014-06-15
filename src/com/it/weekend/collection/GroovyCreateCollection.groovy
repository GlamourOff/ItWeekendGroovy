package com.it.weekend.collection

class GroovyCreateCollection {

    void createNewList() {
        def list1 = [1,2,3]
        def list2 = new ArrayList<>()
        ArrayList<String> list3 = []
        ArrayList<String> list4 = new ArrayList<>()
        def list5 = [] as LinkedList
        LinkedList list6 = []
    }

    void createNewSet() {
        def set1 = [] as Set
        Set set2 = []
        def set3 = [] as TreeSet<String>
    }

    void createNewMap() {
        def map1 = [:]
        Map map2 = [:]
    }

    void createNewRange() {
        def range1 = 1..10
        def range2 = new Date()..new Date()
        def range3 = "a".."z"
    }
}
