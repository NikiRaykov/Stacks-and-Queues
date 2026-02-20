import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        int stackElements = Integer.parseInt(tokens[0]);
        int numberOfElementsToPop = Integer.parseInt(tokens[1]);
        int elementToCheckIfItIsPresent = Integer.parseInt(tokens[2]);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        String[] numbersInput = scanner.nextLine().split(" ");

        for (int i = 0; i < stackElements; i++) {
            numbers.push(Integer.parseInt(numbersInput[i]));
        }

        int count = 0;

        while(count < numberOfElementsToPop && !numbers.isEmpty()) {

            numbers.pop();
            count++;
        }

        if (numbers.contains(elementToCheckIfItIsPresent)) {
            System.out.println("true");
        } else if (numbers.isEmpty()) {
            System.out.println(0);
        } else {
            int min = numbers.peek();
            for (Integer element: numbers) {
                if (element < min) {
                    min = element;
                }
            }
            System.out.println(min);
        }
    }
}
