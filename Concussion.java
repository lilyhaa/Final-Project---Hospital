/**
 * A subclass of Injury that has an aspect of memory loss with a location in the head and a throbbing pain type
 * @author Lily Ha
 * @version 2.0.0
 */
public class Concussion extends Injury {

    private boolean memoryLoss;

    /**
     * Creates a record of a patient's concussion
     *
     * @param painLevel the amount of pain the patient feels from the injury
     * @param memoryLoss whether a person suffers from memory loss from their concussion or not
     */
    public Concussion(double painLevel, boolean memoryLoss)
    {
        super("Concussion", painLevel, "head", "a throbbing feeling");
        this.memoryLoss = memoryLoss;
    }

    /**
     * Returns the string representation of the concussion.
     * @return the string representation
     */
    @Override
    public String toString()
    {
        return super.toString() + " Memory Loss is " + memoryLoss + ".";
    }




}
