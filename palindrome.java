import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scan.nextLine();
        String reversed = reverser(str);
        if(str.equals(reversed)){
            System.out.println("its a palindrome!");
        }else{
            System.out.println("Its not a palindrome!");
        }
    }
    
    static String reverser(String word){
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
