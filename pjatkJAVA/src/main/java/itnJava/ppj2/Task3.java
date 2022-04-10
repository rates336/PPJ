package itnJava.ppj2;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        int a = 150434;
        char valueOfBit7 = '0';
        String aInBinary = Integer.toBinaryString(a);
        System.out.println("Number in binary system " + aInBinary);
        if(aInBinary.length() >= 5) {
            String last5numbers = aInBinary.substring(aInBinary.length() - 5, aInBinary.length());
            if(aInBinary.length() >= 7) {
                valueOfBit7 = aInBinary.charAt(6);
            }
            System.out.println("Last 5 numbers in binary system" + last5numbers);
        } else {
            String temp = "";
            for (int i = aInBinary.length(); i < 5; i++) {
                temp += 0;
            }
            String last5numbers = temp + aInBinary.substring(0, aInBinary.length());
            System.out.println(last5numbers);
        }
        System.out.println("Value of 7 place in binary system " + valueOfBit7);
        String[] theBits = new String[4];
        int counter = 0;
        for (int i = 8; i < aInBinary.length(); i += 8) {
            theBits[counter] = aInBinary.substring(i - 8, i);
            counter++;
        }
        String optional = "";
        if (4 > counter) {
            optional = aInBinary.substring((8 * counter));
        }
        String temp = "";
        for (int i = optional.length(); i < 8; i++) {
            temp += 0;
        }
        optional = temp + optional;
        theBits[counter] = optional;
            while (counter + 1 < 4) {
                theBits[counter + 1] = "00000000";
                counter++;
            }
        System.out.println();
            int[] theValueBits = new int[4];
            counter = 0;
        System.out.println("The bits and value bits in decimal system: ");
        for (int i = theBits.length - 1; i >= 0; i--) {
            System.out.println(theBits[i]);
            theValueBits[i] = 0;
            for (int j = 8; j > 0; j--) {
                if(theBits[i].charAt(counter) == '1')
                    theValueBits[i] += pow(2, j - 1);
                counter++;
            }
            counter = 0;
            System.out.println(theValueBits[i]);
        }
        String selectedBits = "";
        int numberOfBit = 2;
        selectedBits += theBits[numberOfBit];
        numberOfBit = 3;
        selectedBits += theBits[numberOfBit];
        int sumValuesOfSelectedBits = 0;
        System.out.println();
        System.out.print("The sum of bits 2 and 3 in decimal system: ");
            for (int j = selectedBits.length(); j > 0; j--) {
                if(selectedBits.charAt(counter) == '1')
                    sumValuesOfSelectedBits += pow(2, j - 1);

                counter++;
            }
        System.out.println(sumValuesOfSelectedBits);
        System.out.println();

    }
}
