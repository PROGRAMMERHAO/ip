package duke.command;


import java.io.FileNotFoundException;
import java.io.IOException;

import duke.TaskList;
import duke.exceptions.DirectoryNotFoundException;
import duke.exceptions.DukeException;
import duke.storage.Storage;
import duke.tasks.Task;
import duke.ui.Ui;


public class MarkDoneCommand extends Command {

    protected int index;

    /**
     * Initialises the object
     *
     * @param index Index of the task in the list
     */
    public MarkDoneCommand(int index) {
        this.index = index;
    }


    /**
     * Executes the current command
     *
     * @param tasks The task list
     * @param ui The ui object
     * @param storage The storage object
     */
    public void execute(TaskList tasks, Ui ui, Storage storage)throws FileNotFoundException,

            IllegalArgumentException, DukeException, DirectoryNotFoundException, IOException {
        Task marked = tasks.mark(index);
        ui.mark(marked);
        storage.write(tasks);
    }

    /**
     * Checks if this is exit command
     */
    public boolean isExit() {
        return false;
    }

}
