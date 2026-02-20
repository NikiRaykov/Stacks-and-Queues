import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (decimalNumber == 0) {
            System.out.println(0);
        }

        while (decimalNumber != 0) {
            binary.push(decimalNumber % 2);

            decimalNumber /= 2;
        }

        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
