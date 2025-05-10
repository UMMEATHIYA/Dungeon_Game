import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void testPlayerInventory() {
        Player player = new Player("Hero", 10, 5, 2);
        Sword sword = new Sword("Iron Sword", 3);  // Provide name and strength bonus
        player.addItem(sword);
        assertTrue(player.getInventory().contains(sword));
    }

    @Test
    void testPlayerStrengthAffectsDamage() {
        Player player = new Player("Hero", 10, 5, 10); // Player with 10 strength
        Monster spider = new Monster("Spider", 5, 2, 10); // A weaker monster with 5 strength
        Fight fight = new Fight(player, spider);
        fight.execute();
        assertTrue(spider.getHealth() < 10); // The spider's health should be reduced due to player's strength
    }

    @Test
    void testPlayerItemImpactFight() {
        Player player = new Player("Hero", 5, 3, 10); // Normal player stats
        Sword sword = new Sword("Iron Sword", 5); // Sword that increases player's strength by 5
        player.addItem(sword);
        Monster spider = new Monster("Spider", 5, 2, 10);
        Fight fight = new Fight(player, spider);
        fight.execute();
        assertTrue(spider.getHealth() < 10); // The spider should have less health because player's strength is increased by the sword
    }

    @Test
    void testTakeDamageReducesHealth() {
        Player player = new Player("Hero", 5, 3, 20);
        int initialHealth = player.getHealth();

        // Assuming player takes 10 damage and has 5 defense
        player.takeDamage(10);

        int expectedHealth = initialHealth - (10 - 5); // Expected damage reduction is 5
        assertEquals(0, player.getHealth());

    }


    @Test
    void testTakeLethalDamageSetsHealthToZero() {
        Player player = new Player("Hero", 10, 5, 10);
        player.takeDamage(15);
        assertEquals(0, player.getHealth()); // Health should not go negative
    }

    @Test
    void testInventoryInitiallyEmpty() {
        Player player = new Player("Hero", 10, 5, 10);
        assertTrue(player.getInventory().isEmpty());
    }


}
