import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Tile {
    private JButton button;

    public Tile(){
        button = new JButton();
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int place = JOptionPane.showConfirmDialog(null, "Would you like to place a ship here?");
            }
        });
    }

//    public void updateTile(int ){
//
//    }
}
