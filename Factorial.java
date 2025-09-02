import java.util.Scanner;
public class Factorial {

    public static void main(String[] args){

        //Returns the factorial of a number (using recursion).

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Enter number(n) : ");
        n=scanner.nextInt();

        System.out.printf("Factorial of %d = %d",n,fact(n));

        scanner.close();
    }
    static int fact(int n){

        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}

