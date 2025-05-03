package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Player} class represents the player's character in the dungeon game.
 * It extends the {@link Character} class and includes an inventory system for managing items.
 *
 * <p>Players can collect, remove, and view items throughout the dungeon. These items may
 * provide bonuses to strength or craft attributes and are used strategically during gameplay.</p>
 *
 * Example usage:
 * <pre>
 *     Player player = new Player("Athiya", 5, 3, 100);
 *     player.addItem(new Sword("Iron Sword", 2));
 * </pre>
 *
 * @author
 */
public class Player extends Character {

    /** The list of items collected by the player. */
    private List<Item> inventory;

    /**
     * Constructs a {@code Player} with the specified name, strength, craft, and health values.
     *
     * @param name the player's name
     * @param strength the player's strength attribute
     * @param craft the player's craft attribute
     * @param health the player's initial health
     */
    public Player(String name, int strength, int craft, int health) {
        super(name, strength, craft, health);
        this.inventory = new ArrayList<>();
    }

    /**
     * Adds an item to the player's inventory.
     *
     * @param item the item to add
     */
    public void addItem(Item item) {
        inventory.add(item);
    }

    /**
     * Removes an item from the player's inventory.
     *
     * @param item the item to remove
     */
    public void removeItem(Item item) {
        inventory.remove(item);
    }

    /**
     * Returns the list of items currently in the player's inventory.
     *
     * @return a list of inventory items
     */
    public List<Item> getInventory() {
        return inventory;
    }

    /**
     * Returns a string representation of the player, including their name and current health.
     *
     * @return a string describing the player
     */
    @Override
    public String toString() {
        return "Player: " + getName() + ", Health: " + getHealth();
    }

    /**
     * Picks up the specified item and adds it to the inventory.
     * This method can be used to integrate with item-picking actions.
     *
     * @param item the item to pick up
     */
    public void pickUpItem(Item item) {
        inventory.add(item);
    }
}
