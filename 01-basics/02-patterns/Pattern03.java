/**
 * Pattern 03: Right-Angled Number Pyramid
 */
public class Pattern03 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 03 Output for N = " + n + ":");
        printPattern(n);
    }
}
