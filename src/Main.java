import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();

        JPanel playerOneBoard = new Board();
        JPanel playerTwoBoard = new Board();

        mainFrame.add(playerOneBoard);
        mainFrame.setVisible(true);
    }
}
