package itnJava.ppj10;

public class Kwadrat {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double calcField() {
        return bok * bok;
    }

    public double calcCircuit() {
        return 4 * bok;
    }

    public void show(){
        System.out.println("Square field: " + calcField());
        System.out.println("Square circuit: " + calcCircuit());
    }
}
