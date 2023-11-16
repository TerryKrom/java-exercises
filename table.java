import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        for(int c = 1; c<=10; ++c){
            System.out.println(number + " x " + c + " = " + number*c);
        }
    }
}
