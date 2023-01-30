package duke.command;

import java.util.ArrayList;
import duke.TaskList;
import duke.storage.Storage;
import duke.ui.Ui;

public class FindCommand extends Command{

    String input;

    /**
     * Initialises the object
     * @param input The task user wants to find
     */
    public FindCommand(String input) {
        this.input = input;
    }

    /**
     * Executes the instruction
     * @param list The task list object
     * @param ui The ui object
     * @param storage The storage object
     */
    public void execute(TaskList list, Ui ui, Storage storage) {
        ArrayList<Integer> found = new ArrayList<>();
        for (Integer i = 0; i < list.getLength(); i++) {
            String cur = list.getTask(i).toString();
            if (cur.contains(input)) {
                found.add(i);
            }
        }
        ui.find(found, list);
    }

    /**
     * Tells if this is the exit command
     * @return
     */
    public boolean isExit() {
        return false;
    }
}
