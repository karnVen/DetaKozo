/**
 * Pattern 18: Alpha-Triangle Pattern
 */
public class Pattern18 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - 1 - i); ch <= 'A' + n - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 18 Output for N = " + n + ":");
        printPattern(n);
    }
}
