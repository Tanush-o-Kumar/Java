import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Account acc = new SavingsAccount("101", 5000, 4.5, 1000);
        LoanAccount loanAcc = new LoanAccount("L101", 0);

        Customer c1 = new Customer(1, "Rahul", "PAN123", "AAD123",
                "Mumbai", "01-01-2000", "9999999999");

        while(true){
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Nominee");
            System.out.println("5. Display Customer");
            System.out.println("6. Take Loan");
            System.out.println("7. Pay Loan");
            System.out.println("8. Close Account");
            System.out.println("9. Exit");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.credit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    acc.debit(sc.nextDouble());
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter nominee: ");
                    c1.addNominees(sc.nextLine());
                    break;

                case 5:
                    c1.displayCustomer();
                    break;

                case 6:
                    System.out.print("Enter loan amount: ");
                    loanAcc.takeLoan(sc.nextDouble());
                    break;

                case 7:
                    System.out.print("Enter payment amount: ");
                    loanAcc.payLoan(sc.nextDouble());
                    break;

                case 8:
                    acc.closeAccount();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}