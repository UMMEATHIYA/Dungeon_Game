/**
 * This class represents a dungeon in the game, including its chambers, doors, items, and the player's current state.
 * The dungeon is structured with multiple chambers that are connected through doors, and each chamber may contain items and monsters.
 * The player navigates through the dungeon by interacting with items, fighting monsters, and moving between chambers.
 *
 * <p>The dungeon setup includes methods for determining whether the player has reached the goal chamber, as well as retrieving the player's available actions based on the current state.</p>
 *
 * Example usage:
 * <pre>
 *     Dungeon dungeon = new Dungeon(player);
 *     List<Action> actions = dungeon.getActions(); // Get the list of actions the player can perform
 * </pre>
 */
package org.example;

import javax.swing.*;
import java.util.*;

/**
 * The Dungeon class represents the entire dungeon in the game, containing chambers, doors, monsters, and items.
 * It manages the player's progress and provides methods to interact with the dungeon's elements.
 */
public class Dungeon {
    private Chamber currentChamber;
    private Chamber goalChamber;
    private List<Chamber> chambers = new ArrayList<>();
    private Player player;

    /**
     * Initializes a new dungeon with a player and sets up the dungeon chambers, doors,
     * and items.
     *
     * @param player The player object representing the player in the game.
     */
    public Dungeon(Player player) {
        this.player = player;
        setupDungeon();
    }

    /**
     * Sets up the dungeon by creating and connecting chambers, doors, and items.
     * This method also assigns monsters to certain doors and initializes the player's
     * starting position.
     */
    private void setupDungeon() {
        // Create chambers
        Chamber start = new Chamber("Start");
        Chamber middle = new Chamber("Middle");
        Chamber goal = new Chamber("Goal");

        // Add doors (undirected)
        Door door1 = new Door(start, middle, new Monster("Goblin", 5, 0, 10)); // Strength-based
        Door door2 = new Door(middle, goal, new Monster("Spider", 0, 5, 10)); // Craft-based

        start.addDoor(door1);
        middle.addDoor(door1);
        middle.addDoor(door2);
        goal.addDoor(door2);

        // Add items to chambers
        start.addItem(new Sword("Short Sword", 3));
        middle.addItem(new Wand("Fire Wand", 4));

        chambers.add(start);
        chambers.add(middle);
        chambers.add(goal);

        this.currentChamber = start;
        this.goalChamber = goal;
    }

    /**
     * Checks if the player has reached the goal chamber.
     *
     * @return True if the player is in the goal chamber, false otherwise.
     */
    public boolean isFinished() {
        return currentChamber.getName().equals("Goal");
    }

    /**
     * Returns the current chamber the player is in.
     *
     * @return The current Chamber object.
     */
    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    /**
     * Sets the current chamber the player is in.
     *
     * @param chamber The new Chamber object representing the player's location.
     */
    public void setCurrentChamber(Chamber chamber) {
        this.currentChamber = chamber;
    }

    /**
     * Returns the player object representing the player in the game.
     *
     * @return The Player object.
     */
    public Character getPlayer() {
        return player;
    }

    /**
     * Returns a list of available actions the player can perform in the current chamber.
     * This includes actions like picking up items, moving through doors, and fighting monsters.
     *
     * @return A list of Action objects representing the possible actions.
     */
    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>();

        // Add item pickup actions
        for (Item item : currentChamber.getItems()) {
            actions.add(new Pick(player, currentChamber, item));
        }

        // Add door movement actions
        for (Door door : currentChamber.getDoors()) {
            if (door.hasMonster()) {
                actions.add(new Fight(player, door.getMonster()));
            } else {
                actions.add(new Move(this, door.getOtherChamber(currentChamber)));
            }
        }

        return actions;
    }
}
