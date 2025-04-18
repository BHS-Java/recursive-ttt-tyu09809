import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private Scanner scanner;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void playGame() {
        playTurn();
    }

    private void playTurn() {
        printBoard();
        
        System.out.println("move cuddi " + currentPlayer);
        int[] move = getInput();
        int row = move[0];
        int column = move[1];
        
        board[row][column] = currentPlayer;
        
        if (checkWin(currentPlayer)) {
            printBoard();
            System.out.println(currentPlayer + "win");
            return;
        } 
        if (isBoardFull(0, 0)) {
            printBoard();
            System.out.println("draw");
            return;
        }
        
        switchPlayer();
        playTurn();
    }

    private int[] getInput() {
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        return new int[]{row, column};
    }

    private boolean checkWin(char player) {
        return checkRow(0, 0, player) || checkColumn(0, 0, player) || checkDiagonal(player);
    }

    private boolean checkRow(int row, int column, char player) {
        if (column == 3) {
          return true;
        }
        if (board[row][column] != player) {
          return false;
        }
        return checkRow(row, column + 1, player);
    }

    private boolean checkColumn(int row, int column, char player) {
        if (row == 3) {
          return true;
        }
        if (board[row][column] != player) {
          return false;
        }
        return checkColumn(row + 1, column, player);
    }

    private boolean checkDiagonal(char player) {
        return checkMainDiagonal(0, player) || checkAntiDiagonal(2, player);
    }

    private boolean checkMainDiagonal(int index, char player) {
        if (index == 3) {
          return true;
        }
        if (board[index][index] != player) {
          return false;
        }
        return checkMainDiagonal(index + 1, player);
    }

    private boolean checkAntiDiagonal(int index, char player) {
        if (index == -1) {
          return true;
        }
        if (board[2 - index][index] != player) {
          return false;
        }
        return checkAntiDiagonal(index - 1, player);
    }

    private boolean isBoardFull(int row, int col) {
        if (row == 3){
          return true;
        }
        if (col == 3){ 
          return isBoardFull(row + 1, 0);
        }
        if (board[row][col] == ' '){
          return false;
        }
        return isBoardFull(row, col + 1);
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

}