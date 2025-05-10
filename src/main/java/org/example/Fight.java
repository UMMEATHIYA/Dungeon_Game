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
     * <p>This method contains basic battle logic where the player and the monster take turns
     * attacking each other. The player's strength and craft, along with the monster's strength,
     * are used to determine damage.</p>
     */
    @Override
    public void execute() {
        System.out.println("You have encountered " + monster.getName() + "!");

        int playerDamage = player.getStrength();
        int rawMonsterDamage = monster.getStrength();
        int reducedMonsterDamage = Math.max(0, rawMonsterDamage - player.getEffectiveCraft());

        // Exit early if no damage can be done
        if (playerDamage == 0 && reducedMonsterDamage == 0) {
            System.out.println("Neither the player nor the monster can deal damage. The fight ends in a draw.");
            return;
        }

        System.out.println("Calculated player damage: " + playerDamage);
        System.out.println("Calculated reduced monster damage: " + reducedMonsterDamage);


        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            // Player attacks
            monster.takeDamage(playerDamage);
            System.out.println("You dealt " + playerDamage + " damage to the " + monster.getName());
            System.out.println(monster.getName() + " has " + monster.getHealth() + " health left.");

            if (monster.getHealth() <= 0) {
                System.out.println("You defeated the " + monster.getName() + "!");
                break;
            }

            // Monster attacks
            player.takeDamage(reducedMonsterDamage);
            System.out.println(monster.getName() + " dealt " + reducedMonsterDamage + " damage to you.");
            System.out.println("You have " + player.getHealth() + " health left.");

            if (player.getHealth() <= 0) {
                System.out.println("You have been defeated by the " + monster.getName() + "!");
                break;
            }
        }
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