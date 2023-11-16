import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("== IMC CALCULATOR ==");
        System.out.println("Enter your weight (KG):");
        double weight = scan.nextDouble();
        System.out.println("Enter your height (M):");
        double height = scan.nextDouble();
        double imc = imcCalculator(weight, height);

        System.out.println("Your IMC is: " + imc);

        classifyImc(imc);

        scan.close();
    }

    static double imcCalculator(double weight, double height) {
        return weight / (height * height);
    }

    static void classifyImc(double imc) {
        System.out.println("Classification:");

        if (imc < 18.5) {
            System.out.println("Underweight");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Normal weight");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
