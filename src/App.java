import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class App {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) throws Exception {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Aike");
        friends.add("ZGrace");
        friends.add("Wilson");
        Collections.sort(friends);
        System.out.println(friends.get(2));
        System.out.println(friends);
    }
}
