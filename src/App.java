import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Scanner;

public class App extends JPanel {
    // //private static final DecimalFormat DF = new DecimalFormat("0.00");
    // public static int add(int x, int y){
    //     return x + y;
    // }
    public static void main(String[] args) throws Exception {
        // App m = new App();
        Student student = new Student("name", 88, "address", "subject");
        student.walk();
        System.out.println(student.address);


        // like injectable
        // Robot robot = new Robot();
        //Encapusulation 
        // Scanner z = new Scanner(System.in);
        // String y = z.next();
        // robot.setName(y);
        // System.out.println(robot.getName());

        // robot.setYearMade(23);
        // System.out.println(robot.getYear());

        // System.out.println(m.add(5, 5));
        
        // Circle circle1 = new Circle(10);
        // System.out.println(circle1.radius);

        // Circle circle2 = new Circle();
        // System.out.println(circle2.radius);

        // Circle circle3 = new Circle();
        // System.out.println(circle3.getArea());

        // Scanner s = new Scanner(System.in);
        // int x = s.nextInt();
        // Circle circle4 = new Circle(x);
        // System.out.println(circle4.radius);

    }
}
