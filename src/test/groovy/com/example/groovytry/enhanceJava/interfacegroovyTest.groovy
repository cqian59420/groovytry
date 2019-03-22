package com.example.groovytry.enhanceJava

class interfacegroovyTest extends GroovyTestCase {


    def helper(helper) {
        helper.moving()

        if (helper.metaClass.respondsTo(helper, 'eating')) {
            helper.eating()
        }
    }

    class Man {
        def moving() {
            println "man moving"
        }
    }

    class Woman {
        def moving() {
            println "Woman moving"
        }

        def eating() {
            println "woman eating"
        }
    }


    void testMoving() {
        helper(new Man())
        helper(new Woman())
    }
}
