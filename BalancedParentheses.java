import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (token.equals("(") || token.equals("{") || token.equals("[")) {
                stack.push(token);
            } else if (token.equals(")") || token.equals("}") || token.equals("]")) {

                if (!stack.isEmpty()) {
                    String first = stack.peek();
                    if ((first.equals("(") && token.equals(")")) ||
                            (first.equals("{") && token.equals("}")) ||
                            (first.equals("[") && token.equals("]"))) {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
