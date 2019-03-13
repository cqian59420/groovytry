import org.joda.time.LocalDate

import java.text.SimpleDateFormat



//def today = new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-12")
//println(today)

class vLearn{

    static void  main1(args) {
        //def today = new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-12")
        println(111)
        new File("C:/Users/cqian/Desktop/sourceHisConfig.txt").text.eachLine {
            //println(it.substring(it.indexOf('VALUES'),it.size()-1))
            it.substring(it.indexOf('VALUES'),it.size()-1).split(',')

        }.collect()

    }




    def static helperRunner(helper) {
        helper.runThing()

        if(helper.metaClass.respondsTo(helper,'eatThings')){
            helper.eatThings()
        }

    }

    static void main (args){
        helperRunner(new Man())
        helperRunner(new Woman())


    }


}

class Man{
    void runThing(){
        println( "things run")
    }

    void eatThings(){
        println("man eat things")
    }
}

class Woman{
    void runThing(){
        println( "woman things run")
    }
}