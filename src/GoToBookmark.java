//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class GoToBookmark implements Command
{
    /**
     * checks if stack is valid
     * @param stack stack to be cheked
     * @return true since its always valid
     */
    public boolean validCommand(CommandStack stack)
    {
        return true;
    }

    /**
     * tostring of valid command
     * @return string of valid command
     */
    public String toString()
    {
        return "Current Screen: Showing results for " + bookmark;
    }

    /**
     * tostring of valid command
     * @return string of valid command
     */
    public String toShortString()
    {
        return "->" + "F:" + bookmark;
    }
    private String bookmark;

    /**
     * reads console input for setting bookmark
     * @param scanner scanner to read console input
     */
    public GoToBookmark(Scanner scanner)
    {
        System.out.println("Enter the bookmark: ");
        bookmark = scanner.nextLine();
    }
}
