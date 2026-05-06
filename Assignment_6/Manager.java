public class Manager extends FullTimeEmployee {
    public double TA;

    public Manager(int empId, String pan, String department, String name, String joiningDate, double baseSalary, double bonus, double TA) {
        super(empId, pan, department, name, joiningDate, baseSalary, bonus);
        this.TA = TA;
    }

    @Override
    public double calCTC(){
        return baseSalary+bonus+TA;
    }
}
