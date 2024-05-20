import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Main {
    public static void main(String[] args) {

        JLabel label = new JLabel();

        ImageIcon image = new ImageIcon("logo.jpg");

        label.setText("Hey Maisy");
        label.setIcon(image);


        JFrame frame = new JFrame();


        frame.setSize(700,700);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hello world app");
        frame.add(label);

    }
}