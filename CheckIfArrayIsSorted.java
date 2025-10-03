package DSA;

import java.util.Scanner;

public class CheckIfArrayIsSorted {

    // THIS CODE IS FOR NON-DESCENDING ARRAY

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("\nArray : ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        boolean sorted = true;

        for (int i=1;i<arr.length; i++) {
            if (arr[i-1] <= arr[i]) {
            }
            else {
                sorted = false;
                break;
            }
        }
        if (sorted){
            System.out.println("\nThe Array is sorted");
        }
        else{
            System.out.println("\nThe Array is not sorted");
        }
    }
}
