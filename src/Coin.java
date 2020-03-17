/**
 * Class meant to represent a coin in the game.
 * @author Trey Pachucki ttp2542@g.rit.edu
 */
public class Coin extends Part{
  /**
   * Constructor for a basic coin (Worth 1 point).
   */
  public Coin(){
    super(1, true);
  }

  /**
   * Returns String representation of a basic coin 'C'
   * @return 'C'
   */
  public String toString(){
    return "C";
  }
}