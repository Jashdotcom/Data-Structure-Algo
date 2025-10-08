package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){

        //REMOVE DUPLICATES FROM SORTED ARRAY
        //NOT OPTIMAL SOLUTION

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d : ", i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("\nArray before removing duplicates : ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        HashSet<Integer> unique = new HashSet<>();

        for(int i : arr){
            unique.add(arr[i]);
        }

        int count=1;
        System.out.println("\nArray after removing duplicates :  ");
        for(int i : unique){
            System.out.print(i + " ");
            count+=1;
        }
        System.out.println("\nThe number of unique elements are : " + count);

    }
}
