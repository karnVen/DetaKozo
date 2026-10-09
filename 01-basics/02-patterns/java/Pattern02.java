/**
 * Pattern 02: Right-Angled Triangle Pattern
 */
public class Pattern02 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 02 Output for N = " + n + ":");
        printPattern(n);
    }
}
