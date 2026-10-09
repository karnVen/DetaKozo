/**
 * Pattern 12: Number Crown Pattern
 */
public class Pattern12 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Pattern 12 Output for N = " + n + ":");
        printPattern(n);
    }
}
