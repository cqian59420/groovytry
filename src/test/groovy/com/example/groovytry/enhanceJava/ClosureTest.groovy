package com.example.groovytry.enhanceJava

class ClosureTest extends GroovyTestCase {


    def totalSectionValue(n, closure) {
        def total = 0
        for (i in 1..n) {
            if (closure(i)) {
                total += 1
            }
        }
        total
    }

    //策略模式
    void testCallClosure(){
        println totalSectionValue(10) {it%2==0}


        def isOdd = {it%2==0}
        println totalSectionValue(10,isOdd)
    }
}
