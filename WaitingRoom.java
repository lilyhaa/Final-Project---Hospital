/**
 * The waiting room to receive treatment, it can give the patient a report on where they are in the queue.
 * @author Lily Ha
 * @version 2.0.0
 */
import java.util.ArrayList;
public class WaitingRoom {

    //The seats in the waiting room where the top left seat is first to receive treatment while the bottom right is last.
    private PatientFile[][] seats;

    /**
     * Creates a waiting room in the hospital.
     */
    public WaitingRoom()
    {
        seats = new PatientFile[3][3];
        Injury flu = new Injury("flu", 7, "nose", "stuffiness");
        ArrayList<Injury> common = new ArrayList<>();
        common.add(flu);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                PatientFile otherPatient = new PatientFile("anonymous", common);
                seats[i][j] = otherPatient;
            }
        }
    }

    /**
     * Returns a string representation of the patient's place in queue to receive treatment.
     *
     * @param VIP the file of the patient (their name and their list of injuries)
     * @param wait whether the patient was willing to wait or not to receive treatment
     * @return the string representation of the patient's place in queue
     */
    public String getPlaceInQueue(PatientFile VIP, boolean wait)
    {
        String output = "";
        if (wait)
        {
            seats[0][0] = VIP;
            output += "You are first in line to receive treatment.";

        }
        else
        {
            seats[2][2] = VIP;
            output += "You are fourth in line to receive treatment.";
        }
        return output;
    }


}
