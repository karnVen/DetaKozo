<div align="center">

# 🧮 Striver A2Z DSA • Step 1.5: Basic Maths for DSA
### *The Definitive Algorithmic Number Theory, Digit Manipulation & Euclidean Foundations*

[![Course Track](https://img.shields.io/badge/Course-Striver's_A2Z_DSA-FF5722?style=for-the-badge&logo=codeforces&logoColor=white)](https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet)
[![Video Tutorial](https://img.shields.io/badge/YouTube-Striver_TUF_Lecture-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://www.youtube.com/watch?v=1xNbjMdbjug)
[![Language](https://img.shields.io/badge/Language-Java_21_LTS-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Obsidian Ready](https://img.shields.io/badge/Obsidian-Second_Brain_Ready-7C3AED?style=for-the-badge&logo=obsidian&logoColor=white)](https://obsidian.md)
[![Status](https://img.shields.io/badge/Mastery-Complete_(100%25)-10B981?style=for-the-badge&logo=target&logoColor=white)](#)

<p align="center">
  <b>No random tricks. Pure number theory, place-value invariants, and asymptotic optimization.</b><br>
  Transforming naive $O(N)$ brute-force scans into logarithmic $O(\log_{10} N)$ and sub-linear $O(\sqrt{N})$ mathematical algorithms.<br>
  Based on <b>Striver's A2Z DSA Lecture (takeUforward)</b>, engineered for the <b>AI-bou</b> second brain.
</p>

---

[⚡ Master Mental Models](../../00-DSA-Roadmap-and-Mental-Models.md) • [⏱️ Time & Space Complexity](../03-time-complexity/README.md) • [🗄️ Hashing & Maps](../04-hashing/README.md) • [💻 Java Verification Suite](./BasicMathsDemo.java) • [🏠 Root DetaKozo](../../README.md)

---

</div>

## 📌 Table of Contents
1. [The Foundational Operators: Modulo (%) and Division (/)](#1-the-foundational-operators-modulo--and-division-)
   - [The Decimal Place-Value Shift Mental Model](#the-decimal-place-value-shift-mental-model)
   - [Asymptotic Proof: Why Loop Runs in O(log₁₀ N)](#asymptotic-proof-why-loop-runs-in-olog-n)
2. [Problem 1: Count Digits](#2-problem-1-count-digits)
   - [Approach 1: Iterative Extraction ($O(\log_{10} N)$)](#approach-1-iterative-extraction-olog_10-n)
   - [Approach 2: The Logarithmic Shortcut ($O(1)$)](#approach-2-the-logarithmic-shortcut-o1)
3. [Problem 2: Reverse a Number](#3-problem-2-reverse-a-number)
   - [The Shift-and-Add Algorithm](#the-shift-and-add-algorithm)
   - [The 32-bit Integer Overflow Hazard (LeetCode 7 Deep Dive)](#the-32-bit-integer-overflow-hazard-leetcode-7-deep-dive)
4. [Problem 3: Check Palindrome Number](#4-problem-3-check-palindrome-number)
   - [Preservation Invariant & Negative Number Axiom](#preservation-invariant--negative-number-axiom)
5. [Problem 4: Armstrong Numbers (Narcissistic Numbers)](#5-problem-4-armstrong-numbers-narcissistic-numbers)
   - [Mathematical Definition & General $k$-Digit Formulation](#mathematical-definition--general-k-digit-formulation)
6. [Problem 5: Print All Divisors (Factorization)](#6-problem-5-print-all-divisors-factorization)
   - [The Brute Force Fallacy ($O(N)$)](#the-brute-force-fallacy-on)
   - [The Square Root Symmetry Theorem ($O(\sqrt{N})$)](#the-square-root-symmetry-theorem-osqrtn)
7. [Problem 6: Check for Prime Number](#7-problem-6-check-for-prime-number)
   - [Exact Divisor Counting vs Early Termination](#exact-divisor-counting-vs-early-termination)
8. [Problem 7: GCD / HCF & The Euclidean Algorithm](#8-problem-7-gcd--hcf--the-euclidean-algorithm)
   - [Brute Force Scan vs Subtraction Theorem](#brute-force-scan-vs-subtraction-theorem)
   - [Modern Modulo Euclidean Algorithm ($O(\log_\phi(\min(A, B)))$)](#modern-modulo-euclidean-algorithm-olog_phimina-b)
   - [The LCM-GCD Fundamental Product Law](#the-lcm-gcd-fundamental-product-law)
9. [Master Complexity & Cheat Sheet Matrix](#9-master-complexity--cheat-sheet-matrix)
10. [Interview Self-Defense & Edge-Case Traps](#10-interview-self-defense--edge-case-traps)

---

## 1. The Foundational Operators: Modulo (%) and Division (/)

Every digit extraction algorithm in computer science relies on two foundational arithmetic operations under **Base-10 (Decimal Numeral System)**:

```
                  ┌─────────────────────────────────────────┐
                  │          DECIMAL NUMBER: N = 7789       │
                  └────────────────────┬────────────────────┘
                                       │
            ┌──────────────────────────┴──────────────────────────┐
            ▼                                                     ▼
┌─────────────────────────┐                           ┌─────────────────────────┐
│   EXTRACT LAST DIGIT    │                           │    REMOVE LAST DIGIT    │
│       N % 10            │                           │         N / 10          │
├─────────────────────────┤                           ├─────────────────────────┤
│    7789 % 10 = 9        │                           │    7789 / 10 = 778      │
│  (Yields units place)   │                           │ (Integer truncation)    │
└─────────────────────────┘                           └─────────────────────────┘
```

### The Decimal Place-Value Shift Mental Model

Any decimal number $N$ is algebraically expanded as powers of 10:
$$N = d_k \cdot 10^k + d_{k-1} \cdot 10^{k-1} + \dots + d_1 \cdot 10^1 + d_0 \cdot 10^0$$

1. **Extraction ($N \pmod{10}$)**:
   Every term with $10^m$ ($m \ge 1$) is an exact multiple of 10. Thus, taking $\pmod{10}$ annihilates all higher terms and isolates $d_0$:
   $$N \pmod{10} = d_0$$
2. **Reduction ($N / 10$)**:
   Integer division shifts every digit one position to the right. $d_0$ is truncated into the decimal fractional remainder and discarded:
   $$\lfloor N / 10 \rfloor = d_k \cdot 10^{k-1} + \dots + d_1 \cdot 10^0$$

### Asymptotic Proof: Why Loop Runs in $O(\log_{10} N)$

When executing the standard digit-extraction loop:
```java
while (n > 0) {
    int lastDigit = n % 10;
    // process lastDigit
    n = n / 10;
}
```

> [!IMPORTANT]
> **Mathematical Complexity Derivation:**
> At each step, $N$ is divided by $10$. After $k$ iterations, the remaining value is:
> $$\frac{N}{10^k}$$
> The loop terminates when the value drops to $0$, meaning $\frac{N}{10^k} < 1 \implies 10^k > N$.
> Taking the base-10 logarithm on both sides:
> $$k > \log_{10}(N) \implies k = \lfloor \log_{10} N \rfloor + 1$$
> **Time Complexity:** $O(\log_{10} N)$ (which is strictly proportional to the number of digits in $N$).  
> **Space Complexity:** $O(1)$ auxiliary memory.

---

## 2. Problem 1: Count Digits

### Problem Statement
Given an integer $N$, return the total count of digits present in $N$.

### Approach 1: Iterative Extraction ($O(\log_{10} N)$)
Continuously chop off the last digit while maintaining an incrementing counter:

```java
public static int countDigitsIterative(int n) {
    if (n == 0) return 1; // Edge case
    n = Math.abs(n);      // Handle negative inputs
    int count = 0;
    while (n > 0) {
        count++;
        n = n / 10;
    }
    return count;
}
```
* **Time Complexity:** $O(\log_{10} N)$
* **Space Complexity:** $O(1)$

### Approach 2: The Logarithmic Shortcut ($O(1)$)
From our mathematical derivation above, the number of digits of any positive integer $N$ is given directly by:
$$\text{digits}(N) = \lfloor \log_{10} N \rfloor + 1$$

```java
public static int countDigitsOptimal(int n) {
    if (n == 0) return 1;
    return (int) (Math.log10(Math.abs(n))) + 1;
}
```
* **Time Complexity:** $O(1)$ (direct hardware floating-point instruction).
* **Space Complexity:** $O(1)$.

---

## 3. Problem 2: Reverse a Number

### Problem Statement
Given an integer $N$, reverse its digits (e.g., $1234 \to 4321$, $7789 \to 9877$).

### The Shift-and-Add Algorithm
How do you build a number backward?
At each step, you must **shift** the previously reversed number one place to the left ($\times 10$) and **add** the newly extracted digit ($+ \text{lastDigit}$):

```
Step 0: rev = 0
Step 1: n = 7789 ──▶ lastDigit = 9 ──▶ rev = (0 * 10) + 9       = 9
Step 2: n = 778  ──▶ lastDigit = 8 ──▶ rev = (9 * 10) + 8       = 98
Step 3: n = 77   ──▶ lastDigit = 7 ──▶ rev = (98 * 10) + 7      = 987
Step 4: n = 7    ──▶ lastDigit = 7 ──▶ rev = (987 * 10) + 7     = 9877
Step 5: n = 0    ──▶ Loop Terminates. Result = 9877.
```

### The 32-bit Integer Overflow Hazard (LeetCode 7 Deep Dive)

> [!CAUTION]
> **The Integer Overflow Trap:**
> In Java and C++, a standard signed 32-bit `int` spans:
> $$[-2^{31}, 2^{31} - 1] = [-2,147,483,648, 2,147,483,647]$$
> If $N = 1,534,236,469$, reversing it produces $9,646,324,351$, which exceeds `Integer.MAX_VALUE` and wraps around to negative garbage!

#### Standard Production-Grade Solution (Pre-multiplication check):
```java
public static int reverse(int n) {
    int rev = 0;
    while (n != 0) {
        int lastDigit = n % 10;
        
        // Overflow guards before multiplying by 10
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
```
* **Time Complexity:** $O(\log_{10} N)$
* **Space Complexity:** $O(1)$

---

## 4. Problem 3: Check Palindrome Number

### Problem Statement
An integer is a **palindrome** if it reads identically forwards and backwards (e.g., $121 \to 121$ is `true`, $123 \to 321$ is `false`).

```
Original:  1   2   3   2   1
           ▲               ▲
           │               │
Reversed:  1   2   3   2   1  ──▶ (Original == Reversed) ──▶ PALINDROME!
```

### The Preservation Invariant
Because the standard extraction loop progressively destroys $N$ (reducing it to $0$), you **must** preserve a backup copy of the original number before the loop begins:

```java
public static boolean isPalindrome(int n) {
    // Negative numbers cannot be palindromes (e.g., -121 reversed is 121-)
    if (n < 0) return false;
    // Numbers ending in 0 (except 0 itself) cannot be palindromes (e.g., 10 reversed is 01 = 1)
    if (n % 10 == 0 && n != 0) return false;

    int original = n;
    int rev = 0;
    while (n > 0) {
        rev = (rev * 10) + (n % 10);
        n /= 10;
    }
    return original == rev;
}
```
* **Time Complexity:** $O(\log_{10} N)$
* **Space Complexity:** $O(1)$

---

## 5. Problem 4: Armstrong Numbers (Narcissistic Numbers)

### Problem Statement
An **Armstrong number** (also called a Pluperfect Digital Invariant or Narcissistic Number) of $k$ digits is a number equal to the sum of each of its digits raised to the power of $k$:
$$N = \sum_{i=1}^{k} (d_i)^k$$

### Canonical Examples:
* **$N = 153$** ($k = 3$ digits):
  $$1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 \quad \text{(✅ TRUE)}$$
* **$N = 1634$** ($k = 4$ digits):
  $$1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634 \quad \text{(✅ TRUE)}$$
* **$N = 371$** ($k = 3$ digits):
  $$3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371 \quad \text{(✅ TRUE)}$$
* **$N = 35$** ($k = 2$ digits):
  $$3^2 + 5^2 = 9 + 25 = 34 \neq 35 \quad \text{(❌ FALSE)}$$

### Clean Java Implementation:
```java
public static boolean isArmstrong(int n) {
    if (n < 0) return false;
    int original = n;
    
    // Step 1: Calculate total digit count k in O(1)
    int k = (n == 0) ? 1 : (int) Math.log10(n) + 1;
    
    // Step 2: Sum each digit raised to power k
    int sum = 0;
    int temp = n;
    while (temp > 0) {
        int d = temp % 10;
        sum += Math.pow(d, k);
        temp /= 10;
    }
    
    return sum == original;
}
```
* **Time Complexity:** $O(\log_{10} N)$
* **Space Complexity:** $O(1)$

---

## 6. Problem 5: Print All Divisors (Factorization)

### Problem Statement
Given an integer $N$, find and return/print all positive integers that divide $N$ without leaving a remainder.

### The Brute Force Fallacy ($O(N)$)
```java
// BRUTE FORCE: Checks every single integer from 1 to N
for (int i = 1; i <= n; i++) {
    if (n % i == 0) System.out.print(i + " ");
}
```
> [!WARNING]
> If $N = 10^9$, this loop executes $10^9$ iterations. At $10^8$ operations/sec on modern online judges, this takes **10 seconds**, triggering a **TLE (Time Limit Exceeded)** crash.

### The Square Root Symmetry Theorem ($O(\sqrt{N})$)

Every divisor $i$ of $N$ has a unique corresponding quotient partner:
$$i \times \left(\frac{N}{i}\right) = N$$

Let's inspect the divisors of $N = 36$:

```
Divisor Pairs for N = 36:
   1 × 36 = 36
   2 × 18 = 36
   3 × 12 = 36
   4 × 9  = 36
── 6 × 6  = 36 ──◀ INFLECTION POINT: i = sqrt(N) = 6
   9 × 4  = 36   (Mirrored duplicate)
  12 × 3  = 36   (Mirrored duplicate)
  18 × 2  = 36   (Mirrored duplicate)
  36 × 1  = 36   (Mirrored duplicate)
```

> [!TIP]
> **Key Insight:**
> Beyond $i = \sqrt{N}$, the factor pairs are identical mirror reflections of the pairs found before $\sqrt{N}$.  
> Therefore, **we only ever need to iterate up to $\sqrt{N}$!**

```java
public static List<Integer> getAllDivisors(int n) {
    List<Integer> divisors = new ArrayList<>();
    
    // Iterate only up to sqrt(N)
    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            divisors.add(i);
            // Add partner divisor if it's distinct (avoids duplicate 6 in 36)
            if (i != n / i) {
                divisors.add(n / i);
            }
        }
    }
    Collections.sort(divisors); // O(d log d) where d is total divisors
    return divisors;
}
```
* **Loop Iterations:** Exactly $\lfloor\sqrt{N}\rfloor$.
* **For $N = 10^9$:** $\sqrt{10^9} \approx 31,622$ iterations $\to$ **Executes in 0.001 seconds!**

---

## 7. Problem 6: Check for Prime Number

### Problem Statement
A number $N > 1$ is **prime** if and only if it has **strictly two distinct factors**: $1$ and $N$.

### Exact Divisor Counting vs Early Termination

Applying the square root theorem: if $N$ has any factor other than $1$ and itself, **at least one factor must be $\le \sqrt{N}$**.

```java
public static boolean isPrime(int n) {
    if (n <= 1) return false; // 0 and 1 are neither prime nor composite
    
    // Check if any number from 2 to sqrt(N) divides N
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false; // Found a factor -> Immediately Composite!
        }
    }
    return true; // No factors found -> Guaranteed Prime!
}
```
* **Time Complexity:** $O(\sqrt{N})$
* **Space Complexity:** $O(1)$

---

## 8. Problem 7: GCD / HCF & The Euclidean Algorithm

### Problem Statement
Find the **Greatest Common Divisor (GCD)** (or Highest Common Factor, HCF) of two integers $A$ and $B$ — the largest integer $g$ such that $A \pmod g = 0$ and $B \pmod g = 0$.

### Brute Force Scan vs Subtraction Theorem
* **Brute Force:** Scan down from $\min(A, B)$ to $1$. Takes $O(\min(A, B))$. For $\gcd(10^9, 10^9 - 1)$, takes $10^9$ operations $\to$ TLE.
* **Euclidean Subtraction Theorem (Euclid, ~300 BC):**
  $$\gcd(A, B) = \gcd(A - B, B) \quad (\text{for } A > B)$$
  *Proof Intuition:* If a number $g$ divides both $A$ and $B$, it must also evenly divide their difference $A - B$.

### Modern Modulo Euclidean Algorithm ($O(\log_\phi(\min(A, B)))$)

Repeated subtraction is literally the definition of division modulo! Instead of subtracting $B$ from $A$ one by one, take $A \pmod B$ in a single CPU cycle:
$$\gcd(A, B) = \gcd(B, A \pmod B)$$

```
Trace of gcd(52, 10):
Step 1: 52 % 10 = 2  ──▶ gcd(10, 2)
Step 2: 10 % 2  = 0  ──▶ gcd(2, 0)
Step 3: One operand is 0! The other operand (2) is the GCD!
```

```java
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
```

> [!NOTE]
> **Why the Complexity is $O(\log_\phi(\min(A, B)))$:**
> In every two successive iterations of the modulo reduction, the smaller number decreases by **at least half** ($A \pmod B < A / 2$).
> The theoretical worst-case input for Euclid's algorithm is **consecutive Fibonacci numbers** (e.g., $F_{n+1}$ and $F_n$), which yields the golden ratio base $\phi \approx 1.618$.
> **Max iterations for two $10^9$ numbers:** $\le 45$ steps!

### The LCM-GCD Fundamental Product Law
For any two positive integers $A$ and $B$:
$$A \times B = \text{GCD}(A, B) \times \text{LCM}(A, B)$$
$$\implies \mathbf{\text{LCM}(A, B) = \frac{A \times B}{\text{GCD}(A, B)}}$$

*(Always divide first to prevent integer overflow: `(a / gcd(a, b)) * b`)*.

---

## 9. Master Complexity & Cheat Sheet Matrix

| Problem | Naive Time | Optimal Time | Optimal Space | Mathematical Invariant |
| :--- | :---: | :---: | :---: | :--- |
| **Count Digits** | $O(\log_{10} N)$ | **$O(1)$** | $O(1)$ | $\lfloor \log_{10} N \rfloor + 1$ |
| **Reverse Number** | $O(\log_{10} N)$ | **$O(\log_{10} N)$** | $O(1)$ | `rev = rev * 10 + (n % 10)` with 32-bit overflow guard |
| **Check Palindrome** | $O(\log_{10} N)$ | **$O(\log_{10} N)$** | $O(1)$ | Backup original; `rev == original` (negatives are `false`) |
| **Armstrong Number** | $O(\log_{10} N)$ | **$O(\log_{10} N)$** | $O(1)$ | $\sum (d_i)^k == N$ where $k = \lfloor \log_{10} N \rfloor + 1$ |
| **Print All Divisors** | $O(N)$ | **$O(\sqrt{N})$** | $O(d)$ | Factor pair symmetry: $i \times (N/i) = N$ up to $\sqrt{N}$ |
| **Check for Prime** | $O(N)$ | **$O(\sqrt{N})$** | $O(1)$ | Early exit: if $N \pmod i == 0$ in $[2, \sqrt{N}]$, composite |
| **GCD / HCF** | $O(\min(A, B))$ | **$O(\log(\min(A, B)))$** | $O(1)$ | Euclidean Modulo Invariant: $\gcd(a, b) = \gcd(b, a \pmod b)$ |

---

## 10. Interview Self-Defense & Edge-Case Traps

```
┌──────────────────────────────────────────┬────────────────────────────────────────────────────────┐
│ Trap Scenario                            │ Engineering Defense                                    │
├──────────────────────────────────────────┼────────────────────────────────────────────────────────┤
│ Input N = 0 in Count Digits              │ Math.log10(0) is -Infinity! Return 1 explicitly.       │
├──────────────────────────────────────────┼────────────────────────────────────────────────────────┤
│ Negative Number in Palindrome            │ -121 reversed is 121- -> Immediately return false.     │
├──────────────────────────────────────────┼────────────────────────────────────────────────────────┤
│ Perfect Square in Divisor Extraction     │ If i == n/i (e.g. 6 in 36), add it only once!          │
├──────────────────────────────────────────┼────────────────────────────────────────────────────────┤
│ Primes <= 1                              │ 0 and 1 are NEITHER prime nor composite. Return false. │
├──────────────────────────────────────────┼────────────────────────────────────────────────────────┤
│ Integer Overflow during LCM              │ Compute (a / gcd(a, b)) * b instead of (a * b) / gcd.  │
└──────────────────────────────────────────┴────────────────────────────────────────────────────────┘
```