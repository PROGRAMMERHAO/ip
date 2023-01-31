package duke.command;

import java.io.FileNotFoundException;
import java.io.IOException;

import duke.TaskList;
import duke.exceptions.DirectoryNotFoundException;
import duke.exceptions.DukeException;
import duke.storage.Storage;
import duke.tasks.Task;
import duke.ui.Ui;


public class MarkUndoneCommand extends Command {

    protected int index;

    /**
     * Initialises the object
     *
     * @param index Index of the task in the list
     */
    public MarkUndoneCommand(int index) {
        this.index = index;
    }


    /**
     * Executes the current command
     *
     * @param tasks The task list
     * @param ui The ui object
     * @param storage The storage object
     */
    public String execute(TaskList tasks, Ui ui, Storage storage)throws FileNotFoundException,
            IllegalArgumentException, DukeException, DirectoryNotFoundException, IOException {
        Task marked = tasks.unmark(index);
        storage.write(tasks);
        return ui.unmark(marked);
    }

    /**
     * Checks if this is exit command
     */
    public boolean isExit() {
        return false;
    }

}
