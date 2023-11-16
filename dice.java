import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter 1 to roll the dice");
            System.out.println("Enter 2 to quit");
            int code = scanner.nextInt();
            
            if (code == 1) {
                int number = (int) (Math.floor(Math.random() * 6) + 1);
                System.out.println("Dice number: " + number);
            } else {
                break;
            }
        }

        scanner.close();
    }
}
