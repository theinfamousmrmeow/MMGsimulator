package app;

import java.util.*;

enum Results {
    HIT, MISS, FUMBLE, CRITICAL
}

public class Roller {

    /** Generate random int between two ints */
    public static int getRandomInRange(int rangeBegin, int rangeEnd) {
        return (rangeBegin) + (int) (Math.random() * (rangeEnd - rangeBegin));
    }

    /** Roll a six-sided die. */
    public static int rolld6() {
        return getRandomInRange(1, 6);
    }

    /** Roll two six-sided dice. */
    public static int roll2d6() {
        return rollDice(2);
    }

    public static Results taskRoll(int bonus, int taskNumber) {
        var roll = roll2d6();
        if (roll == 2) {
            return Results.FUMBLE;
        } else if (roll == 12) {
            return Results.CRITICAL;
        } else if (roll + bonus < taskNumber) {
            return Results.MISS;
        } else {
            return Results.HIT;
        }
    }

    /** Roll a single die with given sides. */
    public static int rollDie(int sides) {
        return getRandomInRange(1, sides);
    }

    /** Roll the given number of dice. */
    public static int rollDice(int dice) {
        var total = 0;
        for (var i = 0; i < dice; i++) {
            total += rolld6();
        }

        return total;
    }

    /**
     * For unit testing only. Wouldn't normally enter here.
     */
    public static void main(String args[]) {

    }

}