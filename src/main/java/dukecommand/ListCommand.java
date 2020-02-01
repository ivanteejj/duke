package dukecommand;

import dukeexceptions.InvalidEntryException;
import dukelist.DukeList;
import dukestorage.DukeStorage;
import dukeui.DukeUI;

import java.util.ArrayList;


/**
 * Represents a command that will list out all current Tasks from DukeList
 */

public class ListCommand extends DukeCommand {
    ArrayList<String> toBePrinted;

    public ListCommand() {
    }

    /**
     * Prints out the current list of tasks from the DukeList
     *
     * @param dl DukeList from the main Duke program
     * @param ds DukeStorage from the main Duke program
     * @param dui DukeUI from the main Duke program
     * @throws InvalidEntryException
     */
    @Override
    public void execute(DukeList dl, DukeStorage ds, DukeUI dui) throws InvalidEntryException {
        this.toBePrinted = dl.getListForUI();

        if (toBePrinted.isEmpty()) {
            dui.printCustomMessage("    There are 0 tasks in your list.");

        } else {
            dui.printCustomMessage("    Here are the tasks in your list:");
            for (String curr : toBePrinted) {
                dui.printCustomMessage(curr);
            }
        }

    }

    @Override
    public boolean getIsExit() {
        return this.isExit;
    }
}
