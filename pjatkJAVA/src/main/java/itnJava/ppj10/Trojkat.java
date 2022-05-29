package itnJava.ppj10;

public class Trojkat {
    private double sideA, height;

    public Trojkat(double siteA) {
        this.sideA = siteA;
        height = siteA * Math.sqrt(3) * siteA / 2;
    }

    public Trojkat(double siteA, double height) {
        this.sideA = siteA;
        this.height = height;
    }

    public double calcField() {
        return sideA * height / 2;
    }

    public void show() {
        System.out.println("Triangle field: " + calcField());
    }

    public double getSiteA() {
        return sideA;
    }

    public double getHeight() {
        return height;
    }

    public void setSiteA(double siteA) {
        this.sideA = siteA;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
