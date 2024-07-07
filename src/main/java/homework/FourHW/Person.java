package homework.FourHW;

public class Person {
    private String fio;
    private String birthDay;
    private String openCardDate;

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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getOpenCardDate() {
        return openCardDate;
    }

    public void setOpenCardDate(String openCardDate) {
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
    public static class Builder{
        private String fio = defaultValue;
        private String birthDay = defaultValue;
        private String openCardDate = defaultValue;


        public Builder fio(String fio) {
            this.fio = fio;
            return this;
        }

        public Builder birthDay(String birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public Builder openCardDate(String openCardDate) {
            this.openCardDate = openCardDate;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
