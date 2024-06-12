import org.example.Board;
import org.example.Player;
import org.example.TicTacToe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TicTacToeTest {
    @Test
    public void TestGame(){
        Board board = new Board();

        assertFalse(board.isIndexInRange(1, 5));
        assertFalse(board.isIndexInRange(-2, 0));
        assert(board.isIndexInRange(1, 2));
    }
    @Test
    public void TestIsEmpty() {
        Board board = new Board();

        board.place(1, 0, 'o');
        assertFalse(board.isCellEmpty(1,0));
    }
    @Test
    public void TestWin(){
        Player player1 = new Player('x');
        Player player2 = new Player('o');
        TicTacToe game = new TicTacToe(player1, player2);
        game.Board.place(1, 0, 'x');
        game.Board.place(1, 1, 'x');
        game.Board.place(1, 2, 'x');
        assert(game.hasWinner());
    }

}
