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
public class Board {
    public String[][] board;
    
    public Board(){
        board = new String[3][3];
    }
    
    public Board(Board mBoard){
        this.board = mBoard.board;
    }
    
    //setup inital board
    public void newBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = "-";
            }
        }
    }
    
    //after a move is made, update the board
    public void updateBoard(String[][] currentBoard){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = currentBoard[i][j];
            }
        }
    }
    
    //print the current board
    public void printBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    
    public String returnVal(int x, int y){
        return board[x][y];
    }
    
}
