import java.util.Scanner;

public class FunctionalRecursion {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Prints sum of first n natural nos. using Functional way

        int n;
        System.out.print("Enter number (n) : ");
        n=scanner.nextInt();

        System.out.printf("Sum of first %d numbers is : %d",n,sum(n));

        scanner.close();

    }
    static int sum(int n){

        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }

    }
}
