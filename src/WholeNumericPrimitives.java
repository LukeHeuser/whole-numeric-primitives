public class WholeNumericPrimitives {

    public static void main(String[] args) {

        long max = 3210_234_567_89L;
        long n = 2_300;

        System.out.println("Welcome! This program is a quick crash course on adding different bases. " +
                "Representing the number in both their original & reflected form.");
        // octal (0-7)
        // int oct = 07;
        int firstOct = 010; // 8 decimal
        int secondOct = 022; // 18 decimal
        int sumOct = firstOct + secondOct; // 26 Decimal, 32 Octal
        System.out.println("First octal = " + firstOct + " | Second octal = " + secondOct);
        System.out.println("Decimal sum = " + sumOct + " Octal sum = " + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal, 2d hex
        System.out.println("First hexadecimal = " + firstHex + " | Second hexadecimal = " + secondHex);
        System.out.println("Decimal sum = " + sumHex + " Hexadecimal sum = " + Integer.toHexString(sumHex));

        // binary
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b10111; // 7 decimal
        int sumBin = firstBin + secondBin; //  16 decimal, 10000 binary

        System.out.printf("First binary = " + firstBin + " | Second binary = " + secondBin);
        System.out.println("Decimal sum = " + sumBin + " Binary Sum = " + Integer.toBinaryString(sumBin));
    }
}
