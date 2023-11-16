import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (verifyPrime(number)) {
            System.out.println(number + " its prime.");
        } else {
            System.out.println(number + " its not prime.");
        }

        scanner.close();
    }

    static boolean verifyPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
