package org.example;

/**
 * This interface represents an action that can be performed in the game.
 * Each action will implement this interface and define its own behavior for
 * the `execute()` method.
 */
public interface Action {

    /**
     * Executes the action.
     * This method will contain the logic
     * for what happens when the action is performed.
     */
    void execute();
}
