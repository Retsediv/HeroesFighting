package com.herofight;

abstract class Swordsman extends Character {

    protected KickBehaviour kickBehaviour = new Sword();

    public Swordsman(int min_hp, int max_hp, int min_power, int max_power) {
        hp = min_hp + (int) (Math.random() * ((max_hp - min_hp) + 1));
        power = min_power + (int) (Math.random() * ((max_power - min_power) + 1));
    }

}
