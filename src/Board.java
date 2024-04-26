import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Board extends JPanel{
private Tile[][] tiles;

    public Board(){
        super(new GridLayout(10,10));
        super.setBackground(new Color(25,55,255));
        tiles = new Tile[10][10];
        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                tiles[r][c] = new Tile();
                tiles[r][c].setOpaque(true);
                tiles[r][c].setBorderPainted(false);
                tiles[r][c].setBackground(Color.GREEN);
                super.add(tiles[r][c]);
            }
        }
    }


}
