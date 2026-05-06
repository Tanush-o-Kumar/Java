public class ContractEmployee extends Employee{
    public double hourlyRate;
    public int noOfHours;

    public ContractEmployee(int empId, String pan, String department, String name, String joiningDate, double hourlyRate, int noOfHours){
        super(empId, pan, department, name, joiningDate);
        this.hourlyRate = hourlyRate;
        this.noOfHours = noOfHours;
    }

    @Override
    public double calCTC(){
        return noOfHours*hourlyRate;
    }
}
