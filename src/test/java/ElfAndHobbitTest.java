import com.herofight.Elf;
import com.herofight.Hobbit;
import junit.framework.TestCase;

public class ElfAndHobbitTest extends TestCase {
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreateElf() throws Exception {
        Elf elf = new Elf();

        assertTrue(elf.hp > 0);
        assertTrue(elf.power > 0);

    }

    public void testHobbit() throws Exception {
        Hobbit hobbit = new Hobbit();

        assertTrue(hobbit.hp > 0);
        assertTrue(hobbit.power == 0);
    }

    public void testElfKickHobbit() throws Exception {
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();

        // power of elf bigger than hobbit's, so elf will kill hobbit
        elf.kick(hobbit);
        assertEquals(0, hobbit.hp);
    }

    public void testHobbitKickElf() throws Exception {
        Elf elf = new Elf();
        // start values
        int health = elf.hp;
        int pow = elf.power;

        Hobbit hobbit = new Hobbit();

        hobbit.kick(elf);

        // nothing has to change
        assertEquals(health, elf.hp);
        assertEquals(pow, elf.power);
    }
}
