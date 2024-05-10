import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        int turn = 1;

        JPanel playerOneBoard = new Board(1);
        JPanel playerTwoBoard = new Board(2);


        mainFrame.add(playerOneBoard);
        mainFrame.setVisible(true);
    }
}
