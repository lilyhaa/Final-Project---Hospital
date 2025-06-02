import java.util.ArrayList;
public class WaitingRoom {

    private PatientFile[][] seats;

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
