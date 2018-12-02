// Спустя долгие месяцы я решил заного попробовать сдеать Арканоид, правда так же не знаю как.

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    final int WIDTH = 800;
    final int HEIGHT = 600;

    public Main() {
        initWindow();
        initMainPanel();
    }

    private void initMainPanel() {

    }

    private void initWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arcanoid");
        setResizable(false);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
