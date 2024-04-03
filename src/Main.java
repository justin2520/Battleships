import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        System.out.println("Hi");


        JPanel battleShips = new JPanel(new GridLayout(10, 10));

        mainFrame.add(battleShips);

        mainFrame.setVisible(true);
    }
}
