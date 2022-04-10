package itnJava.ppj3;

public class s25417 {
    public void Task1() {
        byte a1 = -128;
        byte a2 = 127;
        short b1 = -32768;
        short b2 = 32767;
        int c1 = -2147483648;
        int c2 = 2147483647;
        long d1 = -9223372036854775808L;
        long d2 = 9223372036854775807L;
        boolean e1 = false;
        boolean e2 = true;
        char f1 = 0;
        char f2 = 65535;
        /*double g1 = ;
        double g2 = ;
        float h1 = ;
        float h2 = ;*/

    }

    public void Task2() {
        boolean theBoolean = false;
        int theInteger = 1;
        double theDouble = 2.22;
        char theChar = 56;
        System.out.println(theBoolean == theBoolean);
        //System.out.println(theBoolean == theInteger);
        //System.out.println(theBoolean == theDouble);
        //System.out.println(theBoolean == theChar);
        System.out.println(theInteger == theInteger);
        System.out.println(theInteger == theDouble);
        System.out.println(theInteger == theChar);
        System.out.println(theDouble == theDouble);
        System.out.println(theDouble == theChar);
        System.out.println(theChar == theChar);
    }
    public void Task3() {
        int a31313;
        //int 3adadad;
        //int @dadada;
        int args;
        //podejrzewam, że to słowo również miało nie być używane, zatem na dole jest ze słowem public
        //int public;
        //int null;
    }
    public void Task4() {
        int a = 0;
        System.out.println(a);
    }
    public void Task5() {
        char charValue = ' ';
        char charvalue = '\'';
        //Tak kompiluje się, wskazówką na to może być też to, że w poprzednich
        //zadaniach jeżeli coś się nie kompilowało było
    }
    public void Task6() {
        int a = 10;
        double b = 1.11;
        //a = b;
        //opcjonalnie można to zrobić tak
        //a = (int)b;
        b = a;
    }
    public void Task7() {
        byte a;
        char b;
        int c;
        float d;
        double e;
        a = 1;
        b = 10;
        c = 100;
        d = 1.1F;
        e = 1.11;
        //char resultBC = b + c;
        //ponieważ nie każda wartość typu integer ma zakodowany znak pod tą wartością
        char resultBC = (char)(b + c);
        int resultCB = c + b;
        //float resultDE = d + e;
        //ponieważ niektóre wartości typu double "nie mieszczą się" w wartościach typu float
        float resultDE = (float)(d + e);
        //byte resultAC = a + c;
        //ponieważ tylko niektóre wartości typu int można dodać do wartości typu byte
        byte resultAC =(byte)(a + c);
    }

    public static void main(String[] args) {
        s25417 s = new s25417();
        s.Task1();
        s.Task2();
        s.Task3();
        s.Task4();
        s.Task5();
        s.Task6();
        s.Task7();

    }
}
