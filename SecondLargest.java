package DSA;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args){

        //SECOND LARGEST VAR IS STORED AS -1 AS WE ARE ASSUMING ARRAY CONTAINS ALL POSITIVE ELEMENTS

        Scanner sc = new Scanner(System.in);

        int size=0;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[size];
        
        System.out.println("\nEnter the array elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("Element %d : ",i);
            arr[i]=sc.nextInt();
            sc.nextLine();
        }

        int largest=arr[0];
        int secLargest=-1;
        int i=0;

        for(i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
                secLargest=arr[i-1];
            }
            else if(arr[i]<largest && arr[i]>secLargest){
                secLargest=arr[i];
            }
        }
    
        System.out.print("\nArray is : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nSecond Largest : " + secLargest);





    }
}

