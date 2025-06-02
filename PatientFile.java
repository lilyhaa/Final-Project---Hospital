/**
 * The hospital file of the patient.
 * @author Lily Ha
 * @version 2.0.0
 */
import java.util.ArrayList;

public class PatientFile{
    private String name;
    private ArrayList<Injury> injuries;

    /**
     * Creates a file of the patient for the hospital to identify the patient.
     * @param name the name of the patient
     * @param injuries the list of injuries the patient has on record
     */
    public PatientFile(String name, ArrayList<Injury> injuries)
    {
        this.name = name;
        this.injuries = injuries;
    }
}
