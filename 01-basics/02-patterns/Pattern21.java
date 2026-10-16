/**
 * Pattern 21: Hollow Rectangle / Square Pattern
 * TakeUForward: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-21
 * Difficulty: Easy
 * 
 * Target Output for N = 5:
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 */
public class Pattern21 {

    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern(int n) {
        pattern21(n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 21 Output for N = " + n + ":");
        pattern21(n);
    }
}