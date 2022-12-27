import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) throws Exception {
        char lastName = 'R';
        System.out.println(lastName);

        String firstName = "IVAN";
        System.out.println(firstName);
        System.out.println("Where start? " + firstName.charAt(1));
        System.out.println(firstName.indexOf("AN"));

        String age = "25";
        System.out.println("convert string to number:" + Integer.parseInt(age));


        System.out.println("Hello, World!");


        Scanner scanner = new Scanner(System.in);
        System.out.print("How much is your weight: ");
        double weight = scanner.nextDouble();
        System.out.println(weight);

        System.out.print("How much is your height: ");
        double height = scanner.nextDouble() / 100;

        double bmi = Double.parseDouble(DF.format(weight/ (height * height)));
        System.out.println(bmi);

    }
}
