package DSA.Sorts;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {s

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] arr;
        int[] sortedArr;
        int size;

        System.out.print("Enter the size of array : ");
        size=scanner.nextInt();

        arr=new int[size];
        sortedArr=new int[size];

        System.out.print("\nEnter the array elements : \n");

        for(int i=0;i<size;i++){
            System.out.printf("Enter element %d : ",i);
            arr[i]=scanner.nextInt();
        }

        System.out.print("\nUnsorted Array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

        int low = 0;
        int high = size-1;
        int pivot = low;

        mainQS(arr,low,high);

        System.out.println();
        System.out.print("Sorted Array is : ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }
    public static void mainQS(int[] arr,int low,int high){
            if (low < high) {
                int partInd = findPivot(arr, low, high);
                mainQS(arr, low, partInd - 1);   // sorts all the left elements to the pivot
                mainQS(arr, partInd + 1, high);  // sorts all the right elements to the pivot
            }
        }
        public static int findPivot(int[] arr,int low,int high){

        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }

}
