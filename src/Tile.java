import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Tile extends JButton{
    private boolean battleship;

    public Tile(){
        
    }

    public void updateTile(boolean battleship, Color color){
        this.battleship = battleship;
        super.setBackground(color);
    }

    public boolean isBattleship(){
        return battleship;
    }
}
