//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class Safari extends CommandStack
{
    /**
     * outputs the string of the entire arraylist
     */
    public void commandStackStringOutput()
    {
        String tempToString, tempToShortString;
        tempToShortString = "Home->" + "Safari";
        tempToString = toString();
        for (int counter = 0; counter < commandArrayList.size(); counter++)
        {
            tempToShortString = tempToShortString + commandArrayList.get(counter).toShortString();
        }
        System.out.println(tempToShortString + "\n" + tempToString);
    }
}
