package com.herofight;

public class Hobbit extends Character {
    private static final int DEFAULT_HP = 3;
    private static final int DEFAULT_POWER = 0;

    public Hobbit() {
        hp = DEFAULT_HP;
        power = DEFAULT_POWER;
    }

    @Override
    void kick(Character c) {
        toCry();
    }

    void toCry() {
        System.out.println("Cry......!!!");
    }
}
