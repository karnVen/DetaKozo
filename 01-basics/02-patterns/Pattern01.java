/**
 * Pattern 01: Rectangular Star Pattern
 */
public class Pattern01 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 01 Output for N = " + n + ":");
        printPattern(n);
    }
}
