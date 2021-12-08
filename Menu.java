//Importing Scanner and ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    //Creating Scanner object
    public static Scanner sc = new Scanner(System.in);

    //Creating the ArrayLists that hold all the Department objects, Teacher objects, and Student objects respectively.
    public static ArrayList<Department> allD = new ArrayList<>();
    public static ArrayList<Teacher> allT = new ArrayList<>();
    public static ArrayList<Student> allS = new ArrayList<>();
    public static ArrayList<Staff> allSt = new ArrayList<>();

    //Creating a Department object, Teacher object, and Student object respectively.
    public static Department d;
    public static Teacher t;
    public static Student s;
    public static Staff st;

    //Creating an object of the SOP class, CreateDepartment class, CreateTeacher class, CreateStudent class, and SetDean class respectively
    public static SOP sop = new SOP();
    public static CreateDepartment newD = new CreateDepartment();
    public static CreateTeacher newT = new CreateTeacher();
    public static CreateStudent newS = new CreateStudent();
    public static CreateStaff newSt = new CreateStaff();
    public static SetDean setD = new SetDean();

    //Creating the variables specific to Department
    public static int dId;
    public static String deptDesc;

    //Creating the variables for both Teachers and Students
    public static int pId;
    public static String name;
    public static int age;
    public static String gender;

    //Creating the variables specific to Teacher
    public static int deg;
    public static String degree;
    public static String specialty;

    //Creating the variables specific to Student
    public static String course;
    public static int semester;
    
    //Creating the variables specific to Staff
    public static String duty;
    public static int workload;

    public static boolean uniqueId; //This boolean variable is used when checking to see if an ID is unique or not
    public static boolean leave = false; //This boolean variable is used to see if the user wishes to exit the program
    public static int choice; // THis variable is used to see which option in the menu the user wants to select
    public static boolean idExists; //This boolean variable is used when checking to see if an ID exists or not.

    public void mainProgram() {
        //This while function loops the program until the boolean leave equals true
        while (leave == false) {
            //The menu text is printed
            System.out.println(sop.mm);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //If the user input is equal to 1, the Create() method is called from the CreateDepartment class
                    newD.Create();
                    break;

                case 2:
                    //If the user input is equal to 2, the size of the ArrayList holding all Departments is checked
                    if (allD.size() == 0) {
                        //If the size of ArrayList allD is equal to 0, an error message is printed
                        System.out.println(sop.t8);
                        break;
                    } else {
                        //If the size of the ArrayList allD is not equal to 0, the Create() method is called from the CreateTeacher class
                        newT.Create();
                        break;
                    }

                case 3:
                    //If the user input is equal to 3, the size of the ArrayList holding all Departments is checked
                    if (allD.size() == 0) {
                        //If the size of ArrayList allD is equal to 0, an error message is printed
                        System.out.println(sop.s8);
                        break;
                    } else {
                        //If the size of the ArrayList allD is not equal to 0, the Create() method is called from the CreateStudent class
                        newS.Create();
                        break;
                    }
                    
                case 4:
                    //If the user input is equal to 4, the size of the ArrayList holding all Departments is checked
                    if (allD.size() == 0) {
                        //If the size of ArrayList allD is equal to 0, an error message is printed
                        System.out.println(sop.st8);
                        break;
                    } else {
                        //If the size of the ArrayList allD is not equal to 0, the Create() method is called from the CreateStaff class
                        newSt.Create();
                        break;
                    }
                case 5:
                    //If the user input is equal to 4, the size of the ArrayList holding all Departments is checked
                    if (allD.size() == 0) {
                        //If the size of ArrayList allD is equal to 0, an error message is printed
                        System.out.println(sop.sd3);
                        break;
                    } else if(allT.size() == 0){
                        //If the size of ArrayList allT is equal to 0, an error message is printed
                        System.out.println(sop.sd4);
                        break;
                    }else {
                        //If the size of the ArrayList allD is not equal to 0, the setDean() method is called from the SetDean class
                        setD.setDean();
                        break;
                    }

                default:
                    //If the user input is equal to anything else, boolean leave is queal to true, this ending the while loop
                    leave = true;
                    break;
            }
        }

        //Once the user is done with the program, all of the Departments are printed with their respective Teachers and Students
        for (int z = 0; z < allD.size(); z++) {
            System.out.println((allD.get(z).getDean() == null)?
                     ("\nDEPARTMENT\n" + allD.get(z).Display()
                    + "\n "
                    + "\nTEACHER LIST\n" + allD.get(z).tList
                    + "\nSTUDENT LIST\n" + allD.get(z).sList
                    + "\nSTAFF LIST\n" + allD.get(z).stList)
                    +"\n "
                    : ("\nDEPARTMENT\n" + allD.get(z).displayDean()
                    +"\n "
                    + "\nTEACHER LIST\n" + allD.get(z).tList
                    + "\nSTUDENT LIST\n" + allD.get(z).sList
                    + "\nSTAFF LIST\n" + allD.get(z).stList)
                    +"\n "
                    );
        }
        System.out.println("HAVE A GOOD DAY!");
    }
}
