package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter the array elements : ");
        for (int i=0;i<arr.length;i++) {
            System.out.printf("Element %d : ", i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("\nArray before removing duplicates : ");
        for(int i:arr){
            System.out.print(i + " ");
        }


        int i=0,j=0;
        for(j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        System.out.print("\nArray after removing duplicates : ");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println("\nNumber of unique elements are : " + (i+1));
    }
}
