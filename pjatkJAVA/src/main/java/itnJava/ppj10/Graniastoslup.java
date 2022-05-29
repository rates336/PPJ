package itnJava.ppj10;

public class Graniastoslup extends Trojkat{
    private double height;

    public Graniastoslup(double siteA, double height, double height1) {
        super(siteA, height);
        this.height = height1;
    }

    public Graniastoslup(double siteA, double height) {
        super(siteA);
        this.height = height;
    }

    public Graniastoslup(Trojkat triangle, double height) {
        super(triangle.getSiteA());
        this.height = height;
    }

    public double calcTotalField() {
        return (calcField() * 2) + (getSiteA() * height * 3);
    }
    public double calcCapacity() {
        return calcField() * height;
    }
    public void show() {
        System.out.println("Prism total field: " + calcTotalField());
        System.out.println("Prism capacity: " + calcCapacity());
    }
}
