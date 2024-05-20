import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        JFrame playerOneFrame = new JFrame();
        JFrame playerTwoFrame = new JFrame();
        boolean turn = true;

        JPanel playerOneBoard = new Board(1);
        JPanel playerTwoBoard = new Board(2);

        playerOneFrame.add(playerOneBoard);
        playerOneFrame.setSize(500,500);
        playerOneFrame.setVisible(true);

        playerTwoFrame.add(playerTwoBoard);
        playerTwoFrame.setSize(500,500);
    }
}
