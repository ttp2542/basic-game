/**
 * Runs the game (incomplete as of now).
 */
public class Main {
  public static void main(String[] args) {
    Board board = new Board();
    Player player = new Player();

    Coin coin1 = new Coin();

    board.addPart(1, 1, coin1);
    board.addPart(2, 2, player);
  }
}