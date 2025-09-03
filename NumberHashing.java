import java.util.Scanner;

public class NumberHashing {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n;
        int[] arr;

        System.out.print("Enter the size of array (n) : ");
        n=scanner.nextInt();

        arr = new int[n];

        System.out.print("\nEnter array  elements : \n");

        for(int i=0;i<n;i++){
            System.out.printf("Enter %d element : ",i);
            arr[i]=scanner.nextInt();
        }

        //PRECOMPUTE/RESTORING

        int[] hash = new int[13];  //DEPENDING ON THE MAXIMUM SIZE OF THE ARRAY WE DECLARE THE HASH.
        hash[12]=0;

        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }


        int Q;
        int num=0;

        System.out.print("\nEnter number of queries : ");
        Q=scanner.nextInt();

        for(int i=0;i<Q;i++){
            System.out.printf("Query %d : ",i);
            num=scanner.nextInt();

            //FETCH

            System.out.println(hash[num]);
        }


    }
}
