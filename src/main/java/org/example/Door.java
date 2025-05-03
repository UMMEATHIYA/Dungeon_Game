/**
 * The Door class represents a door between two chambers in the dungeon.
 * A door can be guarded by a monster, and players must deal with the monster
 * (if present) before passing through the door. The door can connect two chambers
 * and allows players to move between them.
 */
package org.example;

public class Door {
    private Chamber chamber1;
    private Chamber chamber2;
    private Monster monster;

    /**
     * Creates a door between two chambers and optionally associates a monster with the door.
     *
     * @param chamber1 The first chamber connected by the door.
     * @param chamber2 The second chamber connected by the door.
     * @param monster The monster guarding the door, or null if the door is unguarded.
     */
    public Door(Chamber chamber1, Chamber chamber2, Monster monster) {
        this.chamber1 = chamber1;
        this.chamber2 = chamber2;
        this.monster = monster;
    }

    /**
     * Returns the other chamber connected by the door, given one of the chambers.
     *
     * @param from The chamber from which the player is currently in.
     * @return The other chamber connected by the door, or null if the given chamber is not connected.
     */
    public Chamber getOtherChamber(Chamber from) {
        if (from.equals(chamber1)) {
            return chamber2;
        } else if (from.equals(chamber2)) {
            return chamber1;
        } else {
            return null;
        }
    }

    /**
     * Checks if the door is guarded by a monster (i.e., if there is a monster with positive health).
     *
     * @return True if the door is guarded by a monster, false otherwise.
     */
    public boolean hasMonster() {
        return monster != null && monster.getHealth() > 0;
    }

    /**
     * Returns the monster guarding the door, if there is one.
     *
     * @return The Monster object guarding the door, or null if the door is unguarded.
     */
    public Monster getMonster() {
        return monster;
    }

    /**
     * Checks if the door is currently guarded by a monster.
     *
     * @return True if the door is guarded, false otherwise.
     */
    public boolean isGuarded() {
        return monster != null && monster.getHealth() > 0;
    }

    /**
     * Removes the monster guarding the door, making it unguarded.
     */
    public void removeMonster() {
        this.monster = null;
    }
}
