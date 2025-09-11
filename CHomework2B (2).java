
public class CHomework2B
{
    public static void main(String[] args)
    {
        // SHORT
        short shtMinimum = Short.MIN_VALUE;
        short shtMaximum = Short.MAX_VALUE;
        System.out.println("Short Data Type");
        System.out.println("Minimum: " + shtMinimum);
        System.out.println("Maximum: " + shtMaximum);

        // Confirm overflow
        System.out.println("Confirmation:");
        System.out.println("Minimum - 1 = " + (short)(shtMinimum - 1));
        System.out.println("Maximum + 1 = " + (short)(shtMaximum + 1));
        System.out.println();

        // INTEGER
        int intMinimum = Integer.MIN_VALUE;
        int intMaximum = Integer.MAX_VALUE;
        System.out.println("Integer Data Type");
        System.out.println("Minimum: " + intMinimum);
        System.out.println("Maximum: " + intMaximum);

        // Confirm overflow
        System.out.println("Confirmation:");
        System.out.println("Minimum - 1 = " + (intMinimum - 1));
        System.out.println("Maximum + 1 = " + (intMaximum + 1));
        System.out.println();

        // LONG
        long lngMinimum = Long.MIN_VALUE;
        long lngMaximum = Long.MAX_VALUE;
        System.out.println("Long Data Type");
        System.out.println("Minimum: " + lngMinimum);
        System.out.println("Maximum: " + lngMaximum);

        // Confirm overflow
        System.out.println("Confirmation:");
        System.out.println("Minimum - 1 = " + (lngMinimum - 1));
        System.out.println("Maximum + 1 = " + (lngMaximum + 1));
        System.out.println();

        // FLOAT
        float fltMinimum = -Float.MAX_VALUE;   // smallest (most negative) finite
        float fltMaximum =  Float.MAX_VALUE;   // largest positive finite
        System.out.println("Float Data Type");
        System.out.println("Minimum: " + fltMinimum);
        System.out.println("Maximum: " + fltMaximum);

        // “Overflow/underflow style” confirmations for float
        System.out.println("Confirmation:");
        System.out.println("Minimum / 10 = " + (fltMinimum / 10));
        System.out.println("Maximum * 10 = " + (fltMaximum * 10));
    }
}
