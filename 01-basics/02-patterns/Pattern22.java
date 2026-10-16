/**
 * Pattern 22: The Number Pattern (Concentric Matrix / Number Spiral)
 * TakeUForward: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-22
 * Difficulty: Hard
 * 
 * Target Output for N = 5:
 * 5 5 5 5 5 5 5 5 5 
 * 5 4 4 4 4 4 4 4 5 
 * 5 4 3 3 3 3 3 4 5 
 * 5 4 3 2 2 2 3 4 5 
 * 5 4 3 2 1 2 3 4 5 
 * 5 4 3 2 2 2 3 4 5 
 * 5 4 3 3 3 3 3 4 5 
 * 5 4 4 4 4 4 4 4 5 
 * 5 5 5 5 5 5 5 5 5 
 */
public class Pattern22 {

    /**
     * Prints concentric square number matrix of size (2*n - 1) x (2*n - 1).
     * 
     * Formula:
     * Value at (i, j) = n - min(distance to top, bottom, left, right)
     */
    public static void pattern22(int n) {
        int totalSize = 2 * n - 1;

        // Outer loop for rows
        for (int i = 0; i < totalSize; i++) {
            // Inner loop for columns
            for (int j = 0; j < totalSize; j++) {
                // Distance to each of the 4 outer borders
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;

                // Minimum distance from any edge defines which concentric ring (i, j) belongs to
                int minDist = Math.min(Math.min(top, down), Math.min(left, right));

                // Layer value is n - minDist
                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern(int n) {
        pattern22(n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 22 Output for N = " + n + ":");
        pattern22(n);
    }
}