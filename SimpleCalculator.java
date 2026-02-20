import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();


        // push the first number
        stack.push(Integer.parseInt(input[0]));

        // 2 + 5 + 10 - 2 - 1

        // 0 1 2 3 4  5 6 7 8

        for (int i = 2; i < input.length; i += 2) {
            int number = Integer.parseInt(input[i]);

            if (input[i - 1].equals("-")) {
                number = -number;
            }

            stack.push(number);
        }

        int result = 0;
        for (Integer number: stack) {
           result += stack.pop();
        }

        System.out.println(result);
    }

}
