package DSA;

import java.util.Scanner;

public class Power {

    public static void main(String[] args){

        //Raise 'x' to the power 'n' and return value using recursion.

        Scanner scanner = new Scanner(System.in);

        double x,n;

        System.out.print("Enter value of x : ");
        x=scanner.nextInt();

        System.out.print("Enter the power to be raised (n) : ");
        n=scanner.nextInt();

        pow(x,n);
    }
    static void pow(double x,double n){

        double result = Math.pow(x,n);
        System.out.println(x + " raised to the power " + n + " = " + result);
    }
}