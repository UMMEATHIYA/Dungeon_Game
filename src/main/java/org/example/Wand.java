package org.example;

/**
 * The {@code Wand} class represents a magical item
 * that enhances a character's craft attribute.
 * This item does not provide any bonus to strength
 * and is specifically designed for magic users,
 * such as Wizards.
 *
 * <p>It extends the {@link Item} class and sets the strength bonus to 0 while
 * allowing a custom craft bonus.</p>
 *
 * @author
 */
public class Wand extends Item {
    /**
     * Constructs a new {@code Wand} with the specified name and craft bonus.
     *
     * @param name       the name of the wand
     * @param craftBonus the bonus to the craft attribute this wand provides
     */
    public Wand(final String name, final int craftBonus) {
        super(name, 0, craftBonus);  // Craft only
    }
}

