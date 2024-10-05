import java.util.Scanner;

/**
 * A class that performs conversions between data types and number systems.
 */
public class NumberSystemConverter {

    /**
     * Main method to run the program.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string (1 to 16 bits): ");
        String binaryString = scanner.next();
        int value = Integer.parseInt(binaryString, 2);

        printDecimal(value);
        printOctal(value);
        printHexadecimal(value);

        scanner.close();
    }

    /**
     * Prints the decimal representation of the given value with digit positions.
     * @param value The value to print.
     */
    public static void printDecimal(int value) {
        String valueString = Integer.toString(value);
        System.out.println("Decimal:");
        for (int i = 0; i < valueString.length(); i++) {
            System.out.printf("%d\t%c%n", i + 1, valueString.charAt(i));
        }
    }

    /**
     * Prints the octal representation of the given value with digit positions.
     * @param value The value to print.
     */
    public static void printOctal(int value) {
        String valueString = Integer.toOctalString(value);
        System.out.println("Octal:");
        for (int i = 0; i < valueString.length(); i++) {
            System.out.printf("%d\t%c%n", i + 1, valueString.charAt(i));
        }
    }

    /**
     * Prints the hexadecimal representation of the given value with digit positions.
     * @param value The value to print.
     */
    public static void printHexadecimal(int value) {
        String valueString = Integer.toHexString(value).toUpperCase();
        System.out.println("Hexadecimal:");
        for (int i = 0; i < valueString.length(); i++) {
            System.out.printf("%d\t%c%n", i + 1, valueString.charAt(i));
        }
    }
}
