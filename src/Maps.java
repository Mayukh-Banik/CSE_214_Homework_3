//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class Maps extends CommandStack
{
    /**
     * outputs the string of the entire arraylist
     */
    public void commandStackStringOutput()
    {
        String tempToString, tempToShortString;
        tempToShortString = "Home->" + "Maps";
        tempToString = toString();
        for (int counter = 0; counter < commandArrayList.size(); counter++)
        {
            tempToShortString = tempToShortString + commandArrayList.get(counter).toShortString();
        }
        System.out.println(tempToShortString + "\n" + tempToString);
    }
}
