package itnJava.ppj10;

public class Prostopadloscian extends  Prostokat {
    private double height;

    public Prostopadloscian(double sideA, double sideB, double height) {
        super(sideA, sideB);
        this.height = height;
    }

    public Prostopadloscian(Prostokat prostokat, double height) {
        super(prostokat.getSideA(), prostokat.getSideB());
        this.height = height;
    }

    public double calcTotalField() {
        return (getSideA() * getSideB() * 2) + (getSideA() * height * 2) + (getSideB() * height * 2);
    }

    public double calcCapacity() {
        return getSideA() * getSideB() * height;
    }

    public void show() {
        System.out.println("Cuboid total field: " + calcTotalField());
        System.out.println("Cuboid capacity: " + calcCapacity());
    }
}
