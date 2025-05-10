import org.example.Fight;
import org.example.Monster;
import org.example.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FightTest {

    @Test
    void testFightMonsterDefeated() {
        Player player = new Player("Hero", 10, 5, 2);
        Monster goblin = new Monster("Goblin", 2, 0, 5);
        Fight fight = new Fight(player, goblin);
        fight.execute();
        assertTrue(goblin.getHealth() == 0);  // Goblin's health should be 0 after the fight
    }

    @Test
    void testPlayerTakesDamageDuringFight() {
        Player player = new Player("Hero", 10, 5, 2);
        Monster spider = new Monster("Spider", 5, 2, 10);
        Fight fight = new Fight(player, spider);
        fight.execute();
        assertTrue(player.getHealth() < 10);  // Player's health should decrease after taking damage
    }

    @Test
    void testFightAgainstToughMonster() {
        Player player = new Player("Hero", 10, 5, 2);
        Monster toughMonster = new Monster("Ogre", 15, 10, 30); // Tougher monster with 30 health
        Fight fight = new Fight(player, toughMonster);
        fight.execute();
        assertTrue(toughMonster.getHealth() > 0 || player.getHealth() == 0);  // Either the monster survives or the player dies
    }

    @Test
    void testPlayerOneHitsMonster() {
        Player player = new Player("Hero", 100, 5, 10); // Overpowered strength
        Monster rat = new Monster("Rat", 1, 0, 10);
        Fight fight = new Fight(player, rat);
        fight.execute();
        assertTrue(rat.getHealth() == 0); // Rat should be defeated immediately
    }

    @Test
    void testWeakCombatants() {
        Player player = new Player("Weakling", 1, 1, 5);
        Monster fly = new Monster("Fly", 1, 0, 5);
        Fight fight = new Fight(player, fly);
        fight.execute();
        assertTrue(player.getHealth() == 0 || fly.getHealth() == 0); // Someone should lose
    }


    @Test
    void testFightWithDeadMonster() {
        Player player = new Player("Hero", 10, 5, 10);
        Monster zombie = new Monster("Zombie", 5, 1, 0); // Already dead
        Fight fight = new Fight(player, zombie);
        fight.execute();
        assertTrue(zombie.getHealth() == 0); // Health should remain 0
    }


}
