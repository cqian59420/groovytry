package com.example.groovytry.mop

import groovy.util.logging.Log


class CarTest extends GroovyTestCase {



    void testCarAdd() {

        def car = new Car()
        assertEquals 3,car.add()

        for (i in 0..2) {
            println(i)
        }

        4.times {print "$it"}  //从0开始 0123


        0.step(10,2) {println("$it")} // 02468

        println("git version".execute().text)
        println("git version".execute().getClass().name)
        //println("cmd /C dir".execute().text)


        println(foo('evil'))
        println(foo(null))

        try {
            openFile("xx")
        } catch (ex) {
            log.info(ex)
        }

    }

    def foo(str) {
        str?.reverse()
    }

    def openFile(fileName) {
        new FileInputStream(fileName)
    }
}
