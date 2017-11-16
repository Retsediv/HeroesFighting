import com.herofight.Character;
import com.herofight.CharacterFactory;
import junit.framework.TestCase;
import org.reflections.Reflections;

import java.util.Set;

public class CharacterFactoryTest extends TestCase {
    Set<Class<? extends Character>> childs;

    @Override
    public void setUp() throws Exception {
        super.setUp();

        Reflections reflections = new Reflections("com.herofight");
        this.childs = reflections.getSubTypesOf(Character.class);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testFactoryCreation() throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();

        assertEquals(CharacterFactory.class, characterFactory.getClass());
    }

    public void testFactoryGettingTheCharacters() throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();

        assertEquals(characterFactory.getCharacters(), this.childs);
    }

    public void testCharacterCreation() throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();

        assertTrue(characterFactory.createCharacter() instanceof Character);
        assertTrue(this.childs.contains(characterFactory.createCharacter().getClass()));
    }

}
