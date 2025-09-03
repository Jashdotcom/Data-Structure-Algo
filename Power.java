import java.util.Scanner;

public class Power {

    public static void main(String[] args){

        //Raise 'x' to the power 'n' and return value using recursion.

        Scanner scanner = new Scanner(System.in);

        double x,n;

        pow(2,5);
    }
    static void pow(double x,double n){

        double result = Math.pow(x,n);
        System.out.println(result);
    }
}
