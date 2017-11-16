package com.herofight;

public abstract class Character {
    public int power;
    public int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public Character() {

    }

    public void decreasePower() {
        this.power--;
    }

    abstract void kick(Character c);

    boolean isAlive() {
        return hp > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Character)) {
            return false;
        }

        Character character = (Character) o;

        if (power != character.power) {
            return false;
        }
        return hp == character.hp;
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + hp;
        return result;
    }
}
