package org.example;

/**
 * The {@code Sword} class represents an item
 * that enhances a character's strength.
 * It is a subclass of {@link Item} and only provides a strength bonus.
 *
 * <p>Typically used by warriors or other strength-based characters.</p>
 *
 * Example:
 * <pre>
 *     Sword longsword = new Sword("Longsword", 5);
 * </pre>
 *
 * @author
 */
public class Sword extends Item {
    /**
     * Constructs a new {@code Sword} with the
     * specified name and strength bonus.
     *
     * @param name the name of the sword
     * @param strengthBonus the strength
     * bonus provided by the sword
     */
    public Sword(final String name, final int strengthBonus) {
        super(name, strengthBonus, 0);  // Strength only
    }
}
