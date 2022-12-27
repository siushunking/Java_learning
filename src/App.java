import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) throws Exception {
       

        String vaccine = JOptionPane.showInputDialog("Hello, Welcome to Javatpoint.");  
        vaccine = vaccine.toLowerCase();

        if(vaccine.equals("az")){
            JOptionPane.showMessageDialog(null,"Hello, Welcome to Javatpoint.");  
        }

    }
}
