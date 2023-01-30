package duke.tasks;

public class Todo extends Task {

    protected String todo;

    /**
     * Constructor
     * @param description the string description of task
     */
    public Todo(String description) {
        super(description);
        this.todo = description;
    }
    /**
     * String representation of the task
     * @return string with task details
     */
    public String toString() {
        return "[T]" + "[" + super.getStatusIcon() + "] " + this.todo;
    }
    /**
     * Get the type of task
     * @return a string "todo"
     */
    public String getType() {
        return "T";
    }
    /**
     * Gets the type of task
     * @return a String representing event detail
     */
    public String getDetail() {
        return this.todo;
    }
}


