import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Board extends JPanel{
private Tile[][] tiles;

    public Board(){
        tiles = new Tile[10][10];
        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                tiles[r][c] = new Tile();
            }
        }
    }


}
