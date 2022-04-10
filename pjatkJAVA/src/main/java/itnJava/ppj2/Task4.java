package itnJava.ppj2;

public class Task4 {
    public static void main(String[] args) {
        int a1 = 0x6D,      a2 = 157,   a = a1 & a2,
            b1 = 0xA,       b2 = 15,   b = b1 | b2,
            c1 = 11 << 2,   c2 = 6,   c = c1 ^ c2;
        // a1 = 109, b1 = 10, c1 = 44
        // 1011 << 2 = 1100 = 8
        // (13 = 1101) & (109 = 1101101) = 0000_1101 & 0110_1101 = 1001_1101 & 0110_1101
        // (15 = 1111) | (10 = 1010) = 1111 | 1010 = 1111 | 1010
        // (44 = 101100) ^ (42 = 101010) = 0010_1100 ^ 0010_1010 = 0000_00110
        System.out.println(a + " " + b + " " + c);
        // a = 13, b = 15, c = 42
        //pokazałem tylko jedno z rozwiązań, jest ich oczywiście więcej
    }
}
