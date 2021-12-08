
public abstract class Person {

    //Creating the attributes of Person
    protected int id;
    protected String name;
    protected int age;
    protected String gender;

    //Setters
    public void setId(int i) {
        this.id = i;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public void setGender(String g) {
        this.gender = g;
    }

    //Getters
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }

    //Prints the attributes of Person
    public String toString() {
        return ("\nID: " + this.id + "\n" + "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Gender: " + this.gender + "\n");
    }
}
