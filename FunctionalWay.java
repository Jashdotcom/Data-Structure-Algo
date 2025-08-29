import java.util.Scanner;

public class FunctionalWay {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Print sum of first n natural nos. using Functional way

        int n;
        System.out.print("Enter number (n) : ");
        n=scanner.nextInt();

        System.out.print(sum(n));

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
