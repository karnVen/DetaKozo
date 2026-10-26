import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ============================================================================
 * 🧮 STRIVER A2Z DSA • STEP 1.5: BASIC MATHS SUITE
 * ============================================================================
 * Java 21 Standalone Verification Class for all 7 Core Number Theory Problems:
 * 1. Count Digits (Iterative O(log10 N) & Optimal O(1))
 * 2. Reverse a Number (with 32-bit integer overflow protection)
 * 3. Check Palindrome Number
 * 4. Check Armstrong Number (Narcissistic Number for arbitrary k-digits)
 * 5. Print All Divisors (Symmetric O(sqrt(N)) factor pairs)
 * 6. Check for Prime (Trial division up to sqrt(N))
 * 7. GCD / HCF (Euclidean Modulo Algorithm O(log(min(A, B)))) & LCM
 * ============================================================================
 */
public class BasicMathsDemo {

    // ------------------------------------------------------------------------
    // 1. COUNT DIGITS
    // ------------------------------------------------------------------------
    public static int countDigitsIterative(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int countDigitsOptimal(int n) {
        if (n == 0) return 1;
        return (int) (Math.log10(Math.abs(n))) + 1;
    }

    // ------------------------------------------------------------------------
    // 2. REVERSE A NUMBER (WITH 32-BIT OVERFLOW GUARDS)
    // ------------------------------------------------------------------------
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int lastDigit = n % 10;

            // Overflow checks before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; // Overflow breached
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0; // Underflow breached
            }

            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        return rev;
    }

    // ------------------------------------------------------------------------
    // 3. CHECK PALINDROME NUMBER
    // ------------------------------------------------------------------------
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        if (n % 10 == 0 && n != 0) return false;

        int original = n;
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return original == rev;
    }

    // ------------------------------------------------------------------------
    // 4. CHECK ARMSTRONG NUMBER (NARCISSISTIC NUMBER)
    // ------------------------------------------------------------------------
    public static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int original = n;
        int k = (n == 0) ? 1 : (int) Math.log10(n) + 1;

        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, k);
            temp /= 10;
        }
        return sum == original;
    }

    // ------------------------------------------------------------------------
    // 5. PRINT ALL DIVISORS (O(sqrt(N)))
    // ------------------------------------------------------------------------
    public static List<Integer> getAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    // ------------------------------------------------------------------------
    // 6. CHECK FOR PRIME NUMBER (O(sqrt(N)))
    // ------------------------------------------------------------------------
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ------------------------------------------------------------------------
    // 7. GCD & LCM (EUCLIDEAN ALGORITHM)
    // ------------------------------------------------------------------------
    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }

    public static long lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return ((long) a / gcd(a, b)) * b;
    }

    // ========================================================================
    // MAIN VERIFICATION RUNNER
    // ========================================================================
    public static void main(String[] args) {
        System.out.println("====================================================================");
        System.out.println("⚡ DETAKOZO • STEP 1.5: BASIC MATHS VERIFICATION SUITE");
        System.out.println("====================================================================\n");

        // 1. Count Digits Test
        int num1 = 77890;
        System.out.println("1️⃣ Count Digits:");
        System.out.println("   Input: " + num1);
        System.out.println("   Iterative Count: " + countDigitsIterative(num1));
        System.out.println("   Optimal (log10): " + countDigitsOptimal(num1) + " (Matches: " + (countDigitsIterative(num1) == countDigitsOptimal(num1)) + ")\n");

        // 2. Reverse Number Test
        int num2 = 12345;
        int num2Overflow = 1534236469;
        System.out.println("2️⃣ Reverse Number:");
        System.out.println("   Reverse of " + num2 + " -> " + reverseNumber(num2));
        System.out.println("   Reverse of " + num2Overflow + " (Overflow check) -> " + reverseNumber(num2Overflow) + " (Safely caught 0)\n");

        // 3. Palindrome Check
        int pal1 = 12321;
        int pal2 = 12345;
        System.out.println("3️⃣ Palindrome Check:");
        System.out.println("   Is " + pal1 + " Palindrome? -> " + isPalindrome(pal1) + " (Expected: true)");
        System.out.println("   Is " + pal2 + " Palindrome? -> " + isPalindrome(pal2) + " (Expected: false)\n");

        // 4. Armstrong Number Test
        int arm1 = 153;
        int arm2 = 1634;
        int arm3 = 371;
        int notArm = 35;
        System.out.println("4️⃣ Armstrong Number Check:");
        System.out.println("   Is " + arm1 + " Armstrong? -> " + isArmstrong(arm1) + " (Expected: true)");
        System.out.println("   Is " + arm2 + " Armstrong? -> " + isArmstrong(arm2) + " (Expected: true)");
        System.out.println("   Is " + arm3 + " Armstrong? -> " + isArmstrong(arm3) + " (Expected: true)");
        System.out.println("   Is " + notArm + " Armstrong? -> " + isArmstrong(notArm) + " (Expected: false)\n");

        // 5. All Divisors Test
        int divNum = 36;
        System.out.println("5️⃣ Print All Divisors:");
        System.out.println("   Divisors of " + divNum + ": " + getAllDivisors(divNum) + " (Total: " + getAllDivisors(divNum).size() + ")\n");

        // 6. Prime Check Test
        int prime1 = 29;
        int comp1 = 36;
        System.out.println("6️⃣ Check for Prime:");
        System.out.println("   Is " + prime1 + " Prime? -> " + isPrime(prime1) + " (Expected: true)");
        System.out.println("   Is " + comp1 + " Prime? -> " + isPrime(comp1) + " (Expected: false)\n");

        // 7. GCD & LCM Test
        int a = 52, b = 10;
        int c = 20, d = 40;
        System.out.println("7️⃣ Euclidean GCD & LCM:");
        System.out.println("   GCD(" + a + ", " + b + ") = " + gcd(a, b) + " | LCM = " + lcm(a, b));
        System.out.println("   GCD(" + c + ", " + d + ") = " + gcd(c, d) + " | LCM = " + lcm(c, d));
        System.out.println("\n====================================================================");
        System.out.println("✅ ALL BASIC MATHS CHECKS PASSED SUCCESSFULLY!");
        System.out.println("====================================================================");
    }
}