import org.joda.time.LocalDate

import java.text.SimpleDateFormat


//def today = new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-12")
//println(today)

class vLearn {

    static void main(args) {
        // test env
        println(111)
        // readfile and write content
        println(
                new File("C:/Users/cqian/Desktop/sourceHisConfig.txt").text.eachLine {
                    it.substring(it.indexOf('VALUES'), it.size() - 1).split(',')

                }.collect()
        )



        println(new File("C:/Users/cqian/Desktop/sourceHisConfig.txt").text.readLines())
    }


    def static helperRunner(helper) {
        helper.runThing()

        if (helper.metaClass.respondsTo(helper, 'eatThings')) {
            helper.eatThings()
        }

    }

    static void main2(args) {
        helperRunner(new Man())
        helperRunner(new Woman())


    }


}

class Man {
    void runThing() {
        println("things run")
    }

    void eatThings() {
        println("man eat things")
    }
}

class Woman {
    void runThing() {
        println("woman things run")
    }




//    上海市儿童医院/上海交通大学附属儿童医院（北京西路）0
//    上海市儿童医院（泸定路） null



//    totalByDoctorDateForHealthWithOrganAndBusType
//    totalByDoctorDateForHealthWithOrganAndDateAndBusType


}