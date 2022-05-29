package itnJava.ppj10;

public class Prostokat {
    private double sideA, sideB;

    public Prostokat(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calcFiled() {
        return sideA * sideB;
    }

    public void show() {
        System.out.println("Rectangle field: " + calcFiled());
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
