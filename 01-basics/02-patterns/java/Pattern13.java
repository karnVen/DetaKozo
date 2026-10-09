/**
 * Pattern 13: Increasing Number Triangle (Floyd Triangle)
 */
public class Pattern13 {
    public static void printPattern(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 13 Output for N = " + n + ":");
        printPattern(n);
    }
}
