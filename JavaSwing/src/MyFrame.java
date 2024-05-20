import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class MyFrame extends JFrame {
    MyFrame(){
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("My Java Application");
        this.getContentPane().setBackground(new Color(123,50,255));
    }

}
