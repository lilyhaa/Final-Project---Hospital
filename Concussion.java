public class Concussion extends Injury {

    private boolean memoryLoss;

    public Concussion(double painLevel, boolean memoryLoss)
    {
        super("Concussion", painLevel, "head", "a throbbing feeling");
        this.memoryLoss = memoryLoss;
    }

    public boolean hasMemoryLoss()
    {
        return memoryLoss;
    }

    public void setMemoryLoss(boolean memoryLoss)
    {
        this.memoryLoss = memoryLoss;
    }

    public String toString()
    {
        return super.toString() + " Memory Loss is " + memoryLoss + ".";
    }




}
