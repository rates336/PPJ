package itnJava.ppj2;

public class Task2 {
    public static void main(String[] args) {
        int a = 14;
        String a0b = Integer.toBinaryString(a);
        System.out.println(a0b);
        int move = 0;
        String a0bMove = a0b.substring(0, a0b.length() - move);
        String temp = "";
        for (int i = 0; i < move; i++) {
            temp += 0;
        }
        a0bMove += temp;
        System.out.println(a0bMove);
        move = 2;
        a0bMove = a0bMove.substring(move);
        temp = "";
        for (int i = 0; i < move; i++) {
            temp += 0;
        }
        a0bMove = temp + a0bMove;
        System.out.println(a0bMove);
        move = 4;
        a0bMove = a0bMove.substring(0, a0bMove.length() - move);
        temp = "";
        for (int i = 0; i < move; i++) {
            temp += 0;
        }
        a0bMove += temp;
        System.out.println(a0bMove);



    }
}
