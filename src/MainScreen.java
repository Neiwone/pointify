import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    int WINDOW_WIDTH = 500;
    int WINDOW_HEIGHT = 500;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("pointify");
        //this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        this.setIconImage(new ImageIcon("Spotify_logo.png").getImage());

        //this.setLayout(null);
        this.getContentPane().setBackground(new Color(50, 120, 100));

        setWelcomeLabel();

        this.pack();
    }

    public void setWelcomeLabel() {
        JLabel welcomeLabel = new JLabel();

        ImageIcon pointifyImage = new ImageIcon("pointify_logo_with_text.png");

        welcomeLabel.setText("Welcome to pointify, your best digital music service");
        welcomeLabel.setIcon(pointifyImage);

        welcomeLabel.setFont(new Font("", Font.PLAIN, 20));
        welcomeLabel.setForeground(Color.BLACK);

        welcomeLabel.setHorizontalTextPosition(JLabel.CENTER);
        welcomeLabel.setVerticalTextPosition(JLabel.BOTTOM);

        welcomeLabel.setBackground(new Color(50, 120, 100));
        welcomeLabel.setOpaque(true);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setVerticalAlignment(JLabel.CENTER);
        //welcomeLabel.setBounds(0, 0, 500, 250);
        this.add(welcomeLabel);
    }

    public void display() {
        this.setVisible(true);
    }

}
