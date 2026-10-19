/**
 * ============================================================================
 * DETAKOZO (データ構造) - Algorithmic Second Brain
 * Module: Step 1.4 - Basic Hashing & Maps Master Suite
 * ============================================================================
 * 
 * Demonstrates:
 * 1. Number Hashing via Frequency Array (Pre-storing & Fetching).
 * 2. Character Hashing (Lowercase 26-bucket mapping & ASCII 256-bucket mapping).
 * 3. Dynamic Hashing using HashMap (handling large numbers 10^9 & negative numbers).
 * 4. Ordered Hashing using TreeMap (guaranteed sorted key order via Red-Black Tree).
 * 5. Homework Problem: Finding Highest & Lowest Frequency Elements.
 * 6. Division Rule & Collision Simulation (Separate Chaining).
 * 
 * Compilation & Execution (Java 21 LTS):
 *   javac BasicHashingDemo.java
 *   java BasicHashingDemo
 */

import java.util.*;

public class BasicHashingDemo {

    public static void main(String[] args) {
        printBanner();

        // -------------------------------------------------------------
        // PART 1: Number Hashing via Frequency Array
        // -------------------------------------------------------------
        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 1: NUMBER HASHING WITH FREQUENCY ARRAY                           │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
        int[] numArr = {1, 2, 1, 3, 2, 5, 1, 4};
        System.out.println("Input Array: " + Arrays.toString(numArr));

        int maxVal = 10;
        int[] hashArr = new int[maxVal + 1];

        // Precomputation (O(N))
        for (int x : numArr) {
            hashArr[x]++;
        }

        // Fetching (O(1) per query)
        int[] queries = {1, 2, 3, 4, 5, 9};
        System.out.println("Frequency Queries (Fetched in O(1)):");
        for (int q : queries) {
            System.out.printf("  Query(%d) ──▶ Frequency = %d%n", q, hashArr[q]);
        }
        System.out.println();

        // -------------------------------------------------------------
        // PART 2: Character Hashing (Lowercase & Full ASCII)
        // -------------------------------------------------------------
        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 2: CHARACTER HASHING (LOWERCASE & FULL ASCII 256)                │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
        String s = "takeuforward";
        System.out.println("Input String: \"" + s + "\"");

        // Lowercase 26-bucket mapping: index = ch - 'a'
        int[] lowerHash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lowerHash[s.charAt(i) - 'a']++;
        }

        char[] charQueries = {'a', 't', 'r', 'z'};
        System.out.println("Lowercase Alphabet Queries (index = ch - 'a'):");
        for (char c : charQueries) {
            System.out.printf("  Char '%c' ──▶ Frequency = %d%n", c, lowerHash[c - 'a']);
        }

        // Mixed ASCII 256-bucket mapping: index = (int) ch
        String mixedStr = "Striver A2Z DSA Sheet! #1";
        int[] asciiHash = new int[256];
        for (int i = 0; i < mixedStr.length(); i++) {
            asciiHash[mixedStr.charAt(i)]++;
        }
        System.out.println("ASCII 256 Queries on \"" + mixedStr + "\":");
        char[] mixedQueries = {'S', ' ', '!', '#', '2'};
        for (char c : mixedQueries) {
            System.out.printf("  Char '%c' (ASCII %d) ──▶ Frequency = %d%n", c, (int)c, asciiHash[c]);
        }
        System.out.println();

        // -------------------------------------------------------------
        // PART 3: Dynamic Map Hashing (Large & Negative Numbers)
        // -------------------------------------------------------------
        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 3: HASHMAP VS TREEMAP (HANDLING 10^9 & NEGATIVE NUMBERS)          │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
        int[] sparseArr = {1_000_000_000, -5, 1_000_000_000, 42, -5, 1_000_000_000};
        System.out.println("Sparse Input with Large/Negative Values: " + Arrays.toString(sparseArr));

        // HashMap (O(1) average time, unordered)
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int val : sparseArr) {
            hashMap.put(val, hashMap.getOrDefault(val, 0) + 1);
        }
        System.out.println("HashMap Output (Unordered):");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.printf("  Key: %12d ──▶ Count: %d%n", entry.getKey(), entry.getValue());
        }

        // TreeMap (O(log N) time, strictly sorted order)
        Map<Integer, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap Output (Sorted Ascending Keys):");
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.printf("  Key: %12d ──▶ Count: %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println();

        // -------------------------------------------------------------
        // PART 4: Homework Problem (Highest & Lowest Frequency)
        // -------------------------------------------------------------
        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 4: STRIVER HOMEWORK: HIGHEST & LOWEST FREQUENCY ELEMENT          │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
        int[] homeworkArr = {10, 5, 10, 15, 10, 5};
        System.out.println("Homework Array: " + Arrays.toString(homeworkArr));
        findHighestAndLowestFrequency(homeworkArr);
        System.out.println();

        // -------------------------------------------------------------
        // PART 5: Division Rule & Collision Simulation (Separate Chaining)
        // -------------------------------------------------------------
        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 5: DIVISION RULE & COLLISION SIMULATION: hash(k) = k % 10        │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
        int[] collisionKeys = {12, 35, 48, 22, 92, 15, 5};
        simulateDivisionHashing(collisionKeys, 10);

        System.out.println("==========================================================================");
        System.out.println("Mastery Unlocked: Step 1.4 Hashing & Maps Verified.");
        System.out.println("==========================================================================");
    }

    // Homework Problem: Find Highest and Lowest Frequency Element
    private static void findHighestAndLowestFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0, minFreq = arr.length + 1;
        int maxEle = -1, minEle = -1;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }
            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.printf("  Highest Frequency Element: %d (Frequency = %d)%n", maxEle, maxFreq);
        System.out.printf("  Lowest  Frequency Element: %d (Frequency = %d)%n", minEle, minFreq);
    }

    // Simulate Division Method Hashing with Separate Chaining
    @SuppressWarnings("unchecked")
    private static void simulateDivisionHashing(int[] keys, int tableSize) {
        List<Integer>[] table = new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new LinkedList<>();
        }

        for (int k : keys) {
            int bucket = k % tableSize;
            table[bucket].add(k);
        }

        System.out.println("Hash Table Buckets (Size = " + tableSize + "):");
        for (int i = 0; i < tableSize; i++) {
            if (!table[i].isEmpty()) {
                System.out.printf("  Bucket [%d] ──▶ %s%s%n", 
                    i, table[i], (table[i].size() > 1 ? "  <── COLLISION CHAIN!" : ""));
            }
        }
    }

    private static void printBanner() {
        System.out.println("==========================================================================");
        System.out.println("   ⚡ DETAKOZO: Step 1.4 Basic Hashing & Maps Suite (Java 21 LTS)         ");
        System.out.println("==========================================================================");
    }
}
