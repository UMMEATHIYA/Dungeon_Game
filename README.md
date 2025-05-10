# 🛡️ Java Dungeon RPG: Item System

This project is a simplified **item system** for a text-based dungeon role-playing game (RPG), written in **Java** using object-oriented principles. It allows the creation and management of various equippable items (e.g., **Swords**, **Shields**, and **Wands**) that enhance a character’s combat capabilities through **strength** and **craft** bonuses.

This codebase is designed for **academic purposes** (e.g., SOEN 350 OOP labs), but can also be a foundation for larger RPG games.

---

## 📂 Project Structure

```text
src/
└── main/
    └── java/
        └── org/
            └── example/
                ├── Item.java        # Abstract base class for all items
                ├── Sword.java       # Increases strength
                ├── Shield.java      # Increases strength and optionally craft
                ├── Wand.java        # Increases craft
                ├── Player.java      # Represents a player who can equip items
                └── GameTest.java    # Example main class to demonstrate functionality

```
#💡 Key Concepts
✅ Object-Oriented Principles Used
Abstraction: Item is an abstract base class.

Inheritance: Sword, Shield, and Wand inherit from Item.

Encapsulation: Attributes like strength and craft bonuses are protected and accessed via methods.

Polymorphism: Items are treated polymorphically when used in a player’s inventory.

⚔️ Item System Overview
1. Item.java (Abstract Class)
Defines the common interface for all items:

name: name of the item.

strengthBonus: how much it improves strength.

craftBonus: how much it improves craft/intelligence.

toString(): returns item info like "Iron Shield (STR: +3, CRFT: +2)".

2. Sword.java
Increases only strength.

Used by physical classes like Warriors.


Sword sword = new Sword("Excalibur", 5);
3. Shield.java
Can increase both strength and craft.

Useful for tank or balanced characters.

Shield shield = new Shield("Iron Shield", 3, 2);
4. Wand.java
Increases only craft.

Ideal for magical classes like Wizards.


Wand wand = new Wand("Arcane Wand", 4);
👤 Player System
Player.java
Represents a player that:

Has base strength and craft.

Can equip multiple items in an inventory.

Automatically computes effective stats from equipped items.

Example

Player player = new Player("Warrior", 10, 5);
player.addItem(new Sword("Excalibur", 5));
player.addItem(new Shield("Iron Shield", 3, 2));
System.out.println(player); // Warrior (Strength: 18, Craft: 7)
▶️ Getting Started
✅ Requirements
Java 11 or higher

Maven (optional, not strictly needed unless you modularize further)

🔧 Setup Instructions
Clone the repository:


git clone https://github.com/your-username/java-dungeon-items.git
cd java-dungeon-items
Compile and run the test demo:


javac src/main/java/org/example/*.java
java -cp src/main/java org.example.GameTest
📌 Example Output

Warrior (Strength: 18, Craft: 11)
Explanation:

Base Strength: 10 → +5 (Sword) +3 (Shield)

Base Craft: 5 → +2 (Shield) +4 (Wand)

🔍 How to Extend
Add a New Item Type
To add a new item type (e.g., Axe):

Extend the Item class.

Define relevant bonuses.

Implement a constructor.


public class Axe extends Item {
    public Axe(String name, int strengthBonus) {
        super(name, strengthBonus, 0);
    }
}
Add Inventory Limits, Equip Slots, or Effects
Extend the Player class with:

Equip slots (main hand, off hand)

Max inventory size

Item usage effects (e.g., healing, poison)

🧪 Sample Unit Test (Optional)

@Test
public void testSwordBonus() {
    Sword sword = new Sword("Test Sword", 5);
    assertEquals("Test Sword", sword.getName());
    assertEquals(5, sword.getStrength());
    assertEquals(0, sword.getCraft());
}
📘 Documentation
Each class contains full Javadoc documentation.

Run javadoc to generate HTML docs:


javadoc -d docs src/main/java/org/example/*.java
👨‍💻 Author
Developed by Umme Athiya

Course: SOEN 350 – Object-Oriented Programming

Spring 2025, DePaul University

