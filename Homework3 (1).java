
public class Homework3
{
    public static void main(String[] args)
    {
        // --------------------------------------------------------------------------------
        // Problem 1: Age in seconds
        // --------------------------------------------------------------------------------
        int ageYears = 20;   // <-- change 20 to your actual age
        int secondsPerDay = 24 * 60 * 60;
        int daysAlive = ageYears * 365;
        int ageInSeconds = daysAlive * secondsPerDay;
        System.out.println("Age in seconds: " + ageInSeconds);

        // --------------------------------------------------------------------------------
        // Problem 2: Volume of Sun, Earth, and ratio
        // --------------------------------------------------------------------------------
        float radiusSun = 865000f / 2;
        float radiusEarth = 7600f / 2;
        float volumeSun = (float)( (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3) );
        float volumeEarth = (float)( (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3) );
        float ratio = volumeSun / volumeEarth;
        System.out.println("Volume of Sun: " + volumeSun);
        System.out.println("Volume of Earth: " + volumeEarth);
        System.out.println("Ratio Sun/Earth: " + ratio);

        // --------------------------------------------------------------------------------
        // Problem 3: Molecules in 2.45 quarts of water
        // --------------------------------------------------------------------------------
        float gramsPerQuart = 950f;
        float totalMass = 2.45f * gramsPerQuart;
        float massPerMolecule = 3.0e-23f;
        float numMolecules = totalMass / massPerMolecule;
        System.out.println("Molecules in 2.45 quarts of water: " + numMolecules);
    }
}

