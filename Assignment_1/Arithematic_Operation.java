package unit;

import java.util.Scanner;
public class Arithematic_Operation {
    public int num1, num2;

    public int addNums(int n1, int n2){
        return n1+n2;
    }

    public int SubstractNums(int n1, int n2){
        return n1-n2;
    }

    public int MultiplyNums(int n1, int n2){
        return n1*n2;
    }

    public float DivideNums(float n1, float n2){
        return n1/n2;
    }

    public int modNums(int n1, int n2){
        return n1%n2;
    }

    public static void main(){
        Arithematic_Operation op =  new Arithematic_Operation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        op.num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        op.num2 = sc.nextInt();
        int sum = op.addNums(op.num1, op.num2);
        int diff = op.SubstractNums(op.num1, op.num2);
        float divide = op.DivideNums(op.num1, op.num2);
        int product = op.MultiplyNums(op.num1, op.num2);
        int mod = op.modNums(op.num1, op.num2);
        System.out.println("Sum: "+sum+ "\nDifference: "+diff+"\nProduct: "+product+"\nDivision: "+divide+"\nMod: "+mod);
    }
}
