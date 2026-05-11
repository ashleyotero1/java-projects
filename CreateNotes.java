import java.io.IOException;

/**
 * This is the main class that runs the program.
 * It connects user input and file actions together.
 */
public class CreateNotes
{
    public static void main(String[] args)
    {
        UserInput input = new UserInput();

        try
        {
            String directory = input.ReadStringFromUser("Enter directory name: ");
            String fileName = input.ReadStringFromUser("Enter file name (.txt): ");

            NotesFile notes = new NotesFile(directory, fileName);

            if (notes.fileExists())
            {
                System.out.println("File already exists.");
            }
            else
            {
                notes.createFile();
                System.out.println("File created.");
            }

            System.out.println("\nEnter text (press Enter twice to finish):");

            while (true)
            {
                String text = input.ReadStringFromUser("> ");

                if (text.equals(""))   // super simple check
                {
                    break;
                }

                notes.writeToFile(text);
            }

            notes.readFile();
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong.");
        }
    }
}