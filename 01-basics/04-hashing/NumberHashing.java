import java.util.Scanner;

/**
 * ----------------------------------------------------------------------------
 * Striver A2Z DSA • Step 1.4: Number Hashing (1-to-1 Translation of hashing.cpp)
 * ----------------------------------------------------------------------------
 * Direct Java equivalent of Striver's video demonstration:
 * 1. Reads N and array elements.
 * 2. Precomputes frequency array hash[13] in O(N).
 * 3. Reads Q queries and fetches each query in O(1).
 */
public class NumberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read size of array
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. Precompute frequency (max element <= 12 as per video)
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // 3. Process Q queries (Fetch in O(1))
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            // Fetch
            System.out.println(hash[number]);
        }

        sc.close();
    }
}