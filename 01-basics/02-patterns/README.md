<div align="center">

# 📐 Striver A2Z DSA • Step 1.2: Pattern Problems
### *The Ultimate Pattern Logic & Discrete Geometry Suite in Java 21*

[![Language](https://img.shields.io/badge/Language-Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Curriculum](https://img.shields.io/badge/Curriculum-Striver's_A2Z_DSA-FF5722?style=for-the-badge&logo=codeforces&logoColor=white)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/)
[![Progress](https://img.shields.io/badge/Progress-20%2F22_Solved_(91%25)-10B981?style=for-the-badge&logo=target&logoColor=white)](#-pattern-checklist-striver-a2z-sheet)
[![Obsidian Ready](https://img.shields.io/badge/Obsidian-Ready-7C3AED?style=for-the-badge&logo=obsidian&logoColor=white)](https://obsidian.md)

<p align="center">
  <b>No copy-pasting. No memorizing indices.</b><br>
  Every pattern is decoded into its foundational matrix coordinate geometry, mathematical row-column relations, and discrete space sequences.
</p>

---

[⚡ Master Mental Models](../../00-DSA-Roadmap-and-Mental-Models.md) • [📖 Full 1-18 Logic Guide](./JAVA_PATTERNS_1_TO_18.md) • [🏠 Root DetaKozo](../../README.md)

---

</div>

## 🧠 The 4 Golden Rules of Pattern Solving

Whenever you approach ANY pattern problem, apply this deterministic 4-step framework:

```
┌────────────────────────────────────────────────────────────────────────┐
│ 1. OUTER LOOP = ROWS                                                   │
│    How many lines exist? (for i = 0 to N-1 or for i = 1 to 2*N-1)      │
├────────────────────────────────────────────────────────────────────────┤
│ 2. ANATOMY OF ROW 'i'                                                  │
│    Break each row into: Leading Spaces ──▶ Symbols ──▶ Mirrored Half   │
├────────────────────────────────────────────────────────────────────────┤
│ 3. MATHEMATICAL INVARIANTS                                             │
│    Derive column counts as a mathematical function of row index 'i'    │
│    (e.g., Spaces = 2*(N - i - 1), Stars = 2*i + 1)                     │
├────────────────────────────────────────────────────────────────────────┤
│ 4. NEWLINE DELIMITER                                                   │
│    Close each completed row with System.out.println()                  │
└────────────────────────────────────────────────────────────────────────┘
```

---

## 📚 Pattern Checklist (Striver A2Z Sheet)

| # | Pattern Name | Difficulty | Status | Java File | Mental Model / Key Formula |
|:---:|:---|:---:|:---:|:---|:---|
| **01** | [Rectangular Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-1) | Easy | ✅ Ready | [`Pattern01.java`](./Pattern01.java) | Uniform $N \times N$ matrix grid |
| **02** | [Right-Angled Triangle](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-2) | Easy | ✅ Ready | [`Pattern02.java`](./Pattern02.java) | Row $i$ contains $i$ stars |
| **03** | [Right-Angled Number Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-3) | Easy | ✅ Ready | [`Pattern03.java`](./Pattern03.java) | Ascending numbers $1 \dots i$ |
| **04** | [Right-Angled Number Pyramid - II](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-4) | Easy | ✅ Ready | [`Pattern04.java`](./Pattern04.java) | Repeating row number $i$ |
| **05** | [Inverted Right Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-5) | Easy | ✅ Ready | [`Pattern05.java`](./Pattern05.java) | Stars decrease: $N - i + 1$ |
| **06** | [Inverted Numbered Right Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-6) | Easy | ✅ Ready | [`Pattern06.java`](./Pattern06.java) | Decreasing numbers $1 \dots N - i + 1$ |
| **07** | [Star Pyramid (Centered)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-7) | Medium | ✅ Ready | [`Pattern07.java`](./Pattern07.java) | Spaces: $N - i - 1$, Stars: $2i + 1$ |
| **08** | [Inverted Star Pyramid](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-8) | Medium | ✅ Ready | [`Pattern08.java`](./Pattern08.java) | Spaces: $i$, Stars: $2(N - i) - 1$ |
| **09** | [Diamond Star Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-9) | Medium | ✅ Ready | [`Pattern09.java`](./Pattern09.java) | Composite: Upper Pyramid + Inverted Pyramid |
| **10** | [Half Diamond Star](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-10) | Easy | ✅ Ready | [`Pattern10.java`](./Pattern10.java) | Symmetry: $i \le N ? i : 2N - i$ |
| **11** | [Binary Number Triangle (0/1)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-11) | Medium | ✅ Ready | [`Pattern11.java`](./Pattern11.java) | Parity check: $(i + j) \pmod 2$ |
| **12** | [Number Crown Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-12) | Medium | ✅ Ready | [`Pattern12.java`](./Pattern12.java) | Ascending numbers + $2(N - i)$ spaces + Descending |
| **13** | [Increasing Number Triangle (Floyd)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-13) | Easy | ✅ Ready | [`Pattern13.java`](./Pattern13.java) | Floyd's sequence with continuous accumulator |
| **14** | [Increasing Letter Triangle](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-14) | Easy | ✅ Ready | [`Pattern14.java`](./Pattern14.java) | Character casting: $(char)('A' + j)$ |
| **15** | [Reverse Letter Triangle](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-15) | Easy | ✅ Ready | [`Pattern15.java`](./Pattern15.java) | Inverted letters: $(char)('A' + j)$ |
| **16** | [Alpha-Ramp Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-16) | Easy | ✅ Ready | [`Pattern16.java`](./Pattern16.java) | Row character: $(char)('A' + i)$ |
| **17** | [Alpha-Hill Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-17) | Hard | ✅ Ready | [`Pattern17.java`](./Pattern17.java) | Palindromic character hill with midpoint inflection |
| **18** | [Alpha-Triangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-18) | Medium | ✅ Ready | [`Pattern18.java`](./Pattern18.java) | Reverse alphabet starting from $(char)('A' + N - 1)$ |
| **19** | [Symmetric Void Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-19) | Hard | ✅ Ready | [`Pattern19.java`](./Pattern19.java) | Upper: stars decrease, spaces grow. Lower: inverted |
| **20** | [Symmetric Butterfly Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-20) | Hard | ✅ Ready | [`Pattern20.java`](./Pattern20.java) | **Dual Approaches**: Two halves + Single-loop symmetry |
| **21** | [Hollow Rectangle Pattern](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-21) | Easy | ⏳ Next Up | *Upcoming* | Boundary: $i == 0 \lor i == N-1 \lor j == 0 \lor j == N-1$ |
| **22** | [The Number Pattern (Concentric Matrix)](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-22) | Hard | ⏳ Next Up | *Upcoming* | Border distance: $N - \min(top, bottom, left, right)$ |

---

## 🛠️ Compilation & Execution

```bash
# Run any individual pattern directly:
java Pattern20.java

# Or compile and run using javac:
javac Pattern20.java
java Pattern20

# Run the master multi-pattern runner (Patterns 1-18):
java Patterns_1_to_18.java
```
