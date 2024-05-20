import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Board extends JPanel{
    private Tile[][] tiles;
    private ArrayList<Ship> ships;
    private int player;
    private int patrolBoats = 4;
    private int submarinesDestroyers = 3;
    private int battleships = 2;
    private int carriers = 1;

    public Board(int player){
        super(new GridLayout(10,10));
        this.player = player;
        super.setBackground(new Color(25,55,255));
        tiles = new Tile[10][10];

        for(int i = 0; i < 10; i++){

        }

        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                tiles[r][c] = new Tile();
                super.add(tiles[r][c]);

                int row = r;
                int col = c;

                tiles[r][c].addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        int place = JOptionPane.showConfirmDialog(null, "Would you like to place a ship here?");
                        if(place == JOptionPane.YES_OPTION){
                            int size = Integer.parseInt(JOptionPane.showInputDialog(null, "What size would you like the ship to be?"));

                            switch(size){
                                case 2:
                                    if(patrolBoats != 0){
                                        checkRotation(size, row, col);
                                    }
                                    else{
                                        noMoreShipsError();
                                    }
                                    break;

                                case 3:
                                    if(submarinesDestroyers != 0){
                                        checkRotation(size, row, col);
                                    }
                                    else{
                                        noMoreShipsError();
                                    }
                                    break;

                                case 4:
                                    if(battleships != 0){
                                        checkRotation(size, row, col);
                                    }
                                    else{
                                        noMoreShipsError();
                                    }
                                    break;

                                case 5:
                                    if(carriers != 0){
                                        checkRotation(size, row, col);
                                    }
                                    else{
                                        noMoreShipsError();
                                    }
                                    break;

                                default:
                                    if(size > 5){
                                        JOptionPane.showMessageDialog(null,"This size is too large.");
                                    }
                                    if(size < 2){
                                        JOptionPane.showMessageDialog(null,"This size is too small.");
                                    }
                                    break;
                            }
                        }
                    }
                });
            }
        }
    }

    public void noMoreShipsError(){
        JOptionPane.showMessageDialog(null, "You have no ships of this type.");
    }

    public void checkRotation(int size, int r, int c){
        String choice = JOptionPane.showInputDialog(null, "Which direction? (Enter either L, R, U, or D.)");
        boolean isPossible = true;

        switch(choice){
            case "L":
                if((c - size) < -1){
                    doesNotFitError();
                }
                else{
                    for(int sC = c; sC > c - size && isPossible; sC--){
                        if(isInhabited(sC, c)){
                            isPossible = false;
                        }
                    }

                    if(isPossible){
                        // ships.add(new Ship(size));
                        for(int sC = c; sC > c - size; sC--){
                          tiles[r][sC].updateTile(true, Color.RED);  
                        }

                        removeShip(size);
                    }
                    else{
                        shipInTheWayError();
                    }
                }
                break;

            case "R":
                if((c + size) > 10){
                    doesNotFitError();
                }
                else{
                    for(int sC = c; sC < c + size && isPossible; sC++){
                        if(isInhabited(sC, c)){
                            isPossible = false;
                        }
                    }
                    
                    if(isPossible){
                        // ships.add(new Ship(size));
                        for(int sC = c; sC < c + size; sC++){
                          tiles[r][sC].updateTile(true, Color.RED);  
                        }

                        removeShip(size);
                    }
                    else{
                        shipInTheWayError();
                    }
                }
                break;

            case "U":
                if((r - size) < -1){
                    doesNotFitError();
                }
                else{
                    for(int sR = r; sR > r - size && isPossible; sR--){
                        if(isInhabited(sR, r)){
                            isPossible = false;
                        }
                    }

                    if(isPossible){
                        // ships.add(new Ship(size));
                        for(int sR = r; sR > r - size; sR--){
                          tiles[sR][c].updateTile(true, Color.RED);  
                        }

                        removeShip(size);
                    }
                    else{
                        shipInTheWayError();
                    }
                }
                break;

            case "D":
                if((c + size) > 10){
                    doesNotFitError();
                }
                else{
                    for(int sR = r; sR < r + size && isPossible; sR++){
                        if(isInhabited(sR, c)){
                            isPossible = false;
                        }
                    }

                    if(isPossible){
                        // ships.add(new Ship(size));
                        for(int sR = r; sR < r + size; sR++){
                          tiles[sR][c].updateTile(true, Color.RED);  
                        }

                        removeShip(size);
                    }
                    else{
                        shipInTheWayError();
                    }
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid response.");
                break;
        }
    }

    public void doesNotFitError(){
        JOptionPane.showMessageDialog(null, "This does not fit.");
    }
    
    public boolean isInhabited(int r, int c){
        if(tiles[r][c].isBattleship()){
            return true;
        }
        return false;
    }

    public void shipInTheWayError(){
        JOptionPane.showMessageDialog(null, "There is a ship in the way.");
    }

    public ArrayList<Ship> returnShips(){
        return ships;
    }

    public void removeShip(int size){
        if(size == 2){
            patrolBoats--;
        }
        else if(size == 3){
            submarinesDestroyers--;
        }
        else if(size == 4){
            battleships--;
        }
        else{
            carriers--;
        }
    }
}
