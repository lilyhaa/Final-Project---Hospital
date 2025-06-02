import java.util.ArrayList;

public class PatientFile{
    private String name;
    private ArrayList<Injury> injuries;


    public PatientFile(String name, ArrayList<Injury> injuries)
    {
        this.name = name;
        this.injuries = injuries;
    }
}
