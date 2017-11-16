package com.herofight;

public class Elf extends Character {
    private static final int DEFAULT_HP = 10;
    private static final int DEFAULT_POWER = 10;

    public Elf() {
        power = DEFAULT_POWER;
        hp = DEFAULT_HP;
    }

    @Override
    public void kick(Character c) {
        if(c.power < this.power) {
            // kill him
            c.hp = 0;

            System.out.println("Elf killed another character");
        } else {
            // decrease power by 1
            c.decreasePower();

            System.out.println("Elf decreased power of another character");
        }
    }
}
