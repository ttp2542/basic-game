/**
 * A basic game part class.
 */
public abstract class Part{

  //The score worth of the object
  int score;
  //The x position of the object
  int posx;
  //The y position of the object on the board
  int posy;
  //A boolean of whether or not the object is the player
  boolean notPlayer;

  /**
   * Basic constructor for the abstract class
   * @param score The score value of the part
   * @param notPlayer Whether or not the object is a player
   */
  public Part(int score, boolean notPlayer){
    this.score = score;
    this.notPlayer = notPlayer;
  }

  /**
   * Getter for the score value of the object
   * @return The score
   */
  public int getScore(){
    return this.score;
  }

  /**
   * Setter for the coordinates of the object
   * @param posx It's x position on the board
   * @param posy its y position on the board
   */
  public void place(int posx, int posy){
    this.posx = posx;
    this.posy = posy;
  }

  /**
   * Getter for the x position
   * @return posx
   */
  public int getPosx(){
    return this.posx;
  }

  /**
   * Getter for the y position
   * @return posy
   */
  public int getPosy(){
    return this.posy;
  }

  /**
   * Getter for whether or not this part is a player
   * @return Whether or not the part is a player
   */
  public boolean notPlayer(){
    return this.notPlayer;
  }
}