import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> maxStack = new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String token = tokens[0];

            if (token.equals("1")) {
                int number = Integer.parseInt(tokens[1]);

                if (maxStack.isEmpty() || number >= maxStack.peek()) {
                    maxStack.push(number);
                }
                stack.push(number);
            } else if (token.equals("2") && !stack.isEmpty()) {
                int removed = stack.pop();

                if (!maxStack.isEmpty() && removed == maxStack.peek()) {
                    maxStack.pop();
                }
            } else if (token.equals("3")) {
                System.out.println(maxStack.peek());
            }

            }
        }
    }

