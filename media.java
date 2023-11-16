import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        int n2 = scanner.nextInt();
        int media = (n1+n2)/2;
        System.out.println("A media sera: " + media);
    }
}
