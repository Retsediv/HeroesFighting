import com.herofight.*;
import com.herofight.Character;
import org.reflections.Reflections;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Reflections reflections = new Reflections("com.herofight");
        Set<Class<? extends Character>> classes = reflections.getSubTypesOf(Character.class);

        CharacterFactory characterFactory = new CharacterFactory(classes);
        GameManager gm = new GameManager();
        gm.fight(characterFactory.createCharacter(), characterFactory.createCharacter());
    }

}
