/**
 * Pattern 16: Alpha-Ramp Pattern
 */
public class Pattern16 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 16 Output for N = " + n + ":");
        printPattern(n);
    }
}
