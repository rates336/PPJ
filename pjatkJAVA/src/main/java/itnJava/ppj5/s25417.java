package itnJava.ppj5;

import static java.lang.Math.pow;

public class s25417 {
    public void Task1() {
        int K = 987654321;
        String s = "";
        while (K != 0) {
            int cyfra = K % 10;
            s = s + cyfra;
            K = K / 10;
        }
        //s będzie zaczynając od końca pierwszą i wraz z każdym obrotem petli kolejną cyfra, a
        //ostateczny wynik to cala liczba przeczytana od tylu czyli 123456789
    }
    public void Task2() {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s = s + i;
        }
        System.out.println(s);
        s = 0;
        int i = 1;
        while (i <= 10) {
            s = s + i;
            i++;
        }
        System.out.println(s);
    }
    public void Task3() {
        int i = 1;
        while (i < 0) {
            System.out.println("Petla while sie wykonala");
        }
        //w petli while nic sie nie wyswietli w tym wypadku
        do {
            System.out.println("Petla do while sie wykonala");
        } while (i < 0);
        //natomiast w petli do while wyswietli sie to dokladnie raz

        //spowodowane jest to kolejnoscia wykonywania petli i sprawdzania warunku
        //w petli while najpierw sprawdzany jest warunek i jezeli jest spelniony
        //petla jest wykonywana, natomiast w do while jest odwrotnie najpierw wykonywana
        //jest petla potem jest spelniany warunek i dlatego nawet jezeli warunek nie jest
        //spelniony petla i tak raz sie zawsze wykona
    }
    public void Task4() {
        double valueUp = 1;
        double valueDown = 2;
        double temp = valueDown;
        for (int i = 0; i < 10; i++) {
            if(i == 0)
                System.out.println(valueUp / 1);
            for (int j = 0; j < i; j++) {
                temp = temp * 2;
            }
            System.out.println(valueUp / temp);
            temp = valueDown;
        }
    }
    public void Task5() {
        int wrt = 3;
        for (int i = 0; i < 10; i++) {
            System.out.println(wrt * i);

        }

    }
    public void Task6() {
        for (int i = -1500; i < 1500; i++) {
            if(i % 3 == 0 && i % 2 == 0)
                System.out.println(i);
        }
    }
    public void Task7(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        s25417 s = new s25417();
        s.Task1();
        s.Task2();
        s.Task3();
        s.Task4();
        s.Task5();
        s.Task6();
        s.Task7(5);
    }
}
