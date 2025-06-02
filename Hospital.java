/**
 * A hospital check-in desk before receiving treatment.
 * @author Lily Ha
 * @version 2.0.0
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Hospital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our hospital! I am your nurse that will be taking notes on your symptoms. Could I ask you a few questions?");
        String consent = input.nextLine();
        while (!consent.equals("yes") && !consent.equals("Yes")) {
            System.out.println("Let's try that again.");
            System.out.println("Would you mind if I ask you a few questions concerning your condition? [Enter \"Yes\" to proceed.]");
            consent = input.nextLine();
        }

        //The list of injuries the patient has.
        ArrayList<Injury> injuries = new ArrayList<>();

        System.out.println("Do you have a bruise?");
        String bruise = input.nextLine();
        boolean haveBruise = false;
        while (!bruise.equals("yes") && !bruise.equals("Yes") && !bruise.equals("no") && !bruise.equals("No")) {
            System.out.println("ERROR. Please enter \"Yes\" or \"No\".");
            bruise = input.nextLine();
        }
        if (bruise.equals("yes") || bruise.equals("Yes")) {
            haveBruise = true;
        } else if (bruise.equals("no") || bruise.equals("No")) {
            haveBruise = false;
        }

        if (haveBruise) {

            System.out.println("Where is the bruise located on your body?");
            String location = input.nextLine();
            System.out.println("And what color is the bruise as of right now?");
            String color = input.nextLine();
            Bruise one = new Bruise(location, color);
            //Adds the bruise to the list of injuries.
            injuries.add(one);
            System.out.println("Got it, thanks.");
            System.out.println("Jotting down notes...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Is the following information correct?");
            System.out.println(one);
            String confirm = input.nextLine();
            while (!confirm.equals("yes") && !bruise.equals("Yes")) {
                System.out.println("ERROR. Please enter \"Yes\" to proceed.");
                confirm = input.nextLine();
            }
        }


        System.out.println("Moving on. Have you had a concussion recently?");
        String concussion = input.nextLine();
        boolean haveConcussion = false;
        while (!concussion.equals("yes") && !concussion.equals("Yes") && !concussion.equals("no") && !concussion.equals("No")) {
            System.out.println("ERROR. Please enter \"Yes\" or \"No\".");
            concussion = input.nextLine();
        }
        if (concussion.equals("yes") || concussion.equals("Yes")) {
            haveConcussion = true;
        }

        else if (concussion.equals("no") || concussion.equals("No")) {
            haveConcussion = false;
        }
        if (haveConcussion) {
            System.out.println("On a scale of 1-10, how badly are you in pain as of right now?");
            double painLevel = input.nextDouble();
            input.nextLine();
            while (painLevel < 1 || painLevel > 10) {
                System.out.println("On a scale of 1-10 please.");
                painLevel = input.nextDouble();
                input.nextLine();
            }
            System.out.println("OK. Have you been experiencing any trouble with your memory at all after getting this concussion?");
            String memoryLoss = input.nextLine();

            while (!memoryLoss.equals("yes") && !memoryLoss.equals("Yes") && !memoryLoss.equals("no") && !memoryLoss.equals("No")) {
                System.out.println("ERROR. Please enter \"Yes\" or \"No\".");
                memoryLoss = input.nextLine();
            }
            boolean haveMemoryLoss = false;
            if (memoryLoss.equals("yes") || memoryLoss.equals("Yes")) {
                haveMemoryLoss = true;
            } else if (memoryLoss.equals("no") || memoryLoss.equals("No")) {
                haveMemoryLoss = false;
            }
            Concussion two = new Concussion(painLevel, haveMemoryLoss);
            //Adds the concussion to the list of injuries.
            injuries.add(two);
            System.out.println("Got it, thanks.");
            System.out.println("Jotting down notes...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Is the following information correct?");
            System.out.println(two);
            String confirm = input.nextLine();
            while (!confirm.equals("yes") && !confirm.equals("Yes")) {
                System.out.println("Please enter \"Yes\" to proceed.");
                confirm = input.nextLine();
            }
        }
        System.out.println("Any other injuries?");
        String other = input.nextLine();
        while (!other.equals("yes") && !other.equals("Yes") && !other.equals("no") && !other.equals("No")) {
            System.out.println("Please enter \"Yes\" or \"No\".");
            other = input.nextLine();
        }
        if (other.equals("yes") || other.equals("Yes"))
        {
            System.out.println("What is the name of this injury?");
            String name = input.nextLine();
            System.out.println("On a scale of 1-10, how much pain are you in from getting a " + name + "?");
            double painLevel1 = input.nextDouble();
            input.nextLine();
            System.out.println("Where on your body are you feeling this pain?");
            String location1 = input.nextLine();




            System.out.println("And what word would you use to describe your pain?");
            String painType = input.nextLine();
            Injury three = new Injury(name, painLevel1, location1, painType);
            //Adds the injury described by the patient to the list of injuries.
            injuries.add(three);
            System.out.println("Is the following information correct?");
            System.out.println(three);
            String rightInfo = input.nextLine();
            while (!rightInfo.equals("yes") && !rightInfo.equals("Yes")) {
                System.out.println("Please enter \"Yes\" to proceed.");
                rightInfo = input.nextLine();
            }
        }

        System.out.println("What is your name patient?");
        String patientName = input.nextLine();

        System.out.println("And lastly, would you mind waiting to be treated?");
        String treatmentTime = input.nextLine();

        while (!treatmentTime.equals("yes") && !treatmentTime.equals("Yes") && !treatmentTime.equals("no") && !treatmentTime.equals("No")) {
            System.out.println("Please enter \"Yes\" or \"No\".");
            treatmentTime = input.nextLine();
        }

        boolean wait = false;

        if (treatmentTime.equals("yes") || treatmentTime.equals("Yes")) {
            System.out.println("Huh impatient much?");
            System.out.println("Please wait to receive your spot in the waiting room.");
            wait = false;
        }

        else if (treatmentTime.equals("no") || treatmentTime.equals("No")) {
            System.out.println("Thank you, please wait to receive your spot in the waiting room.");
            wait = true;
        }

        //Creates a file of a patient using the patient's name and their list of injuries.
        PatientFile VIPcustomer = new PatientFile(patientName, injuries);

        WaitingRoom lobby = new WaitingRoom();
        System.out.println(lobby.getPlaceInQueue(VIPcustomer, wait));
    }
}
