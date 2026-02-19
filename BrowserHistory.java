import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> urls = new ArrayDeque<>();

        String current = null;

        while (!input.equals("Home")) {

            boolean hasNoPreviousUrls = false;

            if (input.equals("back")) {
                if (!urls.isEmpty()) {
                    current = urls.pop();
                    } else {
                    System.out.println("no previous URLs");
                    hasNoPreviousUrls = true;
                    }
                } else {
                    if (current != null) {
                        urls.push(input);
                    }

                    current = input;
                }


            if (!hasNoPreviousUrls) {
                System.out.println(current);
            }


            input = scanner.nextLine();
        }
    }
}
