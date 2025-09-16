import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Starting from the first element we check,we increment element by 1.
        //Checking with the before elements.
        //If the previous element is greater than the current element ,then swap.
        //Repeat untill array is fully sorted.

        int[] arr;
        int[] sortedArr;
        int size,j;

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
        for(int i=0;i<size;i++){
            j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.print("\nSorted Array is : ");
        for(j=0;j<size;j++){
            System.out.print(arr[j] + " ");
        }

    }
}
