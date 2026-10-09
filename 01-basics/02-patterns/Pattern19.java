/**
 * Pattern 19: Symmetric Void Pattern
 * TakeUForward: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-19
 * Difficulty: Hard
 * 
 * Target Output for N = 5:
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 */
public class Pattern19 {
    public static void printPattern(int n) {
        // ====================================================================
        // 1. UPPER HALF: Stars decrease (N -> 1), Spaces increase (0 -> 2*(N-1))
        // ====================================================================
        int initialSpaces = 0;
        for (int i = 0; i < n; i++) {
            // Left Stars (N - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // Middle Spaces
            for (int j = 1; j <= initialSpaces; j++) {
                System.out.print(" ");
            }
            // Right Stars (N - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            initialSpaces += 2; // Increase space count for next row
            System.out.println();
        }

        // ====================================================================
        // 2. LOWER HALF: Stars increase (1 -> N), Spaces decrease (2*(N-1) -> 0)
        // ====================================================================
        int lowerSpaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // Left Stars (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle Spaces
            for (int j = 1; j <= lowerSpaces; j++) {
                System.out.print(" ");
            }
            // Right Stars (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            lowerSpaces -= 2; // Decrease space count for next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 19 Output for N = " + n + ":");
        printPattern(n);
    }
}
