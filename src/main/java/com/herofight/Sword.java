package com.herofight;

public class Sword implements KickBehaviour {
    @Override
    public void kick(Character c1, Character c2) {
        c2.hp -= c1.power;
    }
}
