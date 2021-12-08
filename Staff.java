
public class Staff extends Person implements PayRoll {

    String duty;
    int workload;

    public Staff(int i, String n, int a, String g, String d, int w) {
        this.id = i;
        this.name = n;
        this.age = a;
        this.gender = g;
        this.duty = d;
        this.workload = w;
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getWorkload() {
        return this.workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double computePayRoll() {
        return workload * 54.4;

    }

    @Override
    public String toString() {
        return (super.toString() + "Duty: " + this.duty + "\n" + "Workload: " + this.workload + "\n" + "Salary: " + computePayRoll() + "\n");
    }
}
