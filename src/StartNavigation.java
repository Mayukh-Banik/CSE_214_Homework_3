//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class StartNavigation implements Command
{
    /**
     * makes sure that there is something in the stack
     * @param stack the stack to be compared
     * @return the validity of the stack
     */
    public boolean validCommand(CommandStack stack)
    {

        return !stack.isEmpty() && !(stack.commandArrayList.get(stack.commandArrayList.size() - 1)
                instanceof StartNavigation);
    }

    /**
     * tostring of navigation
     * @return string of navigation
     */
    public String toString()
    {
        if (source == null)
        {
            return "Navigating to: Destination: " + destination;
        }
        else
        {
            return "Navigating from: Source: " + this.source + " to Destination: " + destination;
        }
    }

    /**
     * special to string of navigation
     * @return special string of navigation
     */
    public String toShortString()
    {
        if (source == null)
        {
            return "->N:" + destination;
        }
        else
        {
            return "->N:" + source + "-" + destination;
        }
    }

    /**
     * source and destination of navigation
     */
    private String source;
    private String destination;

    /**
     * checks if theres a plan route in the stack and makes navigates btw those two
     * @param commandStack the stack to be analyzed
     */
    public StartNavigation(CommandStack commandStack) throws InvalidCommandException, EmptyStackException
    {
        if (commandStack.isEmpty())
        {
            throw new EmptyStackException();
        }
        if (validCommand(commandStack))
        {
            for (int counter = commandStack.commandArrayList.size() - 1; counter >= 0; counter--)
            {
                if (commandStack.commandArrayList.get(counter) instanceof PlanRoute)
                {
                    source = ((PlanRoute) commandStack.commandArrayList.get(counter)).getSource();
                    destination = ((PlanRoute) commandStack.commandArrayList.get(counter)).getDestination();
                    return;
                }
                if (commandStack.commandArrayList.get(counter) instanceof FindPlace)
                {
                    destination = ((FindPlace) commandStack.commandArrayList.get(counter)).getDestination();
                    return;
                }
            }
        }
        else
        {
            throw new InvalidCommandException();
        }
    }
}