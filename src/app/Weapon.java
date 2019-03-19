package app;

import java.util.EnumSet;

enum Trait {
    REACH, LETHAL, BURST, AUTO, BLUNT, RANGED, THROWABLE, TWO_HANDED
}

public class Weapon {
    int value;
    EnumSet<Trait> traits;

    public boolean hasTrait(Trait desiredTrait) {
        for (var trait : traits) {
            if (trait == desiredTrait) {
                return true;
            }
        }
        // We didn't find it.
        return false;
    }

    public boolean isMelee() {
        return !(isRanged());
    }

    public boolean isThrowable() {
        return hasTrait(Trait.THROWABLE);
    }

    public boolean isRanged() {
        return hasTrait(Trait.RANGED);
    }

    public boolean isTwoHanded() {
        return hasTrait(Trait.TWO_HANDED);
    }

}
