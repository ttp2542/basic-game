import java.util.ArrayList;

/**
 * The board on which the game is played. 2D Part array.
 * @author Trey Pachucki ttp2542@g.rit.edu
 */
public class Board{
  //The board itself
  Part[][] board;
  //The coins
  ArrayList<Part> coins;
  //The Player
  Part player;

  /**
   * Default constructor. Makes a basic 5 by 5 board.
   */
  public Board(){
    this.board = new Part[5][5];
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        this.board[i][j] = null;
      }
    }

    this.coins = new ArrayList<>();
  }

  /**
   * Adds a game part to the board.
   * @param row The row to be added to
   * @param col The column to be added to
   * @param part The part to be added
   */
  public void addPart(int row, int col, Part part){
    this.board[row][col] = part;
    part.place(row, col);
    if(part.notPlayer()){
      coins.add(part);
    }else{
      this.player = part;
    }
  }


}