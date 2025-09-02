import java.util.Scanner;

public class ParameterisedWay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Print sum of first n natural nos. using Parameterized way(Recursive Function).

        int n;
        System.out.print("Enter number (n) : ");
        n = scanner.nextInt();

        printSum(n,0);

        scanner.close();
    }
    static void printSum(int i,int sum){
        if(i<1){
            System.out.printf("Sum = %d",sum);
            return;
        }
        printSum(i-1,sum+i);
    }
}

