package com.herofight;

public class GameManager {
    public CharacterFactory characterFactory;

    public GameManager(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public void fight() {
        Character c1 = characterFactory.createCharacter();
        Character c2 = characterFactory.createCharacter();

        boolean draw = false;

        String c1_name = c1.getClass().getSimpleName();
        String c2_name = c2.getClass().getSimpleName();

        System.out.printf("First warrior: %s with %d hp%n", c1_name, c1.hp);
        System.out.printf("Second warrior: %s with %d hp%n%n", c2_name, c2.hp);


        int rounds = 0;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("First hero: ");
            c1.kick(c2);

            if (c2.isAlive()) {
                System.out.println("Second hero: ");
                c2.kick(c1);
                System.out.println();
            }

            rounds++;

            if (rounds > 100) {
                draw = true;
                break;
            }
        }

        if (draw) {
            System.out.println("No one won");
        } else {

            if (c1.isAlive()) {
                System.out.printf("%s won in %d round", c1_name, rounds);
            } else {
                System.out.printf("%s won in %d round", c2_name, rounds);
            }

        }

    }
}
