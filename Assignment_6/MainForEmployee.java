import java.util.Scanner;
public class MainForEmployee{
    public static void main(String[] args){
        //Create a Login screen with user id and password hardcoded
        System.out.println("----Admin Login----");
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        String id = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        if(id.equals("Admin") && password.equals("1234")){
            while(true){
                System.out.println("--------Welcome-------\nChoose from Menu:\n1. Add Employee\n2. Show Employee Details\n3. Exit\nEnter your choice: ");
                int a = sc.nextInt();
                switch(a){
                    case 1:
                        System.out.println("Choose Employee\n1.Full Time Employee\n2.Contract Employee\nChoose your option: ");
                        int b = sc.nextInt();
                        switch (b){
                            case 1:
                                System.out.println("Choose Employee\n1.HR\n2.Manager\nChoose your option: ");
                                int c = sc.nextInt();
                                switch (c){
                                    case 1:
                                        HR e = new HR():

                                }
                        }

                    case 3:
                        System.exit(0);
                }
            }

        }

    }
}