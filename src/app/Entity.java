package app;

/**
 * Serves as superclass for all in-game entities that interact with each other.
 */
abstract class Entity {
    /** Meant to be Overridden. Probably nobody shold use the super method. */
    public int getDefense() {
        return 7;
    }

    public boolean isDead() {
        return false;
    }
}