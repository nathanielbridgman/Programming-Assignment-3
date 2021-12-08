//Importing ArrayList
import java.util.ArrayList;

public class Department {

    //Creating the attributes of Department
    private int id;
    private String description;
    private Teacher dean;

    //The Teacher and Student ArrayLists of a Department
    public ArrayList<Teacher> tList = new ArrayList<>();
    public ArrayList<Student> sList = new ArrayList<>();
    public ArrayList<Staff> stList = new ArrayList<>();
    
    //Constructor
    public Department(int i, String D) {
        this.id = i;
        this.description = D;
    }

    //Setters
    public void setId(int i) {
        this.id = i;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDean(Teacher newD) {
        this.dean = newD;
    }

    //Getters
    public int getId() {
        return this.id;
    }
    public String getDescription() {
        return this.description;
    }
    public Teacher getDean() {
        return this.dean;
    }
    
    //Display method if the Department has a Dean
    public String displayDean() {
        return ("Department ID: " + this.id + "\nDepartment description: " + this.description + "\nDepartment Dean: " + this.dean.getName());
    }

    //Display method if the department has no Dean
    public String Display() {
        return ("Deprtment ID: " + this.id + "\nDepartment description: " + this.description);
    }
}
