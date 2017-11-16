import com.herofight.CharacterFactory;
import com.herofight.GameManager;
import junit.framework.TestCase;

public class GameManagerTest extends TestCase{
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGameManagerCreation() throws Exception {
        GameManager game = new GameManager(new CharacterFactory());

        assertEquals(game.getClass(), GameManager.class);
    }

    public void testFighting() throws Exception {
        GameManager game = new GameManager(new CharacterFactory());

        game.fight();
    }
}
