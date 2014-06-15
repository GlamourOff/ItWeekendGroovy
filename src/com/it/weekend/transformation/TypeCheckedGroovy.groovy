package com.it.weekend.transformation

import groovy.transform.TypeChecked

@TypeChecked
class TypeCheckedGroovy {

    void doIt() {
        //return "it"
    }

    def doIt(String str) {
         "$str it"
    }

    void callIt() {
        //int i = doIt()
    }



}
