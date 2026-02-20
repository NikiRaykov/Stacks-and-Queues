import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(fib(n));
    }

    private static long fib(int number) {
        if (number <= 1) {
            return number;
        }

        return (fib(number - 1) + fib(number - 2));
    }
}
