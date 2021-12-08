
public class CreateTeacher extends Menu {

    //The method Create() creates a new Teacher
    public void Create() {
        
        //Asks the user to set an ID for the new Teacher
        System.out.println(sop.t1);
        pId = sc.nextInt();
        
        //The variable is set to false for the verification process
        uniqueId = false;
        
        //This while function loops so long as the ID entered by the user is not unique.
        while (uniqueId == false) {
            //This variable checks if the user inputted ID matches with an ID in the ArrayList allT, and is set to false because the ID has no matches yet
            boolean match = false;
            for (int a = 0; a < allT.size(); a++) {
                //If ever the Teacher ID matches with the ID entered by the user, match is set to true.
                if (allT.get(a).getId() == pId) {
                    match = true;
                }
            }
            //If there are no matches, that means that the ID entered by the user is unique, the variable is set to true, and the while loop stops.
            if (match == false) {
                uniqueId = true;
            }
            //If there are matches, that means that the ID entered by the user is not unique, and the user is asked again to enter a new ID.
            else {
                System.out.println("Please enter a Teacher ID that doesn't exist yet: ");
                pId = sc.nextInt();
            }
        }

        //The user enters the rest of the attributes of Teacher
        System.out.println(sop.t2);
        name = sc.next();
        System.out.println(sop.t3);
        age = sc.nextInt();
        System.out.println(sop.t4);
        gender = sc.next();
        System.out.println(sop.t5);
        deg = sc.nextInt();
        if(deg == 1){
            degree = "Bachelor's";
        }
        else if(deg == 2){
            degree = "Master's";
        }
        else if(deg == 3){
            degree = "PhD";
        }
        System.out.println(sop.t6);
        specialty = sc.next();
        
        //The new Teacher is created and is added to the ArrayList allT.
        t = new Teacher(pId, name, age, gender, degree, specialty);
        allT.add(t);
        
        //The user selects what Department they want to add their Teacher to.
        System.out.println(sop.t7);
        dId = sc.nextInt();
        
        //The variable is set to false for the verification process
        idExists = false;
        
        //The while function loop so long as the ID inputted by the user does not exist.
        while (idExists == false) {
            for (int b = 0; b < allD.size(); b++) {
                //If the user inputted ID matches with a Department from the ArrayList AllD, then the ID that the user selects exists and the while loop stops, and the Teacher is added the the Teacher ArrayList of that Department.
                if (dId == allD.get(b).getId()) {
                    idExists = true;
                    allD.get(b).tList.add(t);
                }
            }
            //If the ID does not exist, the user inputs a new ID to be verified.
            if (idExists == false) {
                System.out.println("Please enter a valid department ID:");
                dId = sc.nextInt();
            }
        }
    }
}
