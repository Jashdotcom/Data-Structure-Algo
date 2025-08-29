import java.util.Scanner;

public class PrintName {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Print Name n times using Recursion

        int n;

        System.out.print("Enter number (n) : ");
        n=scanner.nextInt();

        printName(1,n);
    }
    static void printName(int i,int n){

        if(i>n){
            return;
        }
        System.out.println("Jash");
        printName(i+1,n);
    }
}
