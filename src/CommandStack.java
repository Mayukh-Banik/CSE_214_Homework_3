//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class CommandStack
{
    public ArrayList<Command> commandArrayList;

    /**
     * adds a command to the data structure
     * @param command the input to the structure
     */
    public void push(Command command)
    {
        commandArrayList.add(command);
    }

    /**
     * removes the most recent data entry
     * @return command of what was removed
     * @throws EmptyStackException in case stack was empty
     */
    public Command pop() throws EmptyStackException
    {
        if (commandArrayList.size() == 0)
        {
            throw new EmptyStackException();
        }
        Command command = commandArrayList.get(commandArrayList.size() - 1);
        commandArrayList.remove(commandArrayList.size() - 1);
        return command;
    }

    /**
     * returns the command version of the most recent data inputted
     * @return the command most recenetly inputted
     */
    public Command peek()
    {
        return commandArrayList.get(commandArrayList.size() - 1);
    }

    /**
     * checks if the stack is empty
     * @return if its empty or not
     */
    public boolean isEmpty()
    {
        return commandArrayList.size() == 0;
    }

    /**
     * returns string of command on the screen
     * @return string of what's on the screen
     */
    public String getScreenCommand()
    {
        return commandArrayList.get(commandArrayList.size() - 1).toString();
    }

    /**
     * tostring of the command stack
     * @return string of command stack
     */
    public String toString()
    {
        return commandArrayList.get(commandArrayList.size() - 1).toString();
    }

    /**
     * initiliazes the arraylist
     */
    public CommandStack()
    {
        commandArrayList = new ArrayList<>();
    }
}
