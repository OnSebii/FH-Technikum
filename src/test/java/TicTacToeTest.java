import org.example.Board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TicTacToeTest {
    @Test
    public void TestIndex(){
        Board board = new Board();

        assertFalse(board.isIndexInRange(1, 5));
        assertFalse(board.isIndexInRange(-2, 0));
        assert(board.isIndexInRange(1, 2));
    }
}
