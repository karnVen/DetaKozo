# ? Striver A2Z DSA ? Patterns 01 to 18 (Java Guide & Solutions)

> **AI-bou Tutoring Philosophy**: We understand the visual structure, deduce the row-to-column formula, and construct clean, readable Java code.

---

## ?? Master Framework (The 4 Golden Rules)
1. **Outer Loop**: Determines the number of rows ($i$).
2. **Inner Loop(s)**: Handles components per row (spaces, characters, numbers, asterisks).
3. **Mathematical Relationship**: Link row index $i$ to column iterations.
4. **Row Termination**: Output `System.out.println()` after inner loop(s) finish.

---

## ?? Pattern 01: Rectangular Star Pattern

### ?? Visual Target ($N = 5$)
```text
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

### ?? Logic Breakdown
- **Outer loop ($i$)**: Runs $N$ times ($0$ to $N-1$).
- **Inner loop ($j$)**: In each row, prints $N$ stars ($0$ to $N-1$).
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern1(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 02: Right-Angled Triangle

### ?? Visual Target ($N = 5$)
```text
*
* *
* * *
* * * *
* * * * *
```

### ?? Logic Breakdown
- **Outer loop ($i$)**: Row $i$ from $0$ to $N-1$.
- **Inner loop ($j$)**: Row $i$ has $(i + 1)$ stars $\rightarrow$ runs $j = 0$ to $i$.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern2(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 03: Right-Angled Number Pyramid

### ?? Visual Target ($N = 5$)
```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### ?? Logic Breakdown
- **Outer loop ($i$)**: $1$ to $N$.
- **Inner loop ($j$)**: Prints numbers from $1$ up to $i$.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 04: Right-Angled Number Pyramid - II

### ?? Visual Target ($N = 5$)
```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

### ?? Logic Breakdown
- **Outer loop ($i$)**: $1$ to $N$.
- **Inner loop ($j$)**: Prints the row number $i$ exactly $i$ times.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 05: Inverted Right Pyramid

### ?? Visual Target ($N = 5$)
```text
* * * * *
* * * *
* * *
* *
*
```

### ?? Logic Breakdown
- **Outer loop ($i$)**: $0$ to $N-1$.
- **Inner loop ($j$)**: Stars in row $i$ = $N - i \rightarrow j = 0$ to $N - i - 1$.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern5(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 06: Inverted Numbered Right Pyramid

### ?? Visual Target ($N = 5$)
```text
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

### ?? Logic Breakdown
- **Outer loop ($i$)**: $0$ to $N-1$.
- **Inner loop ($j$)**: Prints numbers from $1$ up to $N - i$.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern6(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 07: Star Pyramid (Centered Equilateral)

### ?? Visual Target ($N = 5$)
```text
    *
   ***
  *****
 *******
*********
```

### ?? Logic Breakdown
For row $i$ ($0$ to $N-1$):
- **Leading Spaces**: $N - i - 1$
- **Stars**: $2i + 1$
- **Trailing Spaces**: $N - i - 1$
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern7(int n) {
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int s = 0; s < n - i - 1; s++) System.out.print(" ");
        // Stars
        for (int st = 0; st < 2 * i + 1; st++) System.out.print("*");
        // Spaces
        for (int s = 0; s < n - i - 1; s++) System.out.print(" ");
        System.out.println();
    }
}
```

---

## ?? Pattern 08: Inverted Star Pyramid

### ?? Visual Target ($N = 5$)
```text
*********
 *******
  *****
   ***
    *
```

### ?? Logic Breakdown
For row $i$ ($0$ to $N-1$):
- **Leading Spaces**: $i$
- **Stars**: $2(N - i) - 1$
- **Trailing Spaces**: $i$
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern8(int n) {
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int s = 0; s < i; s++) System.out.print(" ");
        // Stars
        for (int st = 0; st < 2 * (n - i) - 1; st++) System.out.print("*");
        // Spaces
        for (int s = 0; s < i; s++) System.out.print(" ");
        System.out.println();
    }
}
```

---

## ?? Pattern 09: Diamond Star Pattern

### ?? Visual Target ($N = 5$)
```text
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
```

### ?? Logic Breakdown
- Combination of **Pattern 07 (Upper Pyramid)** + **Pattern 08 (Lower Inverted Pyramid)**.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern9(int n) {
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
```

---

## ?? Pattern 10: Half Diamond Star Pattern

### ?? Visual Target ($N = 5$)
```text
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
```

### ?? Logic Breakdown
- Total rows = $2N - 1$.
- For row $i$ ($1$ to $2N-1$):
  - If $i \le N$, stars = $i$.
  - If $i > N$, stars = $2N - i$.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern10(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
        int stars = (i <= n) ? i : (2 * n - i);
        for (int j = 1; j <= stars; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 11: Binary Number Triangle (0/1 Alternating)

### ?? Visual Target ($N = 5$)
```text
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

### ?? Logic Breakdown
- Row $i$ ($0$ to $N-1$):
  - If row index $i$ is even $\rightarrow$ start with `1`.
  - If row index $i$ is odd $\rightarrow$ start with `0`.
  - Toggle between $1$ and $0$ on each element: `start = 1 - start`.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern11(int n) {
    for (int i = 0; i < n; i++) {
        int start = (i % 2 == 0) ? 1 : 0;
        for (int j = 0; j <= i; j++) {
            System.out.print(start + " ");
            start = 1 - start;
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 12: Number Crown Pattern

### ?? Visual Target ($N = 4$)
```text
1      1
12    21
123  321
12344321
```

### ?? Logic Breakdown
For row $i$ ($1$ to $N$):
- **Left Numbers**: $1 \dots i$
- **Spaces**: $2 \times (N - i)$
- **Right Numbers**: $i \dots 1$
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern12(int n) {
    for (int i = 1; i <= n; i++) {
        // Left numbers
        for (int j = 1; j <= i; j++) System.out.print(j);
        // Spaces
        for (int s = 1; s <= 2 * (n - i); s++) System.out.print(" ");
        // Right numbers
        for (int j = i; j >= 1; j--) System.out.print(j);
        System.out.println();
    }
}
```

---

## ?? Pattern 13: Increasing Number Triangle (Floyd's Triangle)

### ?? Visual Target ($N = 5$)
```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

### ?? Logic Breakdown
- Maintain a running counter `num = 1`.
- Row $i$ ($1$ to $N$) prints $i$ numbers, incrementing `num++` after each.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern13(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 14: Increasing Letter Triangle

### ?? Visual Target ($N = 5$)
```text
A
A B
A B C
A B C D
A B C D E
```

### ?? Logic Breakdown
- Row $i$ ($0$ to $N-1$):
- Inner loop runs `ch` from `'A'` up to `'A' + i`.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern14(int n) {
    for (int i = 0; i < n; i++) {
        for (char ch = 'A'; ch <= 'A' + i; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 15: Reverse Letter Triangle

### ?? Visual Target ($N = 5$)
```text
A B C D E
A B C D
A B C
A B
A
```

### ?? Logic Breakdown
- Row $i$ ($0$ to $N-1$):
- Inner loop runs `ch` from `'A'` up to `'A' + (N - i - 1)`.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern15(int n) {
    for (int i = 0; i < n; i++) {
        for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 16: Alpha-Ramp Pattern

### ?? Visual Target ($N = 5$)
```text
A
B B
C C C
D D D D
E E E E E
```

### ?? Logic Breakdown
- Row $i$ ($0$ to $N-1$): Character for the row is `(char)('A' + i)`.
- Print that character $(i + 1)$ times.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern16(int n) {
    for (int i = 0; i < n; i++) {
        char ch = (char) ('A' + i);
        for (int j = 0; j <= i; j++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
```

---

## ?? Pattern 17: Alpha-Hill Pattern

### ?? Visual Target ($N = 4$)
```text
   A
  ABA
 ABCBA
ABCDCBA
```

### ?? Logic Breakdown
For row $i$ ($0$ to $N-1$):
- **Leading Spaces**: $N - i - 1$
- **Characters ($2i + 1$)**: Character increases from `'A'` up to `'A' + i` at midpoint $(2i + 1) / 2$, then decreases back down to `'A'`.
- **Trailing Spaces**: $N - i - 1$
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern17(int n) {
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int s = 0; s < n - i - 1; s++) System.out.print(" ");
        // Characters
        char ch = 'A';
        int totalChars = 2 * i + 1;
        int breakpoint = totalChars / 2;
        for (int j = 1; j <= totalChars; j++) {
            System.out.print(ch);
            if (j <= breakpoint) ch++;
            else ch--;
        }
        // Spaces
        for (int s = 0; s < n - i - 1; s++) System.out.print(" ");
        System.out.println();
    }
}
```

---

## ?? Pattern 18: Alpha-Triangle Pattern

### ?? Visual Target ($N = 5$)
```text
E
D E
C D E
B C D E
A B C D E
```

### ?? Logic Breakdown
- In row $i$ ($0$ to $N-1$), the starting character is `'A' + N - 1 - i`.
- Print characters sequentially from this start character up to `'A' + N - 1`.
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$

```java
public static void pattern18(int n) {
    for (int i = 0; i < n; i++) {
        for (char ch = (char) ('A' + n - 1 - i); ch <= 'A' + n - 1; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
```

---

## ?? How to Run the Java Master File

```bash
# Navigate to the patterns java folder
cd 01-basics/02-patterns/java

# Compile with Java (JDK)
javac Patterns_1_to_18.java

# Run
java Patterns_1_to_18
```
