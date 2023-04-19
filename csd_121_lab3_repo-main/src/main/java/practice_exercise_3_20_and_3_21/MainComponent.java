package practice_exercise_3_20_and_3_21;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class MainComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        House house1 = new House(100, 100, 50, 50);
        House house2 = new House(250, 250, 250, 250);
        House house3 = new House(750,300,500,500);

        house1.draw(g2);
        house2.draw(g2);
        house3.draw(g2);
        // Add at least three houses of different positions and sizes
    }
}
