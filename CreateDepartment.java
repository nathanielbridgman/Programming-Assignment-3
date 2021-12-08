
public class CreateDepartment extends Menu {

    //The method Create() creates a new Department
    public void Create() {
        
        //Asks the user to set an ID for the new Department
        System.out.println(sop.d1);
        dId = sc.nextInt();
        
        //The variable is set to false for the verification process
        uniqueId = false;
        
        //This while function loops so long as the ID entered by the user is not unique.
        while (uniqueId == false) {
            //This variable checks if the user inputted ID matches with an ID in the ArrayList allD, and is set to false because the ID has no matches yet
            boolean match = false;
            for (int a = 0; a < allD.size(); a++) {
                //If ever the Department ID matches with the ID entered by the user, match is set to true.
                if (allD.get(a).getId() == dId) {
                    match = true;
                }
            }
            //If there are no matches, that means that the ID entered by the user is unique, the variable is set to true, and the while loop stops.
            if (match == false) {
                uniqueId = true;
            } 
            //If there are matches, that means that the ID entered by the user is not unique, and the user is asked again to enter a new ID.
            else {
                System.out.println("Please enter a Department ID that doesn't exist yet: ");
                dId = sc.nextInt();
            }
        }
        
        //The user enters the Department description
        System.out.println(sop.d2);
        deptDesc = sc.next();
        
        //The Department is created and is added to the ArrayList allD.
        d = new Department(dId, deptDesc);
        allD.add(d);
    }
}
