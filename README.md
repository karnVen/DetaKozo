<div align="center">

# ⚡ DETAKOZO (データ構造)
### *The Algorithmic Second Brain & Pattern Mastery Command Center*
**Data Structures & Algorithms in Java • Striver A2Z DSA • TakeUForward**

[![Obsidian Ready](https://img.shields.io/badge/Obsidian-Second_Brain_Ready-7C3AED?style=for-the-badge&logo=obsidian&logoColor=white)](https://obsidian.md)
[![Language](https://img.shields.io/badge/Language-Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Curriculum](https://img.shields.io/badge/Curriculum-Striver's_A2Z_DSA-FF5722?style=for-the-badge&logo=codeforces&logoColor=white)](https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet)
[![Progress](https://img.shields.io/badge/Patterns_Mastery-22%2F22_Completed_(100%25)-10B981?style=for-the-badge&logo=target&logoColor=white)](#-step-12-patterns-mastery-matrix)
[![Method](https://img.shields.io/badge/Pedagogy-Alvar_Method-6366F1?style=for-the-badge)](#-the-ai-bou-engineering-philosophy)

<p align="center">
  <b>No rote memorization. Pure coordinate geometry and algorithmic derivation.</b><br>
  <b>DetaKozo</b> is an engineering-grade DSA knowledge vault pairing with <b>AI-bou</b> (相棒 / Companion).<br>
  Featuring mathematical coordinate models, standalone verified Java 21 runners, dual-perspective implementations, and Obsidian-linked notes.
</p>

---

[⚡ Master Mental Models](./00-DSA-Roadmap-and-Mental-Models.md) • [📐 Patterns Matrix](./01-basics/02-patterns/README.md) • [⏱️ Complexity](./01-basics/03-time-complexity/README.md) • [🗄️ Hashing & Maps](./01-basics/04-hashing/README.md) • [💻 Java Suite](./01-basics/04-hashing/BasicHashingDemo.java) • [🧮 Basic Maths](./01-basics/05-basic-maths/README.md) • [📖 TakeUForward Sheet](https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet)

---

</div>

## 📊 At a Glance (Vault Metrics)

| Metric | Metric Details |
| :--- | :--- |
| 🎯 **Step 1.2 Patterns Solved** | **22 / 22 Completed (100%)** — All 22 patterns mastered with coordinate geometry |
| ⏱️ **Step 1.3 Complexity Analysis** | **Complete (100%)** — Big-O, 3 Golden Rules, $10^8$ OJ Benchmark & Space bounds |
| 🗄️ **Step 1.4 Hashing & Maps** | **Complete (100%)** — Pre-storing, Fetching, ASCII 256, HashMap, Division Rule & Collisions |
| 🧮 **Step 1.5 Basic Maths** | **Complete (100%)** — Digit extraction, Euclidean GCD, Armstrong, (\\sqrt{N})$ Primes & Divisors |
| 💻 **Language & Environment** | **Java 21 LTS** — Standalone classes with built-in `main` test runners |
| 📐 **Visual Blueprints & Diagrams** | **Boxed ASCII coordinate geometry & mathematical invariant derivations** |
| 🧠 **Learning Pedagogy** | **The Alvar Method** (Probe → Plan → Teach → Lock-in) |
| 📓 **Second Brain Integration** | **Obsidian-Ready** with native LaTeX math (`$$2(N - i - 1)$$`) and graph links |
| ⚖️ **Dual-Approach Implementations** | Both independent halves and single-loop symmetry solutions documented |

---

## 🗺️ Algorithmic Blueprints & Mental Models

### 1. Matrix Coordinate Geometry & Invariant Mapping
```
┌────────────────────────────────────────────────────────────────────────┐
│                        2D Matrix Coordinate Grid                       │
│                      Row (i) ──▶ Inner Column Loops (j)                │
├────────────────────────────────────────────────────────────────────────┤
│  1. Outer Loop: Total Rows (i = 0 to N-1 or i = 1 to 2*N-1)            │
│  2. Left Symbols:  f(i)   ──▶ Number of leading stars / characters     │
│  3. Middle Spaces: g(i)   ──▶ Discrete space sequences (2*i, 2*(N-1-i))│
│  4. Right Symbols: f(i)   ──▶ Mirrored trailing stars / characters     │
│  5. Newline:       System.out.println() at the end of each row         │
└────────────────────────────────────────────────────────────────────────┘
```

### 2. Symmetrical Butterfly Pattern Blueprint (`Pattern 20`)
```
Row (i)       Left Stars (j)          Spaces (s)          Right Stars (j)
  1           *                  [  8 Spaces  ]                 *
  2           **                 [  6 Spaces  ]                **
  3           ***                [  4 Spaces  ]               ***
  4           ****               [  2 Spaces  ]              ****
  5           **********         [  0 Spaces  ]        **********   <── Center Axis (i = N)
  6           ****               [  2 Spaces  ]              ****
  7           ***                [  4 Spaces  ]               ***
  8           **                 [  6 Spaces  ]                **
  9           *                  [  8 Spaces  ]                 *
             (stars = i)        (spaces = 2*N - 2)            (stars = i)
             (if i > N ──▶ 2*N - i)                          (if i > N ──▶ 2*N - i)
```

---

## 📚 Striver A2Z DSA Roadmap Tracker

### 🟢 Step 1: Learn the Basics (In Progress)
- [x] **1.1 Things to Know in Programming** (I/O, Conditionals, Data Types, Switch)
- [x] **[1.2 Build-up Logical Thinking (Patterns 01 to 22)](./01-basics/02-patterns/README.md)** — *(22/22 Complete, 100% Mastered)*
- [x] **[1.3 Time & Space Complexity Mastery](./01-basics/03-time-complexity/README.md)** — *(Big-O, 3 Golden Rules, Space Bounds, 10^8 Operations Rule)*
- [x] **[1.4 Basic Hashing & Maps Mastery](./01-basics/04-hashing/README.md)** — *(Pre-storing, Fetching, Char Hashing, HashMap vs TreeMap, Division Rule)*
- [x] **[1.5 Basic Maths Mastery](./01-basics/05-basic-maths/README.md)** — *(Count Digits, Reverse Number, Palindrome, Armstrong, (\\sqrt{N})$ Divisors, Prime, Euclidean GCD)*
- [ ] **1.5 Basic Recursion** (1 to N, Backtracking, Functional Recursion, Fibonacci)
- [ ] **1.6 Basic Hashing** (Frequency arrays, HashMap, High/Low Frequency elements)

### ⚪ Step 2: Learn Important Sorting Techniques
- [ ] Selection Sort, Bubble Sort, Insertion Sort
- [ ] Merge Sort, Recursive Bubble & Insertion, Quick Sort

### ⚪ Step 3: Solve Problems on Arrays
- [ ] Easy $\rightarrow$ Medium $\rightarrow$ Hard Array Problems (Two Pointers, Kadane's, Dutch National Flag, Moore's Voting)

### ⚪ Step 4: Binary Search
- [ ] 1D Arrays $\rightarrow$ Search Space $\rightarrow$ 2D Arrays & Matrix Binary Search

### ⚪ Step 5: Strings (Basic & Medium)
### ⚪ Step 6: Learn LinkedList (Singly, Doubly, Medium, Hard)
### ⚪ Step 7: Recursion & Backtracking
### ⚪ Step 8: Bit Manipulation
### ⚪ Step 9: Stack and Queues (Monotonic Stacks, LRU Cache)
### ⚪ Step 10: Sliding Window & Two Pointers
### ⚪ Step 11: Heaps / Priority Queues
### ⚪ Step 12: Greedy Algorithms
### ⚪ Step 13: Binary Trees & BST
### ⚪ Step 14: Graphs (BFS, DFS, Dijkstra, DSU, Spanning Trees)
### ⚪ Step 15: Dynamic Programming (1D, 2D, Grids, Subsequences, MCM)
### ⚪ Step 16: Tries & Advanced Data Structures

---

## 📐 Step 1.2: Patterns Mastery Matrix

| # | Pattern Name | Difficulty | Status | Java File | Mental Model / Key Formula |
|:---:|:---|:---:|:---:|:---|:---|
| **01** | [Rectangular Star](./01-basics/02-patterns/Pattern01.java) | Easy | ✅ Ready | [`Pattern01.java`](./01-basics/02-patterns/Pattern01.java) | Uniform $N \times N$ matrix grid |
| **02** | [Right-Angled Triangle](./01-basics/02-patterns/Pattern02.java) | Easy | ✅ Ready | [`Pattern02.java`](./01-basics/02-patterns/Pattern02.java) | Row $i$ has $i$ stars |
| **03** | [Right-Angled Number Pyramid](./01-basics/02-patterns/Pattern03.java) | Easy | ✅ Ready | [`Pattern03.java`](./01-basics/02-patterns/Pattern03.java) | Print column index $j$ ($1 \dots i$) |
| **04** | [Right-Angled Number Pyramid - II](./01-basics/02-patterns/Pattern04.java) | Easy | ✅ Ready | [`Pattern04.java`](./01-basics/02-patterns/Pattern04.java) | Print row index $i$ repeated $i$ times |
| **05** | [Inverted Right Pyramid](./01-basics/02-patterns/Pattern05.java) | Easy | ✅ Ready | [`Pattern05.java`](./01-basics/02-patterns/Pattern05.java) | Stars decrease: $N - i + 1$ |
| **06** | [Inverted Numbered Right Pyramid](./01-basics/02-patterns/Pattern06.java) | Easy | ✅ Ready | [`Pattern06.java`](./01-basics/02-patterns/Pattern06.java) | Numbers $1 \dots N - i + 1$ |
| **07** | [Star Pyramid (Centered)](./01-basics/02-patterns/Pattern07.java) | Medium | ✅ Ready | [`Pattern07.java`](./01-basics/02-patterns/Pattern07.java) | Spaces: $N - i - 1$, Stars: $2i + 1$ |
| **08** | [Inverted Star Pyramid](./01-basics/02-patterns/Pattern08.java) | Medium | ✅ Ready | [`Pattern08.java`](./01-basics/02-patterns/Pattern08.java) | Spaces: $i$, Stars: $2(N - i) - 1$ |
| **09** | [Diamond Star Pattern](./01-basics/02-patterns/Pattern09.java) | Medium | ✅ Ready | [`Pattern09.java`](./01-basics/02-patterns/Pattern09.java) | Composite: Pattern 07 + Pattern 08 |
| **10** | [Half Diamond Star](./01-basics/02-patterns/Pattern10.java) | Easy | ✅ Ready | [`Pattern10.java`](./01-basics/02-patterns/Pattern10.java) | Symmetric stars: $i \le N ? i : 2N - i$ |
| **11** | [Binary Number Triangle (0/1)](./01-basics/02-patterns/Pattern11.java) | Medium | ✅ Ready | [`Pattern11.java`](./01-basics/02-patterns/Pattern11.java) | Parity check: $(i + j) \pmod 2$ |
| **12** | [Number Crown Pattern](./01-basics/02-patterns/Pattern12.java) | Medium | ✅ Ready | [`Pattern12.java`](./01-basics/02-patterns/Pattern12.java) | Ascending numbers + $2(N - i)$ spaces + Descending |
| **13** | [Increasing Number Triangle](./01-basics/02-patterns/Pattern13.java) | Easy | ✅ Ready | [`Pattern13.java`](./01-basics/02-patterns/Pattern13.java) | Floyd's triangle with continuous counter |
| **14** | [Increasing Letter Triangle](./01-basics/02-patterns/Pattern14.java) | Easy | ✅ Ready | [`Pattern14.java`](./01-basics/02-patterns/Pattern14.java) | Characters $(char)('A' + j)$ |
| **15** | [Reverse Letter Triangle](./01-basics/02-patterns/Pattern15.java) | Easy | ✅ Ready | [`Pattern15.java`](./01-basics/02-patterns/Pattern15.java) | Decreasing letters $(char)('A' + j)$ |
| **16** | [Alpha-Ramp Pattern](./01-basics/02-patterns/Pattern16.java) | Easy | ✅ Ready | [`Pattern16.java`](./01-basics/02-patterns/Pattern16.java) | Constant character per row: $(char)('A' + i)$ |
| **17** | [Alpha-Hill Pattern](./01-basics/02-patterns/Pattern17.java) | Hard | ✅ Ready | [`Pattern17.java`](./01-basics/02-patterns/Pattern17.java) | Palindromic character pyramid with midpoint inflection |
| **18** | [Alpha-Triangle Pattern](./01-basics/02-patterns/Pattern18.java) | Medium | ✅ Ready | [`Pattern18.java`](./01-basics/02-patterns/Pattern18.java) | Reverse alphabet start from $(char)('A' + N - 1)$ |
| **19** | [Symmetric Void Pattern](./01-basics/02-patterns/Pattern19.java) | Hard | ✅ Ready | [`Pattern19.java`](./01-basics/02-patterns/Pattern19.java) | Top: stars decrease, spaces grow. Bottom: inverted |
| **20** | [Symmetric Butterfly Pattern](./01-basics/02-patterns/Pattern20.java) | Hard | ✅ Ready | [`Pattern20.java`](./01-basics/02-patterns/Pattern20.java) | **Dual Approaches**: Two halves + Single-loop symmetry |
| **21** | [Hollow Rectangle Pattern](./01-basics/02-patterns/Pattern21.java) | Easy | ✅ Ready | [Pattern21.java](./01-basics/02-patterns/Pattern21.java) | Boundary condition: $i == 0 \lor i == N-1 \lor j == 0 \lor j == N-1$ |
| **22** | [The Number Pattern (Concentric Matrix)](./01-basics/02-patterns/Pattern22.java) | Hard | ✅ Ready | [Pattern22.java](./01-basics/02-patterns/Pattern22.java) | Distance to borders: $N - \min(top, bottom, left, right)$ |

---

## 🧠 The AI-bou Engineering Philosophy

Instead of copying canned solutions, this repository enforces **The Alvar Method**:

```
      PROBE                     PLAN                     TEACH                    LOCK-IN
┌──────────────────┐     ┌──────────────────┐     ┌──────────────────┐     ┌──────────────────┐
│  Deconstruct the │ ──▶ │ Derive the math  │ ──▶ │ Articulate logic │ ──▶ │ Standalone code  │
│  problem visual  │     │ row-to-col invariants  │ in plain English │     │ + git vaulting   │
└──────────────────┘     └──────────────────┘     └──────────────────┘     └──────────────────┘
```

1. **Probe (Visual Anatomy):** Identify outer boundary rows, leading spaces, mirrored symmetry, and inflection lines.
2. **Plan (Mathematical Derivations):** Express symbols as discrete functions of $i$ and $N$ (e.g., $2 \times (N - i)$).
3. **Teach (Verbalize the Invariant):** Explain why the algorithm works step-by-step before touching Java syntax.
4. **Lock-in (Clean Implementations):** Write robust, self-contained Java source files with runnable `main` verification runners.

---

## 📁 Repository Architecture

```plaintext
01-DSA/
├── 00-DSA-Roadmap-and-Mental-Models.md    # Master mathematical cheat sheet & mental models
├── README.md                              # Main vault command center & Striver roadmap
│
├── 01-basics/
│   └── 02-patterns/                       # Step 1.2: Pattern Mastery Directory
│       ├── README.md                      # Dedicated patterns tracker & formulas
│       ├── JAVA_PATTERNS_1_TO_18.md       # Detailed breakdown of patterns 1 to 18
│       ├── Patterns_1_to_18.java          # Master monolithic runner class (1-18)
│       ├── Pattern01.java                 # Standalone verified Java class (Pattern 01)
│       ├── Pattern02.java                 # Standalone verified Java class (Pattern 02)
│       ├── ...                            # Standalone verified Java classes (03 to 18)
│       ├── Pattern19.java                 # Symmetric Void Pattern runner
│       └── Pattern20.java                 # Symmetric Butterfly (Dual Approaches)
│
└── 19-sep-26/                             # Foundation setup & basic conditionals
    ├── conditions.cpp
    └── conditions2.cpp
```

---

## 🛠️ Setup & Execution Guide

All patterns are compiled with **Java 21 LTS** and contain built-in `main` test drivers:

```bash
# Run any individual pattern directly (Java 11+ single-file execution):
java 01-basics/02-patterns/Pattern20.java

# Or compile and run using standard javac:
javac 01-basics/02-patterns/Pattern20.java
java -cp 01-basics/02-patterns Pattern20

# Run the master multi-pattern suite:
java 01-basics/02-patterns/Patterns_1_to_18.java
```

---

<div align="center">
  <b>DetaKozo (データ構造)</b> • Built with rigor by <a href="https://github.com/karnVen">karnVen</a> & <b>AI-bou</b><br>
  <i>"Mastering Data Structures & Algorithms, one pattern and one concept at a time."</i>
</div>
