package itnJava.ppj6;

import itnJava.ppj2.Task1;

import java.util.Random;

public class s25417 {
    public void Task1() {
        int[] tab = new int[10];
    }
    public int[] Task2() {
        int[] tab = new int[10];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2);
        }
        return tab;
    }
    public void Task3(int[] tab) {
        int counterZeros = 0, counterOnes = 0;
        for (int i = 0; i < tab.length; i++) {
            switch (tab[i]) {
                case 0 :
                    counterZeros++;
                    break;
                case 1 :
                    counterOnes++;
                    break;
                default :
                    System.out.println("The tab don't have only 0 or 1");
            }

        }
        System.out.println(counterZeros + " vs " + counterOnes);
    }
    public void Task4() {
        double[] tab = new double[10];
        for (double temp:
             tab) {
            temp = 0;
        }
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextDouble(10);
        }
        for (double temp:
             tab) {
            System.out.println(temp);
        }
        System.out.println("Even");
        for (double temp:
             tab) {
            int someValue = (int)temp;
            if(someValue % 2 == 0 && someValue != 0)
                System.out.println(temp);
        }
        System.out.println("Odd");
        for (double temp:
                tab) {
            int someValue = (int)temp;
            if(someValue % 2 != 0 || someValue == 0)
                System.out.println(temp);
        }
    }
    public void Task5() {
        int tab[];
        //System.out.println(tab);
        //Nie wypisze bo kod się nie kompiluje
    }
    public void Task6() {
        int tab[] = { 789, 678, 567};
        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length ; j++) {
                System.out.println(tab[i] - tab[j]);
            }
        }
        /*
        0
        111
        222
        0
        111
        0
        */
    }
    public void Task7() {
        String[] slowa = {
                "Ala","kota","ma","ma","a","kot","Ale"
        };
        for (String temp:
             slowa) {
            if(temp.equals("Ala")) {
                System.out.print(temp);
                break;
            }
        }
        System.out.print(" ");
        for (String temp:
                slowa) {
            if(temp.equals("ma")) {
                System.out.print(temp);
                break;
            }
        }
        System.out.print(" ");
        for (String temp:
                slowa) {
            if(temp.equals("kota")) {
                System.out.print(temp);
                break;
            }
        }
        System.out.print(" ");
        for (String temp:
                slowa) {
            if(temp.equals("a")) {
                System.out.print(temp);
                break;
            }
        }
        System.out.print(" ");
        for (String temp:
                slowa) {
            if(temp.equals("kot")) {
                System.out.print(temp);
                break;
            }
        }
        System.out.print(" ");
        for (String temp:
                slowa) {
            if(temp.equals("ma")) {
                System.out.print(temp);
                break;
            }
        }
        System.out.print(" ");
        for (String temp:
                slowa) {
            if(temp.equals("Ale")) {
                System.out.print(temp);
            }
        }
        System.out.println();
    }
    public void Task8(char[] tab) {
        char[] theTab = tab;
    }
    public static void main(String[] args) {
        s25417 s = new s25417();
        s.Task1();
        s.Task2();
        s.Task3(s.Task2());
        s.Task4();
        s.Task5();
        s.Task6();
        s.Task7();
        s.Task8(new char[5]);
    }
}
