package homework.FourHW;

import java.time.LocalDate;


public class Date {
    private String signature;
    private LocalDate date;

    public Date(String signature) {
        this.signature = signature;
        this.date = LocalDate.now();
    }

    public Date() {
        this.signature = "без сигнатуры";
        this.date = LocalDate.now();
    }

    public Date(String signature, LocalDate date) {
        this.signature = signature;
        this.date = date;
    }

    public Date(LocalDate date) {
        this.signature = "без сигнатуры";
        this.date = date;
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
