# ?? Striver A2Z DSA ? Step 1.2: Pattern Problems

> **AI-bou Tutoring Philosophy**: We do not memorize code. We decode the visual geometry, find the mathematical link between rows and columns, and write the logic ourselves.

---

## ?? The 4 Golden Rules of Pattern Solving

Whenever you encounter ANY pattern problem, follow this 4-step framework:

1. **Outer Loop = Rows**: How many total rows are there?
   - Usually `for (int i = 0; i < n; i++)` (0-indexed) or `for (int i = 1; i <= n; i++)` (1-indexed).
2. **Break Down Each Row**: Look at row `i` in detail and identify:
   - Are there leading spaces?
   - What characters/numbers/asterisks are printed?
   - Are there trailing spaces or a mirrored half?
3. **Find the Mathematical Formula relating `i` (the row index) to column counts**:
   - Example: For row `i` (0 to `n-1`), spaces = `n - i - 1`, stars = `2*i + 1`.
4. **Print Newline**: At the end of each row's inner loops, output `System.out.println();`.

---

## ? Java Solutions & Guide
- ?? **Complete 1 to 18 Java Guide & Explanations**: [`JAVA_PATTERNS_1_TO_18.md`](./JAVA_PATTERNS_1_TO_18.md)
- ? **Master Java Class**: [`Patterns_1_to_18.java`](./Patterns_1_to_18.java)

---

## ?? Pattern Checklist (Striver A2Z Sheet)

| # | Pattern Name | Difficulty | Status | Java File |
|---|:---|:---:|:---:|:---|
| **01** | [Rectangular Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-1) | Easy | ? Ready | [`Pattern01.java`](./Pattern01.java) |
| **02** | [Right-Angled Triangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-2) | Easy | ? Ready | [`Pattern02.java`](./Pattern02.java) |
| **03** | [Right-Angled Number Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-3) | Easy | ? Ready | [`Pattern03.java`](./Pattern03.java) |
| **04** | [Right-Angled Number Pyramid - II](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-4) | Easy | ? Ready | [`Pattern04.java`](./Pattern04.java) |
| **05** | [Inverted Right Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-5) | Easy | ? Ready | [`Pattern05.java`](./Pattern05.java) |
| **06** | [Inverted Numbered Right Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-6) | Easy | ? Ready | [`Pattern06.java`](./Pattern06.java) |
| **07** | [Star Pyramid (Centered)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-7) | Medium | ? Ready | [`Pattern07.java`](./Pattern07.java) |
| **08** | [Inverted Star Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-8) | Medium | ? Ready | [`Pattern08.java`](./Pattern08.java) |
| **09** | [Diamond Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-9) | Medium | ? Ready | [`Pattern09.java`](./Pattern09.java) |
| **10** | [Half Diamond Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-10) | Easy | ? Ready | [`Pattern10.java`](./Pattern10.java) |
| **11** | [Binary Number Triangle (0/1)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-11) | Medium | ? Ready | [`Pattern11.java`](./Pattern11.java) |
| **12** | [Number Crown Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-12) | Medium | ? Ready | [`Pattern12.java`](./Pattern12.java) |
| **13** | [Increasing Number Triangle (Floyd)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-13) | Easy | ? Ready | [`Pattern13.java`](./Pattern13.java) |
| **14** | [Increasing Letter Triangle](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-14) | Easy | ? Ready | [`Pattern14.java`](./Pattern14.java) |
| **15** | [Reverse Letter Triangle](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-15) | Easy | ? Ready | [`Pattern15.java`](./Pattern15.java) |
| **16** | [Alpha-Ramp Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-16) | Easy | ? Ready | [`Pattern16.java`](./Pattern16.java) |
| **17** | [Alpha-Hill Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-17) | Hard | ? Ready | [`Pattern17.java`](./Pattern17.java) |
| **18** | [Alpha-Triangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-18) | Medium | ? Ready | [`Pattern18.java`](./Pattern18.java) |
| **19** | [Symmetric Void Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-19) | Hard | ? Ready | [`Pattern19.java`](./Pattern19.java) |
| **20** | [Symmetric Butterfly Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-20) | Hard | ? Not Started | ? |
| **21** | [Hollow Rectangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-21) | Easy | ? Not Started | ? |
| **22** | [The Number Pattern (Matrix Concentric)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-22) | Hard | ? Not Started | ? |

---

## ??? How to Compile & Run (Java)

```bash
# Compile and run any individual pattern:
javac Pattern19.java && java Pattern19
```
