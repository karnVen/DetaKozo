import java.util.Scanner;

/**
 * ============================================================================
 * ?? Striver A2Z DSA ? Step 1.2: Patterns 01 to 18 (Java Implementation)
 * 
 * ?? The 4 Golden Rules:
 * 1. Outer Loop = Rows (count total rows).
 * 2. Inner Loop(s) = Spaces, Numbers, Characters, Stars.
 * 3. Math Relation: Link row index `i` with column count / values.
 * 4. Newline: System.out.println() after each row finishes.
 * ============================================================================
 */
public class Patterns_1_to_18 {

    // ------------------------------------------------------------------------
    // Pattern 01: Rectangular Star Pattern
    // ------------------------------------------------------------------------
    public static void pattern1(int n) {
        System.out.println("\n--- Pattern 01: Rectangular Star Pattern (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 02: Right-Angled Triangle Pattern
    // ------------------------------------------------------------------------
    public static void pattern2(int n) {
        System.out.println("\n--- Pattern 02: Right-Angled Triangle (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 03: Right-Angled Number Pyramid
    // ------------------------------------------------------------------------
    public static void pattern3(int n) {
        System.out.println("\n--- Pattern 03: Right-Angled Number Pyramid (N = " + n + ") ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 04: Right-Angled Number Pyramid - II
    // ------------------------------------------------------------------------
    public static void pattern4(int n) {
        System.out.println("\n--- Pattern 04: Right-Angled Number Pyramid - II (N = " + n + ") ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 05: Inverted Right Pyramid
    // ------------------------------------------------------------------------
    public static void pattern5(int n) {
        System.out.println("\n--- Pattern 05: Inverted Right Pyramid (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 06: Inverted Numbered Right Pyramid
    // ------------------------------------------------------------------------
    public static void pattern6(int n) {
        System.out.println("\n--- Pattern 06: Inverted Numbered Right Pyramid (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 07: Star Pyramid (Centered Equilateral)
    // Spaces: n - i - 1 | Stars: 2 * i + 1 | Spaces: n - i - 1
    // ------------------------------------------------------------------------
    public static void pattern7(int n) {
        System.out.println("\n--- Pattern 07: Star Pyramid (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            // Leading Spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            // Stars
            for (int st = 0; st < 2 * i + 1; st++) {
                System.out.print("*");
            }
            // Trailing Spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 08: Inverted Star Pyramid
    // Spaces: i | Stars: 2 * (n - i) - 1 | Spaces: i
    // ------------------------------------------------------------------------
    public static void pattern8(int n) {
        System.out.println("\n--- Pattern 08: Inverted Star Pyramid (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            // Leading Spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            // Stars
            for (int st = 0; st < 2 * (n - i) - 1; st++) {
                System.out.print("*");
            }
            // Trailing Spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 09: Diamond Star Pattern (Pattern 7 + Pattern 8)
    // ------------------------------------------------------------------------
    public static void pattern9(int n) {
        System.out.println("\n--- Pattern 09: Diamond Star Pattern (N = " + n + ") ---");
        // Upper Half
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) System.out.print(" ");
            for (int st = 0; st < 2 * i + 1; st++) System.out.print("*");
            System.out.println();
        }
        // Lower Half
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) System.out.print(" ");
            for (int st = 0; st < 2 * (n - i) - 1; st++) System.out.print("*");
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 10: Half Diamond Star Pattern
    // Total Rows = 2 * n - 1
    // ------------------------------------------------------------------------
    public static void pattern10(int n) {
        System.out.println("\n--- Pattern 10: Half Diamond Star Pattern (N = " + n + ") ---");
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 11: Binary Number Triangle (0/1 Alternating)
    // If row + col is even -> 1, else -> 0 (or start toggle)
    // ------------------------------------------------------------------------
    public static void pattern11(int n) {
        System.out.println("\n--- Pattern 11: Binary Number Triangle (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            int start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start; // Toggle between 1 and 0
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 12: Number Crown Pattern
    // Left Numbers (1..i), Spaces 2*(n-i), Right Numbers (i..1)
    // ------------------------------------------------------------------------
    public static void pattern12(int n) {
        System.out.println("\n--- Pattern 12: Number Crown Pattern (N = " + n + ") ---");
        for (int i = 1; i <= n; i++) {
            // Left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Spaces
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }
            // Right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 13: Increasing Number Triangle (Floyd's Triangle)
    // ------------------------------------------------------------------------
    public static void pattern13(int n) {
        System.out.println("\n--- Pattern 13: Increasing Number Triangle (N = " + n + ") ---");
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 14: Increasing Letter Triangle
    // ------------------------------------------------------------------------
    public static void pattern14(int n) {
        System.out.println("\n--- Pattern 14: Increasing Letter Triangle (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 15: Reverse Letter Triangle
    // ------------------------------------------------------------------------
    public static void pattern15(int n) {
        System.out.println("\n--- Pattern 15: Reverse Letter Triangle (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 16: Alpha-Ramp Pattern
    // ------------------------------------------------------------------------
    public static void pattern16(int n) {
        System.out.println("\n--- Pattern 16: Alpha-Ramp Pattern (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 17: Alpha-Hill Pattern
    // Spaces: n - i - 1 | Letters up then down | Spaces: n - i - 1
    // ------------------------------------------------------------------------
    public static void pattern17(int n) {
        System.out.println("\n--- Pattern 17: Alpha-Hill Pattern (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            // Leading Spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            // Characters (Increase up to midpoint, then decrease)
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
            // Trailing Spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Pattern 18: Alpha-Triangle Pattern
    // Starts from ('A' + n - 1 - i) up to ('A' + n - 1)
    // ------------------------------------------------------------------------
    public static void pattern18(int n) {
        System.out.println("\n--- Pattern 18: Alpha-Triangle Pattern (N = " + n + ") ---");
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - 1 - i); ch <= 'A' + n - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------------------
    // Main Runner / Tester
    // ------------------------------------------------------------------------
    public static void main(String[] args) {
        int n = 5;
        System.out.println("==================================================");
        System.out.println("   ?? STRIVER A2Z DSA: PATTERNS 1 TO 18 IN JAVA   ");
        System.out.println("==================================================");

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(4);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(4);
        pattern18(n);
    }
}
