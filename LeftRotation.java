package DSA;

import java.util.Scanner;
public class LeftRotation {

    public static void main(String[] args) {

        // LEFT ROTATING AN ARRAY BY N PLACES

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

        int orgNum=num;
        num = num % size;

        reverse(arr, 0, num - 1);
        reverse(arr, num, size - 1);
        reverse(arr, 0, size - 1);

        System.out.print("\nArray after " + orgNum + " left rotation/s : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        sc.close();
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
