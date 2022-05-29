package itnJava.ppj10;

public class Ostroslup extends Trojkat {
    private double height;

    public Ostroslup(double sideA, double height) {
        super(sideA);
        this.height = height;
    }

    public Ostroslup(Trojkat triangle, double height) {
        super(triangle.getSiteA());
        this.height = height;
    }

    public double calcTotalField() {
        double sideHeight = Math.sqrt(Math.pow(
                getHeight() / 2, 2) + Math.pow(height, 2));
        return sideHeight * getSiteA() / 2 * 3 + calcField();
    }

    public double calcCapacity() {
        return calcTotalField() * height / 3;
    }

    public void show() {
        System.out.println("Pyramid total field: " + calcTotalField());
        System.out.println("Pyramid capacity: " + calcCapacity());
    }
}
