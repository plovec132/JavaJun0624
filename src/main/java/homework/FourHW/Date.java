package homework.FourHW;
import java.time.LocalDate;



public class Date {
    private String signature;
    private LocalDate date;

    public Date(String signature) {
        this.signature = signature;
        this.date = LocalDate.now();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "signature='" + signature + '\'' +
                ", date=" + date +
                '}';
    }
}
//
//    // Метод для форматирования LocalDate в строку
//    public static String format(LocalDate date) {
//        return date.format(formatter);
//    }
