//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class GoogleSomething implements Command
{
    /**
     * checks if the command stack is valid
     * @param stack the stack to be checked
     * @return true since all exceptions caught in main
     */
    public boolean validCommand(CommandStack stack)
    {
        return true;
    }

    /**
     * tostring of this method
     * @return string representation
     */
    public String toString()
    {
        return "Current Screen: Google: " + query;
    }

    /**
     * special tostring method for this assignment
     * @return special tostring
     */
    public String toShortString()
    {
        return "->G:" + query;
    }

    /**
     * the inpuuted line
     */
    private String query;

    /**
     * takes the input of the written thing in the console
     * @param scanner scanner type to take in the lines
     */
    public GoogleSomething(Scanner scanner)
    {
        System.out.println("Enter what you would like to Google: ");
        query = scanner.nextLine();
    }
}
