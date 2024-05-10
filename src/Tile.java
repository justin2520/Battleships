import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Tile extends JButton{
    private boolean battleship;

    public Tile(){
        super.setBackground(new Color(25,55,200));
    }

    public void updateTile(boolean battleship){
        this.battleship = battleship;
    }

    public boolean isBattleship(){
        return battleship;
    }
}
