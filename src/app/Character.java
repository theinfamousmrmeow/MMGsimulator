package app;

/**
 * In-world characters that have player-like stats.
 */

public class Character extends Creature {

    int physical;
    int mental;
    int social;
    int combat;

    Object armor;
    Weapon weapon;
    Object offHandWeapon;
    String name;

    /** Returns calculated defense. */
    @Override
    public int getDefense() {
        return 7 + physical + getArmorDefense();
    }

    // TODO: Make this work.
    public int getArmorDefense() {
        return 0;
    }

    public int getMeleeBonus() {
        return combat;
    }

    public int getRangedBonus() {
        return combat;
    }

    public Results attackTarget(Entity target) {
        return Roller.taskRoll(getMeleeBonus(), target.getDefense());
    }

    public int getIntiativeBonus() {
        return physical;
    }

    public boolean attackWithWeapon(Entity target) {

        return true;
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

}