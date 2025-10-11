package DSA;

import java.util.Scanner;

public class RightRotationBFM {

    //THIS IS THE BRUTE FORCE APPROACH

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter number of place/s by which the array should be rotated : ");
        int num = sc.nextInt();

        System.out.println("\nArray before rotation : ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        num%=size;

        for(int i=1;i<=num;i++){
            int temp = arr[size-1];
            for(int j=size-2;j>=0;j--){
                arr[j+1]=arr[j];

            }
            arr[0]=temp;
        }


        System.out.println("\nArray after rotation : ");
        for(int j : arr){
            System.out.print(j + " ");
        }
    }
}
