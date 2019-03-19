package app;

import java.util.*;

public class Dice {

    int sides;

    public int roll() {
        Roller.getRandomInRange(1, sides);
        return sides;
    }
}