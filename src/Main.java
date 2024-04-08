import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();

        JPanel battleShips = new JPanel(new GridLayout(10, 10));

//        ImageIcon slot00Image = new ImageIcon();

        mainFrame.add(battleShips);

        mainFrame.setVisible(true);
    }
}
