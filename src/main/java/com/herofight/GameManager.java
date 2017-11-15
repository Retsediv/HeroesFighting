package com.herofight;

public class GameManager {
    CharacterFactory characterFactory;

    public GameManager() {

    }

    public void fight(Character c1, Character c2) {
        String c1_name = c1.getClass().getName();
        String c2_name = c2.getClass().getName();

        System.out.printf("First warrior: %s with %d hp\n", c1_name, c1.hp);
        System.out.printf("Second warrior: %s with %d hp\n", c2_name, c2.hp);


        int rounds = 0;
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);

            if (c2.isAlive()) {
                c2.kick(c1);
            }

            rounds++;
        }

        if (c1.isAlive()) {
            System.out.printf("%s win in %d round", c1_name, rounds);
        } else {
            System.out.printf("%s win in %d round", c2_name, rounds);
        }
    }
}
