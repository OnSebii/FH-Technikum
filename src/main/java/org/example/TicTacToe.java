package org.example;

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


}
