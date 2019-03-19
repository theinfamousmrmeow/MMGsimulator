package app;

public class Creature extends Entity {
    int hp;
    int hpMax;

    public boolean isDead() {
        return (hp > 0) ? true : false;
    }

    public boolean isAlive() {
        return !isDead();
    }

}