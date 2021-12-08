public class CreateStaff extends Menu{
    public void Create(){
        
        //Asks the user to set an ID for the new Staff
        System.out.println(sop.st1);
        pId = sc.nextInt();
        
        //The variable is set to false for the verification process
        uniqueId = false;
        
        //This while function loops so long as the ID entered by the user is not unique.
        while (uniqueId == false) {
            //This variable checks if the user inputted ID matches with an ID in the ArrayList allSt, and is set to false because the ID has no matches yet
            boolean match = false;
            for (int a = 0; a < allSt.size(); a++) {
                //If ever the Student ID matches with the ID entered by the user, match is set to true.
                if (allSt.get(a).getId() == pId) {
                    match = true;
                }
            }
            //If there are no matches, that means that the ID entered by the user is unique, the variable is set to true, and the while loop stops.
            if (match == false) {
                uniqueId = true;
            }
            //If there are matches, that means that the ID entered by the user is not unique, and the user is asked again to enter a new ID.
            else{
                System.out.println("Please enter a Staff ID that doesn't exist yet: ");
                pId = sc.nextInt();
            }
        }
        
         //The user enters the rest of the attributes of Staff
        System.out.println(sop.st2);
        name = sc.next();
        System.out.println(sop.st3);
        age = sc.nextInt();
        System.out.println(sop.st4);
        gender = sc.next();
        System.out.println(sop.st5);
        duty = sc.next();
        System.out.println(sop.st6);
        workload = sc.nextInt();
        while(workload >36){
            System.out.println("Please enter a workload under 36");
            workload = sc.nextInt();
        }
        
        //The new Student is created and is added to the ArrayList allS.
        st = new Staff(pId, name, age, gender, duty, workload);
        allSt.add(st);
        
        //The user selects what Department they want to add their Student to.
        System.out.println(sop.st7);
        dId = sc.nextInt();
        
        //The variable is set to false for the verification process
        idExists = false;
        
        //The while function loop so long as the ID inputted by the user does not exist.
        while (idExists == false) {
            for (int b = 0; b < allD.size(); b++) {
                //If the user inputted ID matches with a Department from the ArrayList AllD, then the ID that the user selects exists and the while loop stops, and the Student is added the the Student ArrayList of that Department.
                if (dId == allD.get(b).getId()) {
                    idExists = true;
                    allD.get(b).stList.add(st);
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
