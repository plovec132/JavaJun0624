import homework.FourHW.Date;
import homework.FourHW.Person;
import webinar.oop1lecture.Config;
import webinar.oop1lecture.Person1;
import java.time.LocalDate;




public class Main {

    public static void main(String[] args) {
//        FirstHW.main();
//        TwoHW.main();
//        ThreeHWAlgoritms.main();
        Person person1 = new Person.Builder()
                .build();
        System.out.println(person1);

        Person person2 = new Person.Builder()
                .fio("Ivan Ivanov")
                .openCardDate("23.12.2020")
                .build();
//        System.out.println(person2);

//        System.out.println(LocalDate.now());
        Date date1 = new Date("Test signature");
        System.out.println(date1.toString());





    }
}