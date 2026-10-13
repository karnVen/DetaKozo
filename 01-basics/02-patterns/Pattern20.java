/**
 * Pattern 20: Symmetric Butterfly Pattern
 * TakeUForward: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-20
 * Difficulty: Hard
 * 
 * Target Output for N = 5:
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 */
public class Pattern20 {

    // ====================================================================
    // APPROACH 1: Two Halves (Upper Half + Lower Half)
    // ====================================================================
    public static void pattern20(int n) {
        // 1. UPPER HALF: Stars increase (1 -> N), Spaces decrease (2*(N-1) -> 0)
        int upspace = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = upspace; j > 0; j--) {
                System.out.print(" ");
            }
            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            upspace = upspace - 2;
            System.out.println();
        }

        // 2. LOWER HALF: Stars decrease (N-1 -> 1), Spaces increase (2 -> 2*(N-1))
        int lowspace = 2;
        for (int i = n; i > 1; i--) {
            // Left Stars
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            // Spaces
            for (int j = lowspace; j > 0; j--) {
                System.out.print(" ");
            }
            // Right Stars
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            lowspace = lowspace + 2;
            System.out.println();
        }
    }

    /*
    // ====================================================================
    // APPROACH 2 (Teacher's / Striver's Single-Loop Approach in Java):
    // Uses 1 outer loop running from 1 to 2*n - 1 with symmetry.
    // ====================================================================
    public static void print20TeacherApproach(int n) {
        int spaces = 2 * n - 2;

        // Outer loop runs for total rows: 2*n - 1
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Stars symmetry: increases till n, then decreases
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }

            // 1. Left Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // 2. Middle Spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Right Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            // Spaces decrease until middle row (i = n), then increase
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }
    */

    public static void printPattern(int n) {
        pattern20(n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 20 Output for N = " + n + ":");
        pattern20(n);
    }
}
