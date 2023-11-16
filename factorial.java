import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        long result = calcularFatorial(number);

        System.out.println("The factorial of " + number + " is: " + result);

        scanner.close();
    }

    static long calcularFatorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number.");
            return -1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
