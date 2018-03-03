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
public class Player {
    private String player;
    private String opponent;
    private boolean gameOver;
    private Board myBoard;
    
    public Player(){
        player = "";
        opponent = "";
        gameOver = false;
        myBoard = new Board();
        myBoard.newBoard();
    }
    
    public void makeMove(int x, int y){
        if((x>=0 & x<=2) & (y>=0 & y<=2)){
            if(myBoard.returnVal(x, y).equals("-")){
                myBoard.board[x][y] = player;
                myBoard.printBoard();
                System.out.println("Move made");
            }else{
                System.out.println("Invalid move");
            }
        }else{
            System.out.println("Invalid position");
        }
    }
    
    public void switchPlayer(){
        if(player.equals("X")){
            this.player = "O";
        }else{
            this.player = "X";
        }
    }
    
    public void setPlayer(String pl){
        this.player = pl;
    }
    
    public boolean gameOver(){
        // 
        if(myBoard.board[0][0].equals(player) & myBoard.board[0][1].equals(player) & myBoard.board[0][2].equals(player)){
            return true;
        }
        if(myBoard.board[1][0].equals(player) & myBoard.board[1][1].equals(player) & myBoard.board[1][2].equals(player)){
            return true;
        }
        if(myBoard.board[2][0].equals(player) & myBoard.board[2][1].equals(player) & myBoard.board[2][2].equals(player)){
            return true;
        }
        if(myBoard.board[0][0].equals(player) & myBoard.board[1][1].equals(player) & myBoard.board[2][2].equals(player)){
            return true;
        }
        if(myBoard.board[0][2].equals(player) & myBoard.board[1][1].equals(player) & myBoard.board[2][0].equals(player)){
            return true;
        }
        if(myBoard.board[0][0].equals(player) & myBoard.board[1][0].equals(player) & myBoard.board[2][0].equals(player)){
            return true;
        }
        if(myBoard.board[0][1].equals(player) & myBoard.board[1][1].equals(player) & myBoard.board[2][1].equals(player)){
            return true;
        }
        if(myBoard.board[0][2].equals(player) & myBoard.board[1][2].equals(player) & myBoard.board[2][2].equals(player)){
            return true;
        }
        return false;
    }
}
