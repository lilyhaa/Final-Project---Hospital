/**
 * Superclass
 * @author Lily Ha
 * @version 2.0.0
 */
public class Injury {

    private String name;
    private double painLevel;
    private String location;
    private String painType;

    /**
     * Creates a record of a patient's injury.
     *
     * @param name the name of the injury
     * @param painLevel the level of pain the patient experiences from the injury
     * @param location the location on the body the patient is experiencing pain
     * @param painType the type of pain the patient is experiencing
     */
    public Injury(String name, double painLevel, String location, String painType)
    {
        this.name = name;
        this.painLevel = painLevel;
        this.location = location;
        this.painType = painType;
    }


    /**
     * Returns the string representation of the injury.
     * @return the string representation
     */
    public String toString()
    {
        return "Injury Report: " +  name + " at " + location + " with " + painType + " and " + painLevel + "/10 pain.";
    }
}
