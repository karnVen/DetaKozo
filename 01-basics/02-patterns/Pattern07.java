/**
 * Pattern 07: Star Pyramid
 */
public class Pattern07 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int st = 0; st < 2 * i + 1; st++) {
                System.out.print("*");
            }
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 07 Output for N = " + n + ":");
        printPattern(n);
    }
}
