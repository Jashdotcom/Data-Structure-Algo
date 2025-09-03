import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int[] arr;

        System.out.print("Enter the size of array (n) : ");
        n = scanner.nextInt();

        arr = new int[n];

        System.out.println("Enter array elements : ");

        for (int i = 0; i < n; i++) {
            System.out.printf("Element %d : ", i);
            arr[i] = scanner.nextInt();
        }

        // PRECOMPUTE
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int currentElement : arr) {
            mpp.put(currentElement, mpp.getOrDefault(currentElement, 0) + 1);
        }

        //IT'LL ITERATE IN THE MAP


        System.out.println("\n--- Map Contents ---");
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        int Q;
        System.out.print("\nEnter number of queries : ");
        Q = scanner.nextInt();

        for (int i = 0; i < Q; i++) {
            int num;
            System.out.printf("Enter Query %d : ", i);
            num = scanner.nextInt();

            // FETCH
            System.out.println(mpp.getOrDefault(num, 0));
        }


        scanner.close();
    }
}