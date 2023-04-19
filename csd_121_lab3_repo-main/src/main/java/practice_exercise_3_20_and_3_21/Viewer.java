package practice_exercise_3_20_and_3_21;
import javax.swing.*;
public class Viewer {
    
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setSize(1920, 1080);
        fr.setTitle("House Pictor");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainComponent comp = new MainComponent();
        fr.add(comp);
        fr.setVisible(true);
    }
    
}
