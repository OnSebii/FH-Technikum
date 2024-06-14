package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        Init two players, board and the game
        Player playerX = new Player('X');
        Player playerY = new Player('O');
        TicTacToe game = new TicTacToe(playerX, playerY);

        game.play();
    }
}