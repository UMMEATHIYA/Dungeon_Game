package org.example;

/**
 * The {@code Monster} class represents a monster in the dungeon game.
 * Each monster has a name, strength, craft, and health, which determine
 * its combat abilities and interactions with the player.
 *
 * <p>This class provides methods to get the monster's attributes,
 * reduce its health, and perform combat-related actions.</p>
 *
 * Example usage:
 * <pre>
 *     Monster monster = new Monster("Dragon", 10, 5, 100);
 *     monster.reduceHealth(20);
 * </pre>
 *
 * @author
 */
public class Monster {

    /** The name of the monster. */
    private String name;

    /** The strength of the monster. */
    private int strength;

    /** The craft (intelligence) of the monster. */
    private int craft;

    /** The current health of the monster. */
    private int health;

    /**
     * Constructs a {@code Monster} with the specified attributes.
     *
     * @param name    the name of the monster
     * @param strength the strength of the monster
     * @param craft   the craft (intelligence) of the monster
     * @param health  the initial health of the monster
     */
    public Monster(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
    }

    /**
     * Gets the current health of the monster.
     *
     * @return the current health of the monster
     */
    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0; // Ensure health doesn't go negative
    }
    /**
     * Gets the name of the monster.
     *
     * @return the name of the monster
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the strength of the monster.
     *
     * @return the strength of the monster
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Gets the craft (intelligence) of the monster.
     *
     * @return the craft of the monster
     */
    public int getCraft() {
        return craft;
    }

    /**
     * Reduces the monster's health by a specified amount. If the health
     * drops below zero, it is set to zero.
     *
     * @param amount the amount of health to reduce
     */
    public void reduceHealth(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }
}
