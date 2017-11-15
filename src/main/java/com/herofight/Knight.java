package com.herofight;

public class Knight extends Swordsman {
    private static final int MIN_HP = 2;
    private static final int MAX_HP = 21;
    private static final int MIN_POWER = 2;
    private static final int MAX_POWER = 21;

    public Knight() {
        super(MIN_HP, MAX_HP, MIN_POWER, MAX_POWER);
    }

    @Override
    void kick(Character c) {
        kickBehaviour.kick(this, c);
    }
}
