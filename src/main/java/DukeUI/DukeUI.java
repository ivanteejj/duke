package dukeui;

import dukeexceptions.DukeException;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a minial UI program that is used to interact with the user.
 * Prints messages as well as obtains input when necessary
 */

public class DukeUI {
    private String currMessage = "";
    private final Scanner IN;
    private final PrintStream OUT;
    private final String LOGO =
              "     ____         _        \n"
            + "    |  _ \\ _   _| | _____ \n"
            + "    | | | | | | | |/ / _ \\\n"
            + "    | |_| | |_| |   <  __/\n"
            + "    |____/ \\__,_|_|\\_\\___|\n";

    public DukeUI() {
        this(System.in, System.out);
    }

    public DukeUI(InputStream in, PrintStream out) {
        this.IN = new Scanner(in);
        this.OUT = out;
    }

    public void holdCurrentMessage(String customMessage) {
        currMessage += customMessage + "\n";
    }

    public String getCurrentMessage() {
        String temp = currMessage;
        currMessage = "";
        return temp;
    }

    /**
     * Returns the welcome message as a String
     *
     * @return String welcome message.
     */
    public String getWelcomeMessage() {
        this.holdCurrentMessage(LOGO);
        this.holdCurrentMessage("    Hello I'm Duke");
        this.holdCurrentMessage("    What can I do for you?");
        return this.getCurrentMessage();
    }

    /**
     * Prints out the error message from a DukeException.
     *
     * @param e DukeException
     */
    public String getErrorMessage(DukeException e) {
        return e.getMessage();
    }

    public void holdListOfTasks(ArrayList<String> inputList) {
        for (String curr : inputList) {
            this.holdCurrentMessage(curr);
        }
    }
}