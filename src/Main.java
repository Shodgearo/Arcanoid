// Спустя долгие месяцы я решил заного попробовать сдеать Арканоид, правда так же не знаю как.

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private JPanel panel;

    public Main() {
        initWindow();
        initMainPanel();
        addElements();
    }

    private void addElements() {
        add(panel);
    }

    private void initMainPanel() {
        panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponents(g);

                g.drawImage(new ImageIcon("Resource\\bg1.png").getImage(), 0, 0, this);
            }
        };
    }

    private void initWindow() {
        setTitle("Arcanoid");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}