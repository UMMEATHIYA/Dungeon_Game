import org.example.Fight;
import org.example.Monster;
import org.example.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonsterTest {
    @Test
    void testFightAgainstToughMonster() {
        Player player = new Player("Hero", 10, 5, 2); // Player with 10 strength, 5 craft, 2 health
        Monster toughMonster = new Monster("Ogre", 15, 10, 50); // Stronger monster with more health and strength
        Fight fight = new Fight(player, toughMonster);
        fight.execute();
        assertTrue(toughMonster.getHealth() > 0 || !player.isAlive()); // Fight ends when either the player is dead or the monster is defeated
    }

    @Test
    void testMonsterConstructorAndGetters() {
        Monster dragon = new Monster("Dragon", 12, 8, 100);
        assertEquals("Dragon", dragon.getName());
        assertEquals(12, dragon.getStrength());
        assertEquals(8, dragon.getCraft());
        assertEquals(100, dragon.getHealth());
    }

    @Test
    void testTakeDamage() {
        Monster orc = new Monster("Orc", 10, 3, 30);
        orc.takeDamage(10);
        assertEquals(20, orc.getHealth());
    }

    @Test
    void testTakeLethalDamageSetsHealthToZero() {
        Monster slime = new Monster("Slime", 1, 1, 5);
        slime.takeDamage(10);
        assertEquals(0, slime.getHealth()); // Should not go below 0
    }

    @Test
    void testReduceHealthMethod() {
        Monster bat = new Monster("Bat", 2, 1, 10);
        bat.reduceHealth(3);
        assertEquals(7, bat.getHealth());
    }

    @Test
    void testReduceHealthBelowZero() {
        Monster imp = new Monster("Imp", 4, 2, 4);
        imp.reduceHealth(10);
        assertEquals(0, imp.getHealth()); // Again, ensure no negative health
    }
}
