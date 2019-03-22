package com.example.groovytry.enhanceJava

import groovy.transform.Immutable

class enhancejava extends GroovyTestCase{

    @Immutable
    class CreditCard{
        String cardNum
        int cardLimit
    }


    void testNewCreditCard(){
        def myCard = new CreditCard("12321312312",5000)
    }

}
