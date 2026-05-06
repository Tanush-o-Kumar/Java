public class FullTimeEmployee extends Employee {
    //double baseSalary;
    //double bonus;

    public FullTimeEmployee() {
        super();
    }

    @Override
    public double calCTC(){
        return baseSalary + bonus;
    }
}
