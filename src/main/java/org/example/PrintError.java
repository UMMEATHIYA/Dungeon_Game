package org.example;

/**
 * The {@code PrintError} class represents an action that handles errors during user interaction.
 * It implements the {@link Action} interface and is used to gracefully display error messages
 * without terminating the game.
 *
 * <p>This class is typically invoked when user input is invalid or an exception occurs
 * during action selection in the dungeon game.</p>
 *
 * Example usage:
 * <pre>
 *     Action errorAction = new PrintError(dungeon, new IllegalArgumentException("Invalid choice"));
 *     errorAction.execute();
 * </pre>
 *
 * @author
 */
public class PrintError implements Action {

    /** The dungeon in which the error occurred. */
    private Dungeon dungeon;

    /** The exception that triggered the error action. */
    private Exception exception;

    /**
     * Constructs a {@code PrintError} action with the specified dungeon and exception.
     *
     * @param dungeon the current dungeon instance
     * @param exception the exception that occurred
     */
    public PrintError(final Dungeon dungeon, final Exception exception) {
        this.dungeon = dungeon;
        this.exception = exception;
    }

    /**
     * Executes the error action by printing the error message to the console.
     */
    @Override
    public void execute() {
        System.out.println("Error: " + exception.getMessage());
    }

    /**
     * Returns a string representation of the
     * error action for display in the UI.
     *
     * @return a user-friendly error message
     */
    @Override
    public String toString() {
        return "Invalid input. Please try again.";
    }
}
