import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Board extends JPanel{
    private Tile[][] tiles;
    private Battleship[] battleships;
    private int player;

    public Board(int player){
        super(new GridLayout(10,10));
        this.player = player;
        super.setBackground(new Color(25,55,255));
        super.setSize(500,500);
        tiles = new Tile[10][10];

        for(int i = 0; i < 10; i++){

        }

        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                tiles[r][c] = new Tile();
                super.add(tiles[r][c]);

                tiles[r][c].addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        int place = JOptionPane.showConfirmDialog(null, "Would you like to place a ship here?");
                        if(place == JOptionPane.YES_OPTION){
//                            int size = JOptionPane.showInputDialog(null, "What size ");
                        }
                    }
                });
            }
        }
    }

    public void addBattleship(){

    }
}
