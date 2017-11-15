package com.herofight;

import java.util.Set;

public class CharacterFactory {

    private Set<Class<? extends Character>> characters;

    public CharacterFactory(Set<Class<? extends Character>> characters) {
        this.characters = characters;
    }

    public Set<Class<? extends Character>> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Class<? extends Character>> characters) {
        this.characters = characters;
    }

    public Character createCharacter() {
        Double randomNumber = Math.random();
        Integer arraySize = this.characters.size();
        Integer randomIndex = (int) (randomNumber * (arraySize - 1));
        Character hero = null;

        // pick a random class from the set
        for (Class<? extends Character> obj : characters) {
            if (randomIndex == 0) {
                try {
                    hero = obj.newInstance();
                    break;
                } catch (InstantiationException e) {
//                e.printStackTrace();
                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
                }
            }
            randomIndex--;
        }

        if(hero != null){
            return hero;
        } else {
            return this.createCharacter();
        }

    }

}
