package itnJava.ppj7;

import itnJava.ppj2.Task1;

import java.util.Random;

public class s25417 {
    public void Task1() {
        Random random = new Random();
        int[] tab1 = new int[random.nextInt(100)], tab2 = new int[random.nextInt(100)],
                tab3 = new int[random.nextInt(100)];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = random.nextInt();
        }
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = random.nextInt();
        }
        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = random.nextInt();
        }
        int[] theTab = new int[tab1.length + tab2.length + tab3.length];

        int temp = 0;
        for (int i = 0; i < tab1.length; i++) {
            theTab[temp] = tab1[i];
            temp++;
        }
        for (int i = 0; i < tab2.length; i++) {
            theTab[temp] = tab2[i];
            temp++;
        }
        for (int i = 0; i < tab3.length; i++) {
            theTab[temp] = tab3[i];
            temp++;
        }
        int[][] doubleTab = {tab1, tab2, tab3, theTab};
        System.out.println(doubleTab.length);
        System.out.println(theTab.length);
        for (int[] tempTab:
             doubleTab) {
            for (int tempValue:
                 tempTab) {
                System.out.println(tempValue);
            }
        }
    }
    public void Task2() {
        Random random = new Random();
        int[][] doubleTab = new int[8][8];
        for (int i = 0; i < doubleTab.length; i++) {
            for (int j = 0; j < doubleTab[i].length; j++) {
                doubleTab[i][j] = random.nextInt(10);
            }
        }
        int[] numbers = new int[doubleTab.length * 2];
        int counter = 0;
        for (int i = 0; i < doubleTab.length; i++) {
            numbers[counter] = doubleTab[i][i];
            counter++;
        }
        int j = 0;
        for (int i = doubleTab.length - 1; i > 0; i--) {
            numbers[counter] = doubleTab[j][i];
            counter++; j++;
        }
        int[] tempTab = new int[numbers.length];
        for (int i = 0; i < tempTab.length; i++) {
            tempTab[i] = -1;
        }
        int[] counterTab = new int[tempTab.length];
        for (int i = 0; i < counterTab.length; i++) {
            counterTab[i] = 0;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < i; k++) {
                if(numbers[i] == tempTab[k]) {
                    counterTab[k]++;
                    break;
                } else {
                    if(tempTab[k] == -1) {
                        tempTab[k] = numbers[i];
                        counterTab[k]++;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < counterTab.length; i++) {
            if(counterTab[i] >= 3) {
                System.out.println("Number: " + tempTab[i] + " appeared: " + counterTab[i]);
            }
        }
    }
    /*public void Task3() {
        char[][] tab = {
            {’S’,’a’,’m’,’s’,’u’,’n’,’g’},
            {’N’,’o’,’k’,’i’,’a’},
            {’A’,’p’,’p’,’l’,’e’},
            {’B’,’l’,’a’,’c’,’k’,’B’,’e’,’r’,’r’,’y’};,
            {’A’,’l’,’c’,’a’,’t’,’e’,’l’};,
            {’S’,’o’,’n’,’y’};,
            {’J’,’o’,’l’,’l’,’a’};
            };
    }*/
    public void Task4() {

    }
    public static void main(String[] args) {
        s25417 s = new s25417();
        s.Task1();
        s.Task2();
    }
}
