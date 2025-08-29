import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        //Returns "True" if the number is palindrome else returns "False".

        Scanner scanner = new Scanner(System.in);

        int num,revNum=0,rem,dup;

        System.out.print("Enter a number : ");
        num = scanner.nextInt();

        dup=num;

        while(num>0){
            rem=num%10;
            revNum=(revNum*10)+rem;
            num/=10;
        }
        if(revNum==dup){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        scanner.close();
    }
}
