package org.example;

/**
 * The Fight class represents an action where the player engages in combat with a monster.
 * It contains the necessary logic to execute a battle between the player and a monster.
 * The result of the fight will depend on the player's strength, craft, and the monster's stats.
 *
 * <p>This class can be extended to include specific battle mechanics such as turn-based attacks,
 * health reduction, and victory conditions.</p>
 *
 * Example usage:
 * <pre>
 *     Fight fightAction = new Fight(player, monster);
 *     fightAction.execute(); // Executes the battle between the player and monster
 * </pre>
 *
 * @author
 */
public class Fight implements Action {
    private Player player;
    private Monster monster;

    /**
     * Constructs a Fight action with the specified player and monster.
     *
     * @param player the player character involved in the fight
     * @param monster the monster that the player will fight
     */
    public Fight(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Executes the fight action, where the player and the monster engage in battle.
     * The implementation of the battle logic will depend on the specific mechanics
     * defined for the combat.
     *
     * <p>This method currently contains a placeholder for the actual battle logic,
     * which can be implemented as needed (e.g., comparing strength, health, and craft).</p>
     */
    @Override
    public void execute() {
        // battle logic
    }

    /**
     * Returns a string representation of the fight action.
     *
     * @return a description of the action (i.e., fighting a monster)
     */
    @Override
    public String toString() {
        return "Fight " + monster.getName();
    }
}
