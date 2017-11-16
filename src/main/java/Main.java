import com.herofight.*;
import com.herofight.Character;
import org.reflections.Reflections;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        GameManager gm = new GameManager(new CharacterFactory());
        gm.fight();
    }

}
