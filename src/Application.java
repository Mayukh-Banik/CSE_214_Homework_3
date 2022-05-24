//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class Application
{
    protected CommandStack stack;

    /**
     * takes in the command
     * @param scanner reads the console input
     * @throws InvalidCommandException in case the command is invalid
     */
    private void readCommand(Scanner scanner) throws InvalidCommandException
    {
        stack.peek();
    }

    /**
     * makes the stack go back one
     * @throws EmptyStackException in case the stack is empty
     */
    private void goBack() throws EmptyStackException
    {
        stack.pop();
    }
}
