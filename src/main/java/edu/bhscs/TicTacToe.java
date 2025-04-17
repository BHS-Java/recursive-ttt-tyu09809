import java.util.Scanner;
public class TicTacToe {

  private char[][] board;
  private char currentPlayer;

  public TicTacToe() {
      board = new char[3][3];
      currentPlayer = 'X';
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              board[i][j] = ' ';
          }
      }
  }

  public void playGame() {
      playTurn();
  }

  public void playTurn(){
    boolean gameend = true;
    if (gameend){
      return;
    }
    Scanner scanner = new Scanner(System.in);
    System.out.println("what is your x coordinate");
    String xcoord = scanner.nextLine();
    int x = Integer.parseInt(xcoord);
    System.out.println("what is your y coordinate");
    String ycoord = scanner.nextLine();
    int y = Integer.parseInt(ycoord);
    board[x][y];
    playTurn();
  }
}