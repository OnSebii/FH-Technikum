package org.example;

import java.util.Scanner;

public class TicTacToe {
    public Player player1;
    public Player player2;
    public Player currentPlayer;
    public Board board;

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
    }
    public void play() {
        currentPlayer = player1;
        boolean switcher = false;
        Scanner sc = new Scanner(System.in);
        while (!hasWinner()) {
            switcher = !switcher;
            currentPlayer = switcher ? player1 : player2;
            while (true) {
                board.print();
                System.out.println("Current Player: " + currentPlayer.getMarker());
                System.out.print("Row (0-2): ");
                int row = sc.nextInt();
                System.out.print("Column (0-2): ");
                int col = sc.nextInt();

                if (!board.isIndexInRange(row,col)) {
                    System.out.println("Index out of bounds. Try again!");
                    continue;
                }
                if (board.isCellEmpty(row, col)) {
                    board.place(row, col, currentPlayer.getMarker());
                    break;
                }
                System.out.println("Field is already taken. Try again!");
            }
        }
        board.print();
        System.out.println("Player " + currentPlayer.getMarker() + " wins!");
    }

    public boolean hasWinner() {
        char m = currentPlayer.getMarker();
        for (int i = 0; i < 3; i++) {
            if ((board.cells[i][0] == m && board.cells[i][1] == m && board.cells[i][2] == m) ||
                    (board.cells[0][i] == m && board.cells[1][i] == m && board.cells[2][i] == m)) {
                return true;
            }
        }
        return (board.cells[0][0] == m && board.cells[1][1] == m && board.cells[2][2] == m) ||
                (board.cells[0][2] == m && board.cells[1][1] == m && board.cells[2][0] == m);
    }

}
