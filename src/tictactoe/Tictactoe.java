/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Ezat
 */
public class Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player myPlayer = new Player();
        myPlayer.setPlayer("X");
        System.out.println(myPlayer.gameOver());
        myPlayer.makeMove(1, 0);
        System.out.println(myPlayer.gameOver());
        //myPlayer.switchPlayer();
        myPlayer.makeMove(1, 1);
        System.out.println(myPlayer.gameOver());
        myPlayer.makeMove(1, 2);
        System.out.println(myPlayer.gameOver());
    }
    
}
