import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius: ");
        double temp = scan.nextDouble();
        temp = converter(temp);
        System.out.println(temp + " Degrees Fahrenheit");
    }

    static double converter(double temp){
        return (temp*1.8)+32;
    }
}