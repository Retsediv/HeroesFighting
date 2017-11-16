import com.herofight.King;
import com.herofight.Knight;
import junit.framework.TestCase;

public class KingAndKnightTest extends TestCase {
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreateKing() throws Exception {
        King king = new King();

        assertTrue(king.hp >= 5);
        assertTrue(king.power >= 5);
    }

    public void testCreateKnight() throws Exception {
        Knight knight = new Knight();

        assertTrue(knight.hp >= 2);
        assertTrue(knight.power >= 2);
    }

    public void testKingKickKnight() throws Exception {
        King king = new King();
        Knight knight = new Knight();
        // save values
        int hp = knight.hp;

        // kick
        king.kick(knight);

        assertEquals(hp - king.power, knight.hp);
    }

    public void testKnightKickKing() throws Exception {
        Knight knight = new Knight();
        King king = new King();
        // save values
        int hp = king.hp;

        // kick
        knight.kick(king);

        assertEquals(hp - knight.power, king.hp);
    }
}
