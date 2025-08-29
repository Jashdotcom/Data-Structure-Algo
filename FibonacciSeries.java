import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Print nth fibonacci number using multiple recursion calls.

        int n;
        System.out.print("Enter a number (n) : ");
        n=scanner.nextInt();

        fibonacci(n);

        System.out.println(fibonacci(n));

        scanner.close();
    }
    static int fibonacci(int n){

        if(n<=1){
            return n;
        }
        int last=fibonacci(n-1);
        int slast=fibonacci(n-2);

        return last+slast;
    }
}
