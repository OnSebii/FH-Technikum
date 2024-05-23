package org.example;

import java.util.Scanner;

public class TicTacToe {
    public Player Player1;
    public Player Player2;
    public Player CurrentPlayer;
    public Board Board;

    public TicTacToe(Player player1, Player player2, Player currentPlayer, org.example.Board board) {
        Player1 = new Player('X');
        Player2 = new Player('O');
        CurrentPlayer = Player1;
        Board = new Board();
    }
    public void play() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Board.print();
            System.out.println("Current Player: " + CurrentPlayer.getMarker());
            System.out.print("Row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Column (0-2): ");
            int col = sc.nextInt();

            if (Board.isCellEmpty(row, col)) {
                Board.place(row, col, CurrentPlayer.getMarker());
                if(hasWinner()) {
                    Board.print();
                    System.out.println("Player " + CurrentPlayer.getMarker() + " wins!");
                    break;
                }
            }
        }
    }

    public boolean hasWinner() {
        char m = CurrentPlayer.getMarker();
        for (int i = 0; i < 3; i++) {
            if ((Board.cells[i][0] == m && Board.cells[i][1] == m && Board.cells[i][2] == m) ||
                    (Board.cells[0][i] == m && Board.cells[1][i] == m && Board.cells[2][i] == m)) {
                return true;
            }
        }
        if ((Board.cells[0][0] == m && Board.cells[1][1] == m && Board.cells[2][2] == m) ||
                (Board.cells[0][2] == m && Board.cells[1][1] == m && Board.cells[2][0] == m)) {
            return true;
        }
        return false;
    }

}
