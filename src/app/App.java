package app;

import java.util.LinkedHashSet;

/** This will run the simulation */

public class App {

    public static void consoleOut(String output) {
        System.out.println(output);
    }

    public static void main(String[] args) throws Exception {

        var iterations = 100;

        Character guy = new Character();
        Character otherGuy = new Character();
        LinkedHashSet<Character> initiativeOrder = new LinkedHashSet<Character>();
        consoleOut("Sim begins.");
        // Determine Intiative order
        var init1 = Roller.rolld6() + guy.getIntiativeBonus();
        var init2 = Roller.rolld6() + guy.getIntiativeBonus();
        if (init1 > init2) {
            initiativeOrder.add(guy);
            initiativeOrder.add(otherGuy);
        } else {
            initiativeOrder.add(otherGuy);
            initiativeOrder.add(guy);
        }
        // Loop through the initiative order.
        for (Character currentGuy : initiativeOrder) {
            // Do actions for currentGuy

        }

        for (var iteration = 0; iteration < iterations; iteration++) {
            consoleOut("Beginning combat " + iteration);
            var round = 0;
            while (guy.isAlive() && otherGuy.isAlive() && round < 100) {
                guy.attackTarget(otherGuy);
                otherGuy.attackTarget(otherGuy);
                round++;
            }

        }

    }
}