import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/**
 * BuiltinLoggerXML
 * 
 * This program demonstrates built-in Java logging using XML output.
 * It logs INFO, WARNING, and SEVERE messages to mylog.xml.
 * The program also generates multiple exceptions and records them
 * in the XML log file.
 * 
 * @author Ashley Otero
 */
public class BuiltinLoggerXML
{
    /**
     * Global logger object for this program.
     */
    private static final Logger LOGGER = Logger.getLogger(BuiltinLoggerXML.class.getName());

    /**
     * Main method for the program.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        FileHandler objFileHandler = null;

        try
        {
            objFileHandler = new FileHandler("mylog.xml");
            objFileHandler.setFormatter(new XMLFormatter());

            LOGGER.addHandler(objFileHandler);
            LOGGER.setUseParentHandlers(false);
            LOGGER.setLevel(Level.ALL);

            LOGGER.log(Level.INFO, "Program started.");
            LOGGER.log(Level.WARNING, "This is a warning message.");
            LOGGER.log(Level.INFO, "Preparing to generate exception messages.");

            DivideByZero();
            NullPointerExample();
            ArrayIndexExample();
            NumberFormatExample();

            LOGGER.log(Level.INFO, "Program finished.");
        }
        catch (IOException ex)
        {
            LOGGER.log(Level.SEVERE, "File handler could not be created.", ex);
        }
        finally
        {
            if (objFileHandler != null)
            {
                objFileHandler.close();
            }
        }
    }

    /**
     * Generates an ArithmeticException and logs it.
     */
    public static void DivideByZero()
    {
        try
        {
            int intNumber = 10;
            int intAnswer = intNumber / 0;
            System.out.println(intAnswer);
        }
        catch (ArithmeticException ex)
        {
            LOGGER.log(Level.SEVERE, "ArithmeticException occurred in DivideByZero.", ex);
        }
    }

    /**
     * Generates a NullPointerException and logs it.
     */
    public static void NullPointerExample()
    {
        try
        {
            String strName = null;
            System.out.println(strName.length());
        }
        catch (NullPointerException ex)
        {
            LOGGER.log(Level.SEVERE, "NullPointerException occurred in NullPointerExample.", ex);
        }
    }

    /**
     * Generates an ArrayIndexOutOfBoundsException and logs it.
     */
    public static void ArrayIndexExample()
    {
        try
        {
            int[] intNumbers = {1, 2, 3};
            System.out.println(intNumbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            LOGGER.log(Level.SEVERE, "ArrayIndexOutOfBoundsException occurred in ArrayIndexExample.", ex);
        }
    }

    /**
     * Generates a NumberFormatException and logs it.
     */
    public static void NumberFormatExample()
    {
        try
        {
            String strValue = "ABC";
            int intNumber = Integer.parseInt(strValue);
            System.out.println(intNumber);
        }
        catch (NumberFormatException ex)
        {
            LOGGER.log(Level.SEVERE, "NumberFormatException occurred in NumberFormatExample.", ex);
        }
    }
}