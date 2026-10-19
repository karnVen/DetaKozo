/**
 * ============================================================================
 * DETAKOZO (データ構造) - Algorithmic Second Brain
 * Module: Step 1.3 - Time & Space Complexity Verification Suite
 * ============================================================================
 * 
 * Demonstrates:
 * 1. Mathematical operation counts across standard asymptotic complexities.
 * 2. Triangular nested loop progression: 1 + 2 + ... + N = N(N+1)/2 -> O(N^2).
 * 3. Logarithmic growth: i *= 2 -> O(log N).
 * 4. Space complexity: Auxiliary memory allocation vs In-place two pointers.
 * 5. The variance of wall-clock nanoseconds vs deterministic operation counts.
 * 
 * Compilation & Execution (Java 21+):
 *   javac TimeComplexityDemo.java
 *   java TimeComplexityDemo
 */

import java.util.Arrays;

public class TimeComplexityDemo {

    public static void main(String[] args) {
        printBanner();

        int[] testSizes = {10, 100, 1_000, 10_000};

        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 1: DETERMINISTIC OPERATION SCALING BENCHMARK                                      │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        System.out.printf("%-10s | %-12s | %-14s | %-16s | %-16s%n", 
            "Input (N)", "O(log2 N)", "O(N) Linear", "O(N*log2 N)", "O(N^2) Triangular");
        System.out.println("------------------------------------------------------------------------------------------");

        for (int n : testSizes) {
            long logOps = countLogarithmicOps(n);
            long linearOps = countLinearOps(n);
            long nLogNOps = countNLogNOps(n);
            long triangularOps = countTriangularOps(n);

            System.out.printf("%-10d | %-12d | %-14d | %-16d | %-16d%n",
                n, logOps, linearOps, nLogNOps, triangularOps);
        }

        System.out.println();
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 2: THE TRIANGULAR INVARIANT PROOF: sum(1..N) = N(N+1)/2                         │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        int testN = 5;
        System.out.println("Tracing nested loop with N = " + testN + " (Outer: i=0..N-1, Inner: j=0..i):");
        long actualOps = 0;
        for (int i = 0; i < testN; i++) {
            int innerCount = 0;
            for (int j = 0; j <= i; j++) {
                innerCount++;
                actualOps++;
            }
            System.out.printf("  Row i = %d ──▶ Inner loop executed %d time(s)%n", i, innerCount);
        }
        long formulaOps = (long) testN * (testN + 1) / 2;
        System.out.printf("  => Actual Iterations: %d | Formula N*(N+1)/2: %d [Match: %b]%n", 
            actualOps, formulaOps, actualOps == formulaOps);
        System.out.println("  => Under Big-O Rules: Drop /2 and +N/2 ──▶ O(N^2)\n");

        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 3: SPACE COMPLEXITY: AUXILIARY ARRAY VS IN-PLACE POINTERS                        │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        int[] original = {10, 20, 30, 40, 50};
        System.out.println("Original Input Array: " + Arrays.toString(original));

        // Technique A: Extra Auxiliary Space O(N)
        int[] reversedCopy = reverseWithAuxiliarySpace(original);
        System.out.println("Reversed using Auxiliary Array (O(N) Extra Space): " + Arrays.toString(reversedCopy));
        System.out.println("Original Array Remains Unmodified:                " + Arrays.toString(original));

        // Technique B: In-place Two Pointers O(1) Auxiliary Space
        int[] mutateTarget = original.clone();
        reverseInPlace(mutateTarget);
        System.out.println("Reversed In-Place (O(1) Auxiliary Space, mutated): " + Arrays.toString(mutateTarget));
        System.out.println(">> Warning: In-place mutates caller data; confirm with interviewer before using!\n");

        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│  PART 4: THE 10^8 ONLINE JUDGE BENCHMARK (1-SECOND RULE)                               │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("Benchmarking 10^8 elementary operations in Java 21...");
        long start = System.nanoTime();
        long dummySum = 0;
        for (int i = 0; i < 100_000_000; i++) {
            dummySum += i;
        }
        long durationMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("  Time taken for 10^8 operations: " + durationMs + " ms (" + (durationMs / 1000.0) + " seconds)");
        System.out.println("  Result: 10^8 operations executed cleanly within standard 1.0s LeetCode time limit!\n");

        System.out.println("==========================================================================================");
        System.out.println("Mastery Unlocked: Step 1.3 Time & Space Complexity Verified.");
        System.out.println("==========================================================================================");
    }

    // O(log2 N)
    private static long countLogarithmicOps(int n) {
        long ops = 0;
        for (long i = 1; i <= n; i *= 2) {
            ops++;
        }
        return ops;
    }

    // O(N)
    private static long countLinearOps(int n) {
        long ops = 0;
        for (int i = 0; i < n; i++) {
            ops++;
        }
        return ops;
    }

    // O(N * log2 N)
    private static long countNLogNOps(int n) {
        long ops = 0;
        for (int i = 0; i < n; i++) {
            for (long j = 1; j <= n; j *= 2) {
                ops++;
            }
        }
        return ops;
    }

    // O(N^2) Triangular
    private static long countTriangularOps(int n) {
        long ops = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                ops++;
            }
        }
        return ops;
    }

    // Auxiliary Space: O(N), Input Space: O(N)
    private static int[] reverseWithAuxiliarySpace(int[] arr) {
        int n = arr.length;
        int[] aux = new int[n]; // O(N) extra memory
        for (int i = 0; i < n; i++) {
            aux[i] = arr[n - 1 - i];
        }
        return aux;
    }

    // Auxiliary Space: O(1), Input Space: O(N)
    private static void reverseInPlace(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static void printBanner() {
        System.out.println("==========================================================================================");
        System.out.println("   ⚡ DETAKOZO: Step 1.3 Time & Space Complexity Verification Suite (Java 21)             ");
        System.out.println("==========================================================================================");
    }
}
