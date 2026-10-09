/**
 * Pattern 17: Alpha-Hill Pattern
 */
public class Pattern17 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int totalChars = 2 * i + 1;
            int breakpoint = totalChars / 2;
            for (int j = 1; j <= totalChars; j++) {
                System.out.print(ch);
                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Pattern 17 Output for N = " + n + ":");
        printPattern(n);
    }
}
