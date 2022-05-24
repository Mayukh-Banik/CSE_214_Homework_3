//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class FindPlace implements Command
{
    private String destination;

    /**
     * takes in console input and replaces destination
     * @param scanner scanner to read console input
     */
    public FindPlace(Scanner scanner)
    {
        System.out.println("What is the place you would like to find: ");
        destination = scanner.nextLine();
    }

    /**
     * makes sure the stack is valid
     * @param stack data structure to be analyzed
     * @return true since it will always be valid
     */
    public boolean validCommand(CommandStack stack)
    {
        return true;
    }

    /**
     * to string representation of find place
     * @return string of find place
     */
    public String toString()
    {
        return "Current Screen: Showing results for " + getDestination();
    }

    /**
     * special to string representation of find place
     * @return special string of find place
     */
    public String toShortString()
    {
        return "->F:" + destination;
    }

    /**
     * returns destiantion
     * @return string of destination
     */
    public String getDestination()
    {
        return destination;
    }
}
