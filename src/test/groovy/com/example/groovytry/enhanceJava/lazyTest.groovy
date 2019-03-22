package com.example.groovytry.enhanceJava

import groovy.transform.Immutable

class lazyTest extends GroovyTestCase {

    void testLazy() {
        def asNeeded = new AsNeeded(value: 100)
        println asNeeded.heavy1.size
        println asNeeded.heavy1.size
        println asNeeded.heavy2.size
    }



    class Heavy {
        def size = 10

        Heavy() {
            println "create heavu with $size"
        }
    }


    class AsNeeded {
        def value

        @Lazy Heavy heavy1 = new Heavy()
        @Lazy Heavy heavy2 = { new Heavy(size: value) }()

        AsNeeded() {
            println "create asNeeded"
        }
    }

    @Newify([com.example.groovytry.enhanceJava.enhancejava.CreditCard])
    def fluentCreate(){
        println CreditCard.new("TOm",2)
    }


    def vakk(){
        println "ok"
    }

    @Immutable
    class Person {
        String name
    }

    void testFluent(){
        fluentCreate()
    }


    void testEqualWithJavaDiff(){
        str1 ='hello'
        str2 =str1
        str3 = new String('hello')
        str4 ='Hello'

        println str1==str2
    }
}
