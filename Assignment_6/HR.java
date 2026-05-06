import java.util.Scanner;
public class HR extends FullTimeEmployee{
    double hiringCommision;
    Scanner sc = new Scanner(System.in);
    Payroll p = new Payroll();

    public HR() {
        super();

        System.out.println("Enter the base Salary: ");
        p.baseSalary = sc.nextDouble();
        System.out.println("Enter the Hiring Commision: ");
        p.hiringCommision = sc.nextDouble();
    }

    @Override
    public double calCTC(){
        return p.baseSalary + hiringCommision;
    }
}
