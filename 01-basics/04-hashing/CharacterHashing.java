import java.util.Scanner;

/**
 * ----------------------------------------------------------------------------
 * Striver A2Z DSA • Step 1.4: Character Hashing (1-to-1 of hashing.cpp)
 * ----------------------------------------------------------------------------
 * Direct Java equivalent of Striver's video demonstration:
 * 1. Reads string S.
 * 2. Precomputes frequency array hash[256] in O(N).
 * 3. Reads Q character queries and fetches each count in O(1).
 */
public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read input string
        if (!sc.hasNext()) {
            sc.close();
            return;
        }
        String s = sc.next();

        // 2. Precompute frequency using ASCII 256 buckets
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++; // Automatically casts char to its ASCII integer value
        }

        // 3. Process Q queries (Fetch in O(1))
        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0); // Read query character
            // Fetch directly from the ASCII index
            System.out.println(hash[c]);
        }

        sc.close();
    }
}