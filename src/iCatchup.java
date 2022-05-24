//Mayukh Banik 114489797 mayukh.banik@stonybrook.edu RO3 HW 3
import java.util.*;
public class iCatchup
{
    /**
     * maps is a class of Maps which contains the data structure, same for safari
     * the next 3 is a control for the number of commands
     */
    private static Maps maps = new Maps();
    private static Safari safari = new Safari();
    public static int numberOfCommandsMaps = 0;
    private static int numberOfCommandsSafari = 0;

    /**
     * cycles through the input commands for the correct stack to go to
     * @param args default
     * @throws EmptyStackException      in case the stack is empty
     * @throws IllegalArgumentException in case an illegal argument was put in
     * @throws InvalidCommandException  in case an invalid command was put in
     */
    public static void main(String[] args) throws EmptyStackException, InvalidCommandException
    {
        String inputString = "";
        while (!inputString.equalsIgnoreCase("Q"))
        {
            System.out.println(outputSelectionList()[0]);
            inputString = input().nextLine();
            inputString = allToUpperCase(inputString);
            for (; ; )
            {
                switch (inputString)
                {
                    case "S":
                        try
                        {
                            Safari();
                            break;
                        }
                        catch (InvalidCommandException | EmptyStackException exception)
                        {
                            System.out.println("There was either an invalid command or Empty Stack");
                        }
                    case "M":
                        try
                        {
                            Maps();
                            break;
                        }
                        catch (InvalidCommandException | EmptyStackException exception)
                        {
                            System.out.println("There was either an invalid command or Empty Stack");
                        }
                }
                break;
            }
        }
    }

    /**
     * output for various situations in the UI
     * @return an array of strings to be selected from to  print according to the situation
     */
    public static String[] outputSelectionList()
    {
        return new String[]{"Home:\n" + "S - Safari\n" + "M - Maps\n" + "Q - Quit",
                "Maps:\n" + "F - Find a place\n" + "P - Plan a route\n" + "N - Start Navigation\n",
                "Safari:\n" + "G - Google something\n" + "F - Go to a favorite/bookmark\n" + "L - Follow a link\n",
                "B - Back\n" + "S - Switch\n" + "H - Home"};
    }

    /**
     * scanner to work in multiple methods without redefining it
     * @return a scanner
     */
    public static Scanner input()
    {
        return new Scanner(System.in);
    }

    /**
     * legacy code to make everything uppercase for switches
     * @param string the letter to be made uppercase
     * @return the uppercase string
     */
    public static String allToUpperCase(String string)
    {
        return string.toUpperCase();
    }

    /**
     * contains the data structure that will be influenced if the person chooses maps
     * @throws InvalidCommandException wrong inputted command
     * @throws EmptyStackException     nothing is in the stack
     */
    public static void Maps() throws InvalidCommandException, EmptyStackException
    {
        for (; ; )
        {
            if (numberOfCommandsMaps != 0)
            {
                maps.commandStackStringOutput();
            }
            System.out.println(outputSelectionList()[1] + outputSelectionList()[3]);
            String inputString = input().nextLine();
            if (inputString.equalsIgnoreCase("F"))
            {
                maps.push(new FindPlace(input()));
                numberOfCommandsMaps++;
            }
            else if (inputString.equalsIgnoreCase("P"))
            {
                maps.push(new PlanRoute(input()));
                numberOfCommandsMaps++;
            }
            else if (inputString.equalsIgnoreCase("N"))
            {
                try
                {
                    if (numberOfCommandsMaps == 0)
                    {
                        System.out.println("There is no command in Maps to start navigating. ");
                    } else
                    {
                        maps.push(new StartNavigation(maps));
                        numberOfCommandsMaps++;
                    }
                }
                catch (InvalidCommandException | EmptyStackException exception)
                {
                    System.out.println("There was either an Invalid command or the Stack was empty");
                }
            }
            else if (inputString.equalsIgnoreCase("B"))
            {
                if (numberOfCommandsMaps == 0)
                {
                    break;
                }
                else
                {
                    maps.pop();
                    numberOfCommandsMaps--;
                }
            }
            else if (inputString.equalsIgnoreCase("S"))
            {
                Safari();
                return;
            }
            else if (inputString.equalsIgnoreCase("H"))
            {
                return;
            }
            else
            {
                System.out.println("Put in a correct input. ");
            }
        }
    }

    /**
     * contains the data structure that will be influenced if the person chooses maps
     * @throws InvalidCommandException wrong inputted command
     * @throws EmptyStackException     nothing is in the stack
     */
    public static void Safari() throws InvalidCommandException, EmptyStackException
    {
        for (; ; )
        {
            if (numberOfCommandsSafari != 0)
            {
                safari.commandStackStringOutput();
            }
            System.out.println(outputSelectionList()[2] + outputSelectionList()[3]);
            String inputString = input().nextLine();
            if (inputString.equalsIgnoreCase("G"))
            {
                safari.push(new GoogleSomething(input()));
                numberOfCommandsSafari++;
            }
            else if (inputString.equalsIgnoreCase("L"))
            {
                try
                {
                    if (numberOfCommandsSafari == 0)
                    {
                        throw new EmptyStackException();
                    }
                    else
                    {
                        safari.push(new FollowLink(input()));
                        numberOfCommandsSafari++;
                    }
                }
                catch (InvalidCommandException | EmptyStackException exception)
                {
                    System.out.println("There was either an Invalid command or the Stack was empty");
                }
            }
            else if (inputString.equalsIgnoreCase("F"))
            {
                safari.push(new GoToBookmark(input()));
                numberOfCommandsSafari++;
            }
            else if (inputString.equalsIgnoreCase("B"))
            {
                if (numberOfCommandsSafari == 0)
                {
                    break;
                }
                else
                {
                    safari.pop();
                    numberOfCommandsSafari--;
                }
            }
            else if (inputString.equalsIgnoreCase("S"))
            {
                Maps();
                return;
            }
            else if (inputString.equalsIgnoreCase("H"))
            {
                return;
            }
            else
            {
                System.out.println("Put in the a correct input. ");
            }
        }
    }
}