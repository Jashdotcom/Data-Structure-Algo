import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class NumHashing {

    public static void main(String[] args) {

        //CHECKS FREQUENCY OF AN ELEMENT(number) IN AN ARRAY USING HASHMAPS

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

        // PRECOMPUTING
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int Q;
        System.out.print("\nEnter number of queries : ");
        Q = scanner.nextInt();

        for (int i = 0; i < Q; i++) {
            int num;
            System.out.printf("Enter Query %d : ", i);
            num = scanner.nextInt();

            // FETCHING
            System.out.println(num + " appears "+ "->" + " " + map.getOrDefault(num, 0)  + " times");
        }

        //IT'LL ITERATE THROUGH ALL THE ELEMENTS IN THE MAP
        System.out.println("\n--- Map Contents ---");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        scanner.close();
    }
}