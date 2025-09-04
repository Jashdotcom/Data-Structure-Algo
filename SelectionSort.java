import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args){

        //SORTING THE ARRAY USING SELECTION SORT.
        //SELECTS THE MINIMUM/SMALLEST ELEMENT FROM THE ARRAY AND SWAPS IT WITH THE FIRST UNSORTED ARRAY ELEMENT.

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

        for(int i=0;i<=size-2;i++){
            for(int j=i;j<=size-1;j++){
                int min=i;
                if(arr[j]<arr[min]){
                    min=j;

                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.print("\nSorted Array  is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        scanner.close();

    }
}



