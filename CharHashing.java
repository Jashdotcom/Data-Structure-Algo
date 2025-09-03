import java.util.Scanner;

public class CharHashing {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String s;

        System.out.print("Enter the string : ");
        s=scanner.next();

        //PRECOMPUTE/RESTORE

        int[] hash;
        hash=new int[256];  //WE TOOK SIZE AS 256 COZ IT'LL INCLUDE UPPERCASE CHARS AS WELL.
                            //FOR LOWERCASE IT'LL BE 26 & WE'LL BE DOING ('CH' - 'a') INORDER TO GET THE INDEX NO.

        for(int i=0;i<s.length();i++){
           hash[s.charAt(i)]++;
        }

        int Q;
        char c;

        System.out.print("Enter number of queries : ");
        Q=scanner.nextInt();

        for(int i=0;i<Q;i++){
            System.out.printf("Enter query %d : ",i);
            c=scanner.next().charAt(0);

            //FETCH

            System.out.println(hash[c]);
        }

    }
}
