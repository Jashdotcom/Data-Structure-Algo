import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Checks whether the entered string is palindrome or not (using recursive function).
        //Case Sensitive.
        //Will not accept string with spaces.
        //Returns "true" if string is palindrome else returns "false".

        String string;

        System.out.print("Enter a string : ");
        string = scanner.next();

        palindrome(string,string.length(),0);

        System.out.println(palindrome(string,string.length(),0));
    }
    static boolean palindrome(String string, int n, int i){

        if(i>=n/2){
            return true;
        }

        if(string.charAt(i)!=string.charAt(n-i-1)){
            return false;
        }
        return palindrome(string,n,i+1);
    }
}
