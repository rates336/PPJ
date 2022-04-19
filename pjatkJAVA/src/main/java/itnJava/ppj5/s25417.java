package itnJava.ppj5;

import static java.lang.Math.pow;

public class s25417 {
    public void Task4() {
        double someValue = 2;
        double temp = someValue;
        for (int i = 0; i < 10; i++) {
            temp = 1 / (pow(someValue, i));
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        s25417 s = new s25417();
        s.Task4();
    }
}
