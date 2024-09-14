import javax.swing.*;
import java.awt.Color;

public class MainScreen extends JFrame {
    int WINDOW_WIDTH = 400;
    int WINDOW_HEIGHT = 400;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("pointify");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        this.setIconImage(new ImageIcon("Spotify_logo.png").getImage());

        this.getContentPane().setBackground(new Color(50, 120, 100));
    }

    public void display() {
        this.setVisible(true);
    }

}
