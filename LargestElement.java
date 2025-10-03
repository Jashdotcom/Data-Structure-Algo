package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args){

        //THIS PROGRAM RETURNS THE LARGEST ELEMENT IN THE ARRAY.

        Scanner sc = new Scanner(System.in);

        int size=0;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[size];

        System.out.println();
        System.out.println("Enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("Element %d : ",i);
            arr[i]=sc.nextInt();
            sc.nextLine();
        }

        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }

        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.printf("Largest element : %d",largest);

    }
}
