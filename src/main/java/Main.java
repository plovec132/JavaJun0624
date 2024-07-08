import homework.FourHW.Date;
import homework.FourHW.Person;
import webinar.oop1lecture.Config;
import webinar.oop1lecture.Person1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {
//        FirstHW.main();
//        TwoHW.main();
//        ThreeHWAlgoritms.main();
        Person person1 = new Person.Builder()
                .build();
        System.out.println(person1);


        LocalDate localDate1 = LocalDate.of(2023, 7, 8); // Год, месяц, день
        System.out.println(localDate1);


        Person person2 = new Person.Builder()
                .fio("Ivan Ivanov")
                .birthDay("Дата рождения", localDate1)
                .openCardDate("Дата открытия карты", localDate1)
                .build();
        System.out.println(person2);

        Person person3 = new Person.Builder()
                .fio("Ivan Ivanov")
                .birthDay("Дата рождения")
                .openCardDate("Дата открытия карты")
                .build();
        System.out.println(person3);


        LocalDate localDate2 = LocalDate.parse("2024-05-08");
        Person person4 = new Person.Builder()
                .fio("Ivan Ivanov")
                .birthDay(localDate2)
                .openCardDate(localDate2)
                .build();
        System.out.println(person4);


        LocalDate localDate3 = LocalDate.parse("2022-07-08");
        Person person5 = new Person.Builder()
                .fio("Ivan Ivanov")
                .birthDay(localDate3)
                .openCardDate(localDate3)
                .build();
        System.out.println(person5);

        System.out.println(person4.isActualCard());
        System.out.println(person5.isActualCard());

    }
}