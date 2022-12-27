import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Scanner;

public class App extends JPanel {
    //private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) throws Exception {
        Circle circle1 = new Circle(10);
        System.out.println(circle1.radius);

        Circle circle2 = new Circle();
        System.out.println(circle2.radius);

        Circle circle3 = new Circle();
        System.out.println(circle3.getArea());

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        Circle circle4 = new Circle(x);
        System.out.println(circle4.radius);

    }
}
