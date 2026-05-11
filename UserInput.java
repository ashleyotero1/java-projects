import java.util.Scanner;

/**
 * This class is used to get input from the user.
 * It asks a question and returns what the user types.
 */
public class UserInput
{
    private Scanner sc = new Scanner(System.in);

    /**
     * This method shows a prompt and reads what the user enters.
     */
    public String ReadStringFromUser(String prompt)
    {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
