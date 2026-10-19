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

    public static void pattern22(int n) {
        // TODO: Step 1 - Calculate total grid size (how many rows & cols for N?)
        // TODO: Step 2 - Outer loop for rows i from 0 to totalSize - 1
        // TODO: Step 3 - Inner loop for cols j from 0 to totalSize - 1
        // TODO: Step 4 - Calculate distances from 4 edges (top, bottom, left, right)
        // TODO: Step 5 - Find minimum distance and compute value to print: n - minDistance + " "
        // TODO: Step 6 - Newline after each row
                for (int i = 0 ; i < n*2; i ++){
        for ( int j =0 ; j < n*2 ; j++ ){
              if ( i ==0 || i ==n*2-1 ||j ==0 || j ==n*2-1  ){
                System.out.print(n);
            }else {
                System.out.print(" ");
            }
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