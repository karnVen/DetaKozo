/**
 * Pattern 08: Inverted Star Pyramid
 */
public class Pattern08 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int st = 0; st < 2 * (n - i) - 1; st++) {
                System.out.print("*");
            }
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 08 Output for N = " + n + ":");
        printPattern(n);
    }
}
