package projects.checkers;

import static java.awt.Graphics.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Scanner;

public
    class s25417P01 {

    public static void main(String[] args) {
        long l1 = 0, l2 = 0, l3 = 0, l4 = 0;

        System.out.println("Ekran startowy");
        System.out.println(8 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(8 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(7 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println(7 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println(6 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(6 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(5 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println(5 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println(4 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(4 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(3 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println(3 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println(2 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(2 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
        System.out.println(1 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println(1 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
        System.out.println("\tA\tB\tC\tD\tE\tF\tG\tH");
        System.out.println("Żeby zagrać należy napisać start");
        Scanner scanner = new Scanner(System.in);
        if (scanner.equals("start")) {
            //0 = A, 0 = 1, 0 = biały, 0 = pion, 0 = zbite, l1 - l2 - białe
            l1 = 0b001_000_001__011_000_001__101_000_001__111_000_001__000_001_001__010_001_001L;
            l2 = 0b100_001_001__110_001_001__001_010_001__011_010_001__101_010_001__111_010_001L;
            l3 = 0b000_101_101__010_101_101__100_101_101__110_101_101__001_110_101__011_110_101L;
            l4 = 0b101_110_101__111_110_101__000_111_101__010_111_101__100_111_101__110_111_101L;
            while (((l1 << 8) & 0b1__000_000_000__000_000_000__000_000_000__000_000_000__000_000_000L) ==
                    0b1__000_000_000__000_000_000__000_000_000__000_000_000__000_000_000L ||
                    ((l1 << 17) & 0b1__000_000_000__000_000_000__000_000_000__000_000_000L) ==
                0b1__000_000_000__000_000_000__000_000_000__000_000_000L ||
                    ((l1 << 26 & 0b1__000_000_000__000_000_000__000_000_000L) ==
                0b1__000_000_000__000_000_000__000_000_000L ||
                            ((l1 << 35) & 0b1__000_000_000__000_000_000L) ==
                                    1__000_000_000__000_000_000L ||
                            ((l1 << 44) & 0b1__000_000_000L) ==
                                    0b1__000_000_000L ||
                            ((l1 << 53) & 0b1L) == 0b1L)) {
                System.out.println(8 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
                System.out.println(8 + "\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t");
                System.out.println(7 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println(7 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println(6 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
                System.out.println(6 + "\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t");
                System.out.println(5 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println(5 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println(4 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
                System.out.println(4 + "\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t");
                System.out.println(3 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println(3 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println(2 + "\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t");
                System.out.println(2 + "\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t" + " \t" + "⬛\t");
                System.out.println(1 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println(1 + "\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t" + "⬛\t" + "⬜\t");
                System.out.println("\tA\tB\tC\tD\tE\tF\tG\tH");
            }
        }
    }

}
