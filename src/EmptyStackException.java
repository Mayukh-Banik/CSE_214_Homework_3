//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
public class EmptyStackException extends Exception
{
    /**
     * exception for an empty stack
     */
    public EmptyStackException()
    {
        System.out.println("Empty Stack");
    }

    /**
     * exception for an empty stack
     * @param string to be outputted
     */
    public EmptyStackException(String string)
    {
        super(string);
    }
}
