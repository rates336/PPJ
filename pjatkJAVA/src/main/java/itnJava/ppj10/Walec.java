package itnJava.ppj10;

public class Walec {
    private double promien, wysokosc;

    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public double calcFieldBase() {
        return promien * promien * Math.PI;
    }

    public double calcCapacity() {
        return calcFieldBase() * wysokosc;
    }

    public void show() {
        System.out.println("Roller field base: " + calcFieldBase());
        System.out.println("Roller capacity: " + calcCapacity());
    }
}
