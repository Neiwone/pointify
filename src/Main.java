import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        int WINDOW_WIDTH = 400;
        int WINDOW_HEIGHT = 400;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("pointify");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        frame.setVisible(true);
    }
}