public class Bruise extends Injury{


    private String color;
    public Bruise(String location, String color)
    {
        super("Bruise", 4, location, "soreness");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String toString()
    {
        return super.toString() + " The color of the bruise is " + color + ".";
    }
}
