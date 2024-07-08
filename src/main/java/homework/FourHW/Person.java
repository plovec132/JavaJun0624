package homework.FourHW;

import webinar.oop2presentation.Egg;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String fio;
    private Date birthDay;
    private Date openCardDate;

    private static String defaultValue = "Не определенно";

    private Person(Builder builder) {
        this.fio = builder.fio;
        this.birthDay = builder.birthDay;
        this.openCardDate = builder.openCardDate;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getOpenCardDate() {
        return openCardDate;
    }

    public void setOpenCardDate(Date openCardDate) {
        this.openCardDate = openCardDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\n\tfio='" + fio + '\'' +
                ", \n\tbirthDay='" + birthDay + '\'' +
                ", \n\topenCardDate='" + openCardDate + '\'' +
                "\n}";
    }

    public static class Builder {
        private String fio = defaultValue;
        private Date birthDay;
        private Date openCardDate;


        public Builder fio(String fio) {
            this.fio = fio;
            return this;
        }

        public Builder birthDay(String birthDay) {
            this.birthDay = new Date(birthDay);
            return this;
        }

        public Builder birthDay(String birthDay, LocalDate date) {
            this.birthDay = new Date(birthDay, date);
            return this;
        }

        public Builder birthDay(LocalDate date) {
            this.birthDay = new Date(date);
            return this;
        }


        public Builder openCardDate(String openCardDate) {
            this.openCardDate = new Date(openCardDate);
            return this;
        }

        public Builder openCardDate(String openCardDate, LocalDate date) {
            this.openCardDate = new Date(openCardDate, date);
            return this;
        }

        public Builder openCardDate(LocalDate date) {
            this.openCardDate = new Date(date);
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    public Boolean isActualCard() {
        LocalDate dateNow = LocalDate.now();
//        Возможно стоит вынести в отдельное поле
        LocalDate endCardDate = this.openCardDate.getDate().plusYears(2);

        return dateNow.isBefore(endCardDate);
    }
}
