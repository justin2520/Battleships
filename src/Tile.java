import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Tile extends JButton{

    public Tile(){
        super.setBackground(new Color(25,55,200));

        super.addActionListener(new ActionListener(){
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
