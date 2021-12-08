
public class Teacher extends Person implements PayRoll {

    //Creating the attributes of Teacher
    private String degree;
    private String specialty;
    private int saleDegree;

    //Constructor
    public Teacher(int i, String n, int a, String g, String deg, String s) {
        this.id = i;
        this.name = n;
        this.age = a;
        this.gender = g;
        this.degree = deg;
        this.specialty = s;
    }

    //Setters
    public void setDegree(String deg) {
        this.degree = deg;
    }
    public void setSalary(String s) {
        this.specialty = s;
    }

    //Gettters
    public String getDegree() {
        return this.degree;
    }
    public String getSalary() {
        return this.specialty;
    }
    
    //Overrides the method computePayRoll(double d) from Interface PayRoll
    @Override
    public double computePayRoll(){
        if("Bachelor's".equals(this.degree)){
            saleDegree = 42;
        }
        else if("Master's".equals(this.degree)){
            saleDegree = 82;
        }
        else if("PhD".equals(this.degree)){
            saleDegree = 112;
        }
        return saleDegree*54.72;
    }

    //This method calls the toString() method from the superclass Person, and also prints the attributes of Teacher
    @Override
    public String toString() {
        return (super.toString() + "Degree: " + this.degree + "\n" + "Specialty: " + this.specialty + "\n" + "Salary: " + computePayRoll() + "\n");
    }
}
