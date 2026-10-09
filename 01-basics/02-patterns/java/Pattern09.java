/**
 * Pattern 09: Diamond Star Pattern
 */
public class Pattern09 {
    public static void printPattern(int n) {
        // Upper
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) System.out.print(" ");
            for (int st = 0; st < 2 * i + 1; st++) System.out.print("*");
            System.out.println();
        }
        // Lower
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) System.out.print(" ");
            for (int st = 0; st < 2 * (n - i) - 1; st++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 09 Output for N = " + n + ":");
        printPattern(n);
    }
}
