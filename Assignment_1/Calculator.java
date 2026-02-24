package unit;

import java.util.Scanner;
public class Calculator {
    public double num1, num2;
    public int choice;
    public double addNums(double n1, double n2){
        return n1+n2;
    }

    public double SubstractNums(double n1, double n2){
        return n1-n2;
    }

    public double MultiplyNums(double n1, double n2){
        return n1*n2;
    }

    public double DivideNums(double n1, double n2){
        return n1/n2;
    }

    public double modNums(double n1, double n2){
        return n1%n2;
    }

    public static void main(){
        Calculator op = new Calculator();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n-------------------------------------------\n");
            System.out.println("Please Choose from the following Menu~\n1.Add\n2.Substract\n3.Multiply\n4.Divide\n5.Modulus\n0. To Exit");
            System.out.println("Please Enter your choice: ");
            op.choice = sc.nextInt();
            if(op.choice == 0){
                System.exit(0);
            }
            System.out.print("Enter the first number: ");
            op.num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            op.num2 = sc.nextDouble();
            switch(op.choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Sum: "+op.addNums(op.num1, op.num2));
                    break;
                case 2:
                    System.out.println("Difference: "+op.SubstractNums(op.num1, op.num2));
                    break;
                case 3:
                    System.out.println("Product: "+op.MultiplyNums(op.num1, op.num2));
                    break;
                case 4:
                    System.out.println("Division: "+op.DivideNums(op.num1, op.num2));
                    break;
                case 5:
                    System.out.println("Mod: "+op.modNums(op.num1, op.num2));
                    break;
                default:
                    System.out.println("Please Enter a valid Choice");
                    break;

            }
        }

    }
}
