/**
 * Pattern 04: Right-Angled Number Pyramid - II
 */
public class Pattern04 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 04 Output for N = " + n + ":");
        printPattern(n);
    }
}
