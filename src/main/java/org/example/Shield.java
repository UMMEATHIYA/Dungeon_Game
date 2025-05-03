package org.example;

/**
 * The {@code Shield} class represents a defensive
 * item that enhances a character's strength.
 * It is a subclass of {@link Item} and
 * provides a strength bonus only.
 *
 * <p>Shields can be equipped by characters to
 * improve their combat effectiveness.</p>
 *
 * Example:
 * <pre>
 *     Shield ironShield = new Shield("Iron Shield", 3);
 * </pre>
 *
 * @author
 */
public class Shield extends Item {
    /**
     * Constructs a new {@code Shield} with the
     * specified name and strength bonus.
     *
     * @param name the name of the shield
     * @param strengthBonus the strength bonus provided by the shield
     */
    public Shield(final String name, final int strengthBonus) {
        super(name, strengthBonus, 0);  // Strength only
    }
}
