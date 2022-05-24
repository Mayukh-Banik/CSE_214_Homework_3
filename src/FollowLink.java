//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class FollowLink implements Command
{
    /**
     * checks if the command stack is valid
     * @param stack data structure to be checked
     * @return true since it always works
     */
    public boolean validCommand(CommandStack stack)
    {
        return true;
    }

    /**
     * tostring representation of followlink
     * @return string of followlink
     */
    public String toString()
    {
        return "Current Screen: " + link;
    }

    /**
     * special tostring representation of followlink
     * @return special string of followlink
     */
    public String toShortString()
    {
        return "->" + "L:" + link;
    }
    private String link;

    /**
     * edits link from console input
     * @param scanner what takes in the console input
     */
    public FollowLink(Scanner scanner) throws EmptyStackException, InvalidCommandException
    {
        System.out.println("Enter the link you want to go to: ");
        link = scanner.nextLine();
    }
}
