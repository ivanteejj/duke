package duketasks;

/**
 * Represents to-do object that the user has to complete. No deadline
 */

public class Todo extends Task {
    private static final String todoTaskCode = "T";

    public Todo(String taskName) {
        super(taskName, todoTaskCode);
    }

    public Todo(String taskName, String isDone) {
        this(taskName);
        if (isDone.equals("O")) {
            this.done();
        }
    }

    @Override
    public String toString() {
        return String.format("[%s]%s", this.taskCode, super.toString());
    }
}
