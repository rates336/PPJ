package itnJava.ppj4;

import java.util.Scanner;

public class s25417 {
    public void Task1() {
        int i = 10;
        i = i++;
        i = ++i;
        i = i++ + ++i;
        //W rezultacie i = 24
    }
    /*public void Task2() {
        double a = ...;
        double x;
        if(a >= 0)
            x = 1.701;
        if(a < 0)
            x = 2D * 3.14F;
        System.out.println(x);
    }*/
    public void Task3() {
        int zmInt = 4;
        double zmDouble = -1.0;
        if(zmInt > 0)
            if(zmDouble > 0)
                System.out.println("Here I am!");
        else
            System.out.println("No, I am here!");
        System.out.println("No, actually , I am here!");
    }
    public void Task4() {
        boolean doesSignificantWork = true, makesBreakthrough = true, nobelPrizeCandidate = false;
        if(doesSignificantWork && makesBreakthrough)
            nobelPrizeCandidate = true;
        else
            nobelPrizeCandidate = false;
        System.out.println(nobelPrizeCandidate);
    }
    public boolean nobelPrizeCandidate() {
    boolean doesSignificantWork = true, makesBreakthrough = true;
    if(doesSignificantWork && makesBreakthrough)
        return true;
    else
        return false;
    }
    public void Task5() {
        int a = 0, b = 0;
        //if(!(a < b) && !(a > b))
        //Jedyny warunek kiedy będzie to spelnione to kiedy a i b maja taka sama wartosc
        if(a == b)
            System.out.println("a = b");
        else
            System.out.println("a != b");
    }
    public void Task6() {
        int a = 0, b = 1, c = 0;
        System.out.println(a == b ? "Sa takie same" : "Nie sa takie same");
        System.out.println(a == c ? "Sa takie same" : "Nie sa takie same");
        System.out.println(b == c ? "Sa takie same" : "Nie sa takie same");
    }
    public void Task7() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), d = scanner.nextInt();
        if(d <= 31 && d >= 1) {
            switch (m) {
                case 1 :
                case 2 :
                    System.out.println("Zima");
                    break;
                case 3 :
                    System.out.println(d > 20 ? "Wiosna" : "Zima");
                    break;
                case 4 :
                case 5 :
                    System.out.println("Wiosna");
                    break;
                case 6 :
                    System.out.println(d > 20 ? "Lato" : "Wiosna");
                    break;
                case 7 :
                case 8 :
                    System.out.println("Lato");
                    break;
                case 9 :
                    System.out.println(d > 22 ? "Jesien" : "Lato");
                    break;
                case 10 :
                case 11 :
                    System.out.println("Jesien");
                case 12 :
                    System.out.println(d > 21 ? "Zima" : "Jesien");
                    break;
                default:
                    System.out.println("Entered wrong month value");
            }

        } else {
            System.out.println("Entered wrong day value");
        }
    }
    public void Task8() {
        double someValue = 0;
        //Nie wiem co mam rozumiec przez klasyfikacja jednoznaczna, nie skladana
        if(someValue >= 0)
            if(someValue <= 1)
                System.out.println("Zmienna nalezy do zbiorow A, B i C");
            else
                System.out.println("Zmienna nalezy do zbioru A");
        else
            System.out.println("Zmienna nalezy do zbioru B");

    }
    public void Task9() {
        //Zakladam ze czesci wspolnych dotyczy czesci wspolnych wszystkich zbiorow, a nie jedynie 2
        //A (-15, -10) U (-5, 0) U (5, 10)
        //B (-oo, -13) U (-8, -3)
        //C [-4, oo)
        int wrt = -4;
        if(wrt >= -4 && wrt < -3)
            System.out.println("Value wrt is a part of the common all collections");
        else
            System.out.println("Value wrt is not a part of the common all collections");
    }
    public void Task10() {
        //A (-15, -10)
        //B (-oo, -13)
        int wrt = -1000;
        if(wrt <= -15 || (wrt >= -13 && wrt < -10))
            System.out.println("Value wrt is part only one collection");
        else
            System.out.println("Value wrt is not part only one collection or not a part any collection");
    }
    public static void main(String[] args) {
        s25417 s = new s25417();
        s.Task1();
        //s.Task2();
        //To sie nie skompiluje
        s.Task3();
        /*Kod jest dobrze napisany, kompiluje sie ewentualnie jego dzialanie moze byc nieco
        inne od zamierzonego poniewaz linia nr 28 będzie dzialac zawsze
        Druga sprawa to else w 26 linii odnosi sie do if'a w 24, a sadzac po wcieciach mialo
        odnosic sie do if'a z 23 linii i jezeli taki byl cel programu nalezy dodac nawiasy
        klamrowe od linii, w których zawierałby się if(zmDouble > 0) wraz z instrukcja do niego
        przypisana, a zamknac powinno sie przed else i wtedy by to else odnosilo sie do if'a z 23 linii
        oczywiscie zakladajac, ze takie bylo zalozenie programu.*/
        s.Task4();
        // lub opcjonalnie można też tak
        boolean nobelPrizeCandidate = s.nobelPrizeCandidate();
        // to zalezy od implementacji docelowej zmiennej nobelPrizeCandidate
        s.Task5();
        s.Task6();
        s.Task7();
        s.Task8();
        s.Task9();
        s.Task10();

    }
}
