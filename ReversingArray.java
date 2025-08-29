import java.util.Scanner;

public class ReversingArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Reversing an array using Recursive function

        int[] arr = {1, 5, 23, 12, 57, 2};
        int l = 0;
        int r = arr.length - 1;

        System.out.print("Original array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        reverse(arr, l, r);

        System.out.print("\nReversed array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
    static void reverse(int[] arr, int l, int r){
        if (l >= r) {
            return;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse(arr, l + 1, r - 1);
    }
}