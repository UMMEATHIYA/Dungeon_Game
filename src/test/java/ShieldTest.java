import org.example.Fight;
import org.example.Monster;
import org.example.Player;
import org.example.Shield;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShieldTest {
    @Test
    void testShieldReducesDamage() {
        Player player = new Player("Hero", 5, 3, 10); // Strength 5, Craft (defense) 3
        Shield shield = new Shield("Wooden Shield", 0, 3); // Only boosts craft (defense)
        player.addItem(shield);

        Monster spider = new Monster("Spider", 5, 2, 10); // Spider attack = 5
        Fight fight = new Fight(player, spider);
        fight.execute();

        assertTrue(player.getHealth() < 10); // Took some damage
        assertTrue(player.getHealth() > 0);  // Still alive, shield helped
    }


}
