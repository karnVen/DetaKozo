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
4. **Print Newline**: At the end of each row's inner loops, output `cout << "\n";`.

---

## ?? Pattern Checklist (Striver A2Z Sheet)

| # | Pattern Name | Difficulty | Status | File |
|---|:---|:---:|:---:|:---|
| **01** | [Rectangular Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-1) | Easy | ? Not Started | [`pattern01.cpp`](./pattern01.cpp) |
| **02** | [Right-Angled Triangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-2) | Easy | ? Not Started | [`pattern02.cpp`](./pattern02.cpp) |
| **03** | [Right-Angled Number Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-3) | Easy | ? Not Started | [`pattern03.cpp`](./pattern03.cpp) |
| **04** | [Right-Angled Number Pyramid - II](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-4) | Easy | ? Not Started | [`pattern04.cpp`](./pattern04.cpp) |
| **05** | [Inverted Right Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-5) | Easy | ? Not Started | [`pattern05.cpp`](./pattern05.cpp) |
| **06** | [Inverted Numbered Right Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-6) | Easy | ? Not Started | [`pattern06.cpp`](./pattern06.cpp) |
| **07** | [Star Pyramid (Centered)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-7) | Medium | ? Not Started | [`pattern07.cpp`](./pattern07.cpp) |
| **08** | [Inverted Star Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-8) | Medium | ? Not Started | [`pattern08.cpp`](./pattern08.cpp) |
| **09** | [Diamond Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-9) | Medium | ? Not Started | [`pattern09.cpp`](./pattern09.cpp) |
| **10** | [Half Diamond Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-10) | Easy | ? Not Started | [`pattern10.cpp`](./pattern10.cpp) |
| **11** | [Binary Number Triangle (0/1)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-11) | Medium | ? Not Started | [`pattern11.cpp`](./pattern11.cpp) |
| **12** | [Number Crown Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-12) | Medium | ? Not Started | [`pattern12.cpp`](./pattern12.cpp) |
| **13** | [Increasing Number Triangle (Floyd)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-13) | Easy | ? Not Started | [`pattern13.cpp`](./pattern13.cpp) |
| **14** | [Increasing Letter Triangle](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-14) | Easy | ? Not Started | [`pattern14.cpp`](./pattern14.cpp) |
| **15** | [Reverse Letter Triangle](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-15) | Easy | ? Not Started | [`pattern15.cpp`](./pattern15.cpp) |
| **16** | [Alpha-Ramp Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-16) | Easy | ? Not Started | [`pattern16.cpp`](./pattern16.cpp) |
| **17** | [Alpha-Hill Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-17) | Hard | ? Not Started | [`pattern17.cpp`](./pattern17.cpp) |
| **18** | [Alpha-Triangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-18) | Medium | ? Not Started | [`pattern18.cpp`](./pattern18.cpp) |
| **19** | [Symmetric Void Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-19) | Hard | ? Not Started | [`pattern19.cpp`](./pattern19.cpp) |
| **20** | [Symmetric Butterfly Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-20) | Hard | ? Not Started | [`pattern20.cpp`](./pattern20.cpp) |
| **21** | [Hollow Rectangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-21) | Easy | ? Not Started | [`pattern21.cpp`](./pattern21.cpp) |
| **22** | [The Number Pattern (Matrix Concentric)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-22) | Hard | ? Not Started | [`pattern22.cpp`](./pattern22.cpp) |

---

## ??? How to Compile & Run

```bash
# Compile a pattern file
g++ -std=c++17 -Wall 01-basics/02-patterns/pattern01.cpp -o 01-basics/02-patterns/pattern01

# Run
./01-basics/02-patterns/pattern01
```
