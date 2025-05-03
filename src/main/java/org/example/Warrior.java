package org.example;

/**
 * The {@code Warrior} class represents a
 * specialized type of {@link Character}
 * in the game. Warriors are typically known
 * for their strength and combat skills.
 * This class allows custom initialization of health,
 * strength, and craft values.
 *
 * <p>It extends the base
 * {@code Character} class and passes warrior-specific
 * attributes to the superclass constructor.</p>
 *
 * @author
 */
public class Warrior extends Character {
    /**
     * Constructs a new {@code Warrior}
     * with the specified name, health, strength,
     * and craft.
     *
     * @param name     the name of the warrior
     * @param health   the initial health points of the warrior
     * @param strength the strength attribute of the warrior
     * @param craft    the craft (intelligence or magic)
     *                attribute of the warrior
     */
    public Warrior(final String name, final int health,
                   final int strength,
                   final int craft) {
        // constructor code
        super(name, health, strength, craft);
    }
}

