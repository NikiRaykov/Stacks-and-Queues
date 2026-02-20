import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        // First In First Out
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");

        int stackElements = Integer.parseInt(tokens[0]);
        int numberOfElementsToPop = Integer.parseInt(tokens[1]);
        int elementToCheckIfItIsPresent = Integer.parseInt(tokens[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String[] numbersInput = scanner.nextLine().split(" ");

        for (int i = 0; i < stackElements; i++) {
            queue.offer(Integer.parseInt(numbersInput[i]));
        }

        int count = 0;

        while(count < numberOfElementsToPop && !queue.isEmpty()) {

            queue.poll();
            count++;
        }

        if (queue.contains(elementToCheckIfItIsPresent)) {
            System.out.println("true");
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            int min = queue.peek();
            for (Integer element: queue) {
                if (element < min) {
                    min = element;
                }
            }
            System.out.println(min);
        }
    }
}
