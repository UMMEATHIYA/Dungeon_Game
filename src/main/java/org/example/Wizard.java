package org.example;

/**
 * The {@code Wizard} class represents a specific type of {@link Character}
 * in the game with predefined attributes such as maximum level and base health.
 * It extends the {@code Character} class and sets wizard-specific properties
 * upon instantiation.
 *
 * <p>Wizards typically have higher magic abilities, and this class initializes
 * their stats accordingly.</p>
 *
 * @author
 */

public class Wizard extends Character {
    /** The maximum level a Wizard can achieve. */
    private static final int MAX_LEVEL = 10;
    /** The base health value for a Wizard. */
    private static final int BASE_HEALTH = 100;

    /**
     * Constructs a new {@code Wizard} with the specified name.
     * Initializes the character with a class ID of 2, a max level of 10,
     * and a base health of 100.
     *
     * @param name the name of the wizard
     */
    public Wizard(final String name) {
        // Use constants for level and health
        super(name, 2, MAX_LEVEL, BASE_HEALTH);
    }
}
