/**
 * A subclass of Injury that has an aspect of color and a pain level of 4/10
 * @author Lily Ha
 * @version 2.0.0
 */
public class Bruise extends Injury{


    private String color;

    /**
     * Creates a record of a patient's bruise.
     * @param location the location of the bruise on the body
     * @param color the color of the bruise
     */
    public Bruise(String location, String color)
    {
        super("Bruise", 4, location, "soreness");
        this.color = color;
    }

    /**
     * Returns the string representation of the bruise.
     * @return the string representation
     */
    @Override
    public String toString()
    {
        return super.toString() + " The color of the bruise is " + color + ".";
    }
}
