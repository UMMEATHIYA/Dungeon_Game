import org.example.Dungeon;
import org.example.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DungeonTest {

    @Test
    void testPlayerStartsAtStartChamber() {
        Player player = new Player("Hero", 10, 5, 2);
        Dungeon dungeon = new Dungeon(player);
        assertEquals("Start", dungeon.getCurrentChamber().getName());
    }

    @Test
    void testAvailableActionsAreGenerated() {
        Player player = new Player("Hero", 10, 5, 2);
        Dungeon dungeon = new Dungeon(player);
        assertFalse(dungeon.getActions().isEmpty());
    }

    @Test
    void testDungeonIsNotFinishedInitially() {
        Player player = new Player("Hero", 10, 5, 2);
        Dungeon dungeon = new Dungeon(player);
        assertFalse(dungeon.isFinished());
    }
}
