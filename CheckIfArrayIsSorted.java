package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArrayIsSorted {

    //THIS CODE IS FOR NON-DESCENDING ARRAY

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[size];

        System.out.println("\nEnter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d : ", i);
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.print("\nArray : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) ;
            else {
                System.out.println("\nThe Array is not sorted");
                break;
            }
            System.out.println("\nThe Array is sorted");
        }

    }
}

