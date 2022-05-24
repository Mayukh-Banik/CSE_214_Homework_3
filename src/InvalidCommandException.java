//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
public class InvalidCommandException extends Exception
{
    /**
     * in case a command is invalid
     */
    InvalidCommandException()
    {
        System.out.println("Invalid Command.");
    }

    /**
     * exception in case an invalid command
     * @param string string to be outputeed
     */
    InvalidCommandException(String string)
    {
        super(string);
    }
}
