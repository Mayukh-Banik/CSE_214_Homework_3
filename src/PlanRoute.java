//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class PlanRoute implements Command
{
    /**
     * checks if the stack is valid
     * @param stack stack to be validated
     * @return true or false of validity of stack
     */
    public boolean validCommand(CommandStack stack)
    {
        return true;
    }

    /**
     * special tostring of planroute
     * @return special string of plan routes data
     */
    public String toShortString()
    {
        return "->" + "P:" + source + "-" + destination;
    }

    /**
     * tostring representation of plan routes data
     * @return string of destination and source
     */
    public String toString()
    {
        return "Current Screen: Navigating from " + source + " to " + destination;
    }
    private String destination;
    private String source;

    /**
     * takes console input and edits destination and source
     * @param scanner reads the console input
     */
    public PlanRoute(Scanner scanner)
    {
        System.out.println("Please enter a source: ");
        source = scanner.nextLine();
        System.out.println("Please enter a destination: ");
        destination = scanner.nextLine();
    }

    /**
     * returns the destination
     * @return destination string
     */
    public String getDestination()
    {
        return destination;
    }

    /**
     * returns the source
     * @return source string
     */
    public String getSource()
    {
        return source;
    }
}