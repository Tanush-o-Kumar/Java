import java.util.Scanner;
public abstract class Employee {
    private int empId;
    private String pan;
    private String department;
    public String name;
    String joiningDate;
    Scanner sc = new Scanner();

    public Employee(){
        System.out.println("Enter Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter Emp Id: ");
        this.empId = sc.nextInt();
        System.out.println("Enter department: ");
        this.department = sc.nextLine();
        System.out.println("Enter pan details: ");
        this.pan = sc.nextLine();
        System.out.println("Enter date of joining: ");
        this.joiningDate = sc.nextLine();
    }

    abstract double calCTC();
}
