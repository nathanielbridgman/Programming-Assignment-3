
public class SetDean extends Menu {

    //This method sets a Teacher within a Department as that Department's Dean
    public void setDean() {

        //Asks the user to select the ID of the Department they would like to set the Dean in
        System.out.println(sop.sd1);
        dId = sc.nextInt();
        
        //The variable is set to false for the verification process
        idExists = false;
        
        //The while function loop so long as the ID inputted by the user does not exist.
        while (idExists == false) {
            for (int a = 0; a < allD.size(); a++) {
                //If the user inputted ID matches with a Department from the ArrayList AllD, then the ID that the user selects exists and the while loop stops
                if (dId == allD.get(a).getId()) {
                    idExists = true;
                }
            }
            //If the ID does not exist, the user inputs a new ID to be verified.
            if (idExists == false) {
                System.out.println("Please enter a valid Department ID:");
                dId = sc.nextInt();
            }
        }

        //The variable is reset to false for the next verification process
        idExists = false;
        
        //Asks the user for the ID of the teacher to set the Dean to.
        System.out.println(sop.sd2);
        pId = sc.nextInt();
        
        //The while function loop so long as the ID inputted by the user does not exist.
        while (idExists == false) {
            for (int b = 0; b < allD.size(); b++) {
                //If the last verified user ID matches with a Department from the ArrayList AllD, then the ID that the user selects exists and the while loop stops
                if (dId == allD.get(b).getId()) {
                    for (int c = 0; c < allD.get(b).tList.size(); c++) {
                        //If the ID the user selected matches with an ID from the Teacher ArrayList of the user's chosen Department, then the ID exists and that Teacher is made Dean, and the while loop stops
                        if (pId == allD.get(b).tList.get(c).getId()) {
                            idExists = true;
                            allD.get(b).setDean(allD.get(b).tList.get(c));
                        }
                    }
                }
            }
            //If the ID does not exist, the user inputs a new ID to be verified.
            if (idExists == false) {
                System.out.println("Please enter a valid Teacher ID:");
                pId = sc.nextInt();
            }
        }
    }
}
