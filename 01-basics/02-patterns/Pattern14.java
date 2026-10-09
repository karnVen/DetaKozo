/**
 * Pattern 14: Increasing Letter Triangle
 */
public class Pattern14 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 14 Output for N = " + n + ":");
        printPattern(n);
    }
}
