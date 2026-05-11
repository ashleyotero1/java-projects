import java.io.*;

/**
 * This class handles everything with the text file.
 * It can create the file, write to it, and read from it.
 */
public class NotesFile
{
    private File file;

    /**
     * Sets up the file using the directory and file name.
     */
    public NotesFile(String directory, String fileName)
    {
        file = new File(directory + "\\" + fileName);
    }

    /**
     * Checks if the file already exists.
     */
    public boolean fileExists()
    {
        return file.exists();
    }

    /**
     * Creates the file if it doesn't already exist.
     */
    public void createFile() throws IOException
    {
        file.getParentFile().mkdirs();
        file.createNewFile();
    }

    /**
     * Adds a line of text to the file.
     */
    public void writeToFile(String text) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.write(text);
        bw.newLine();
        bw.close();
    }

    /**
     * Prints everything inside the file to the screen.
     */
    public void readFile() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        System.out.println("\n--- File Contents ---");

        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }

        br.close();
    }
}