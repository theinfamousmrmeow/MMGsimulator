package app;

/**
 * Used for enemies in M&MG.
 */

public class Critter extends Entity {
    int ability;
    int attack;
    int defense;
    int hp;
    int hpMax;

    /** Returns critter's defense. */
    @Override
    public int getDefense() {
        return defense;
    }

}