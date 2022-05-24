//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
public interface Command
{
    /**
     * valid command
     * @param stack stack to check if its valid
     * @return boolean on whether true or false
     */
    boolean validCommand(CommandStack stack);

    /**
     * to string of the data
     * @return string
     */
    String toString();

    /**
     * special tostring of data
     * @return special string
     */
    String toShortString();
}
