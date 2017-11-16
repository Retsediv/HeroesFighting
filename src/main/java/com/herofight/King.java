package com.herofight;

public class King extends Swordsman {
    private static final int MIN_HP = 5;
    private static final int MAX_HP = 15;
    private static final int MIN_POWER = 5;
    private static final int MAX_POWER = 15;

    public King() {
        super(MIN_HP, MAX_HP, MIN_POWER, MAX_POWER);
    }

    @Override
    public void kick(Character c) {
//        if (this.hp > 10) {
//            kickBehaviour = (c1, c2) -> c2.hp = 0;
//        }

        kickBehaviour.kick(this, c);
        System.out.format("%s kicked another character by %d points%n", this.getClass().getSimpleName(), this.power);
    }
}
