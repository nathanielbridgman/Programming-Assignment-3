
public class Student extends Person {

    //Creating the attributes for Student
    private String course;
    private int semester;

    //Constructor
    public Student(int i, String n, int a, String g, String c, int s) {
        this.id = i;
        this.name = n;
        this.age = a;
        this.gender = g;
        this.course = c;
        this.semester = s;
    }

    //Setters
    public void setCourse(String c) {
        this.course = c;
    }
    public void setSemester(int s) {
        this.semester = s;
    }

    //Getters
    public String getCourse() {
        return this.course;
    }
    public int getSemester() {
        return this.semester;
    }

    //This method calls the toString() method from the superclass Person, and also prints the attributes of Student
    @Override
    public String toString() {
        return (super.toString() + "Course: " + this.course + "\n" + "Semester: " + this.semester + "\n");
    }
}
