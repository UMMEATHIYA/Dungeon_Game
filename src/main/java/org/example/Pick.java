package org.example;

import javax.swing.*;

/**
 * The {@code Pick} class represents an action where the player picks up an item
 * from a chamber in the dungeon and adds it to their inventory.
 *
 * <p>This action removes the item from the chamber and notifies the player
 * that the item has been successfully collected.</p>
 *
 * Example usage:
 * <pre>
 *     Pick pickAction = new Pick(player, currentChamber, item);
 *     pickAction.execute();
 * </pre>
 *
 * @author
 */
public class Pick implements Action {

    /** The player performing the pick action. */
    private Player player;

    /** The chamber from which the item is being picked. */
    private Chamber chamber;

    /** The item to be picked up. */
    private Item item;

    /**
     * Constructs a {@code Pick} action with the specified player, chamber, and item.
     *
     * @param player  the player who will pick up the item
     * @param chamber the chamber containing the item
     * @param item    the item to be picked up
     */
    public Pick(Player player, Chamber chamber, Item item) {
        this.player = player;
        this.chamber = chamber;
        this.item = item;
    }

    /**
     * Executes the pick action by adding the item to the player's inventory
     * and removing it from the chamber.
     */
    @Override
    public void execute() {
        player.addItem(item);
        chamber.removeItem(item);
        System.out.println("You picked up: " + item);
    }

    /**
     * Returns a string representation of the action for display in the UI.
     *
     * @return a description of the pick action
     */
    @Override
    public String toString() {
        return "Pick up " + item.getName();
    }
}
