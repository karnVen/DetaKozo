/**
 * Pattern 11: Binary Number Triangle (0/1 Alternating)
 */
public class Pattern11 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            int start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 11 Output for N = " + n + ":");
        printPattern(n);
    }
}
