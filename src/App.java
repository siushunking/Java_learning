import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class App extends JPanel {
    //private static final DecimalFormat DF = new DecimalFormat("0.00");
    @Override
    public void paintComponent(Graphics g){
        //g.drawString("Hello World", 100, 100);
        g.setColor(Color.BLACK);
        // g.drawLine(100, 100, 50, 50);
        g.drawRect(100, 100, 50, 50);
    }
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new App());
        window.setVisible(true);
    }
}
