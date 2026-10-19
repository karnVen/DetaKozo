<div align="center">

# 🗄️ Striver A2Z DSA • Step 1.4: Hashing & Maps
### *The Complete Hashing Architecture, Frequency Mapping, Collisions & Division Method Guide*

[![Course Track](https://img.shields.io/badge/Course-Striver's_A2Z_DSA-FF5722?style=for-the-badge&logo=codeforces&logoColor=white)](https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet)
[![Video Tutorial](https://img.shields.io/badge/YouTube-Striver_TUF_Lecture-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://www.youtube.com/watch?v=KEs5UyBJ39g)
[![Language](https://img.shields.io/badge/Language-Java_21_LTS-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Obsidian Ready](https://img.shields.io/badge/Obsidian-Second_Brain_Ready-7C3AED?style=for-the-badge&logo=obsidian&logoColor=white)](https://obsidian.md)
[![Status](https://img.shields.io/badge/Mastery-Complete_(100%25)-10B981?style=for-the-badge&logo=target&logoColor=white)](#)

<p align="center">
  <b>No more nested O(Q × N) linear scans.</b><br>
  Hashing is the algorithmic art of <b>Pre-storing</b> upfront so that every future query is <b>Fetched in O(1)</b>.<br>
  Based on <b>Striver's A2Z DSA Lecture (takeUforward)</b>, adapted for <b>AI-bou</b> second brain engineering.
</p>

---

[⚡ Master Mental Models](../../00-DSA-Roadmap-and-Mental-Models.md) • [⏱️ Time & Space Complexity](../03-time-complexity/README.md) • [💻 Java Verification Suite](./BasicHashingDemo.java) • [🏠 Root DetaKozo](../../README.md)

---

</div>

## 📌 Table of Contents
1. [The Foundational Problem: Frequency Counting Across Queries](#1-the-foundational-problem-frequency-counting-across-queries)
2. [What is Hashing? (The Two Pillars: Pre-Storing & Fetching)](#2-what-is-hashing-the-two-pillars-pre-storing--fetching)
3. [Technique 1: Number Hashing using Frequency Arrays](#3-technique-1-number-hashing-using-frequency-arrays)
   - [Memory Constraints: Local Stack vs Global Heap Limits](#memory-constraints-local-stack-vs-global-heap-limits)
4. [Technique 2: Character Hashing (Strings)](#4-technique-2-character-hashing-strings)
   - [Lowercase Alphabet Mapping ($26$ Buckets)](#lowercase-alphabet-mapping-26-buckets)
   - [All ASCII Characters Mapping ($256$ Buckets)](#all-ascii-characters-mapping-256-buckets)
5. [Technique 3: Hashing with Maps (`HashMap` vs `TreeMap`)](#5-technique-3-hashing-with-maps-hashmap-vs-treemap)
   - [Why Array Hashing Fails for Huge or Negative Numbers](#why-array-hashing-fails-for-huge-or-negative-numbers)
   - [`HashMap` (Unordered) vs `TreeMap` (Ordered) in Java](#hashmap-unordered-vs-treemap-ordered-in-java)
6. [Under the Hood: The Division Rule & Collision Resolution](#6-under-the-hood-the-division-rule--collision-resolution)
   - [The Division Method Hash Function](#the-division-method-hash-function)
   - [Why Choose a Prime Table Size?](#why-choose-a-prime-table-size)
   - [Collision Resolution: Separate Chaining & Open Addressing](#collision-resolution-separate-chaining--open-addressing)
   - [Why Worst-Case $O(N)$ Occurs (and Java 8 Treeification)](#why-worst-case-on-occurs-and-java-8-treeification)
7. [Striver Sheet Homework Problems: Highest & Lowest Frequency](#7-striver-sheet-homework-problems-highest--lowest-frequency)
8. [Summary & Complexity Master Matrix](#8-summary--complexity-master-matrix)

---

## 1. The Foundational Problem: Frequency Counting Across Queries

### The Scenario
You are given an array of size $N$:
```text
arr = [1, 2, 1, 3, 2]
```
You are then asked $Q$ independent queries. In each query, you are given a number $X$, and you must return how many times $X$ appears in the array.

### The Naive Brute-Force Approach
For every incoming query $X$, iterate through the array from start to end and count occurrences:

```java
int countFrequency(int[] arr, int n, int x) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] == x) {
            count++;
        }
    }
    return count;
}
```

> [!CAUTION]
> ### 🛑 The TLE Disaster:
> * Time to answer **one** query = $\mathcal{O}(N)$
> * Time to answer **$Q$** queries = $\mathcal{O}(Q \times N)$
> 
> In standard online judge constraints:
> $$N = 10^5, \quad Q = 10^5$$
> $$\text{Total Operations} = 10^5 \times 10^5 = \mathbf{10^{10} \text{ operations!}}$$
> Recall our **$10^8$ operations per second rule** from Step 1.3:
> $$10^{10} \text{ ops} \implies \approx \mathbf{100 \text{ seconds}} \gg 1.0\text{s} \implies \mathbf{Time\ Limit\ Exceeded\ (TLE)}$$

We need a technique that preprocesses the data so every query answers in $\mathcal{O}(1)$ time. That technique is **Hashing**.

---

## 2. What is Hashing? (The Two Pillars: Pre-Storing & Fetching)

> **Definition**: **Hashing** is an algorithmic technique where we use a secondary data structure (hash array or hash map) to map values directly to their frequencies or states, decoupling query time from data size.

Hashing operates in two distinct phases:

```
┌────────────────────────────────────────────────────────────────────────┐
│ 1. PRE-STORING (Precomputation Phase)                                  │
│    Traverse the input array once upfront.                              │
│    Record every element's frequency into a hash container.             │
│    Time: O(N)                                                          │
├────────────────────────────────────────────────────────────────────────┤
│ 2. FETCHING (Query Phase)                                              │
│    For each of the Q queries, directly access the pre-stored answer.   │
│    Time per query: O(1)                                                │
│    Total Query Time: O(Q)                                              │
└────────────────────────────────────────────────────────────────────────┘
```

$$\mathbf{Overall\ Time\ Complexity} = \mathcal{O}(N) + \mathcal{O}(Q) = \mathbf{\mathcal{O}(N + Q)}$$

For $N = 10^5$ and $Q = 10^5$:
$$\text{Operations} = 10^5 + 10^5 = 2 \times 10^5 \ll 10^8 \implies \mathbf{\approx 2\text{ milliseconds!}}$$
We reduced execution time from **100 seconds down to 2 milliseconds** — a $50,000\times$ speedup!

---

## 3. Technique 1: Number Hashing using Frequency Arrays

If we know the maximum possible value inside the array is reasonably small (e.g., elements $\le 12$ or $\le 10^6$), we can use the **value itself as an index** in a frequency array.

```
Input Array: arr = [1, 2, 1, 3, 2]
Max Element = 3 ──▶ Hash Array Size = Max + 1 = 4

Step 0: Initialize Hash Array of size 4 with 0s
Index:     [ 0 ] [ 1 ] [ 2 ] [ 3 ]
hash:      [  0    0     0     0  ]

Step 1: Traverse arr and increment:
- arr[0] = 1 ──▶ hash[1]++ ──▶ [0, 1, 0, 0]
- arr[1] = 2 ──▶ hash[2]++ ──▶ [0, 1, 1, 0]
- arr[2] = 1 ──▶ hash[1]++ ──▶ [0, 2, 1, 0]
- arr[3] = 3 ──▶ hash[3]++ ──▶ [0, 2, 1, 1]
- arr[4] = 2 ──▶ hash[2]++ ──▶ [0, 2, 2, 1]

Step 2: Answer Queries instantly:
Query(1) ──▶ Fetch hash[1] = 2 (in O(1))
Query(2) ──▶ Fetch hash[2] = 2 (in O(1))
Query(3) ──▶ Fetch hash[3] = 1 (in O(1))
Query(4) ──▶ Fetch hash[4] = 0 (in O(1))
```

### Java Implementation
```java
public class NumberHashing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int n = arr.length;

        // 1. Precomputation (Pre-storing)
        int maxVal = 12; // assuming elements <= 12
        int[] hash = new int[maxVal + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // 2. Fetching
        int[] queries = {1, 4, 2, 3, 12};
        for (int q : queries) {
            System.out.println("Frequency of " + q + ": " + hash[q]);
        }
    }
}
```

---

### Memory Constraints: Local Stack vs Global Heap Limits

Striver explains a vital system-level distinction regarding how large an array can be declared:

```
┌─────────────────────────────────┬───────────────────────────────┬─────────────────────────────┐
│ Array Location                  │ Maximum Allowed Size (C++)    │ Java 21 Equivalent          │
├─────────────────────────────────┼───────────────────────────────┼─────────────────────────────┤
│ Inside a Function (Stack Memory)│ ~ 10^6 elements (10^6 int)    │ ~ 10^6 (Avoid StackOverflow)│
│ Globally / Heap Memory          │ ~ 10^7 elements (10^7 int)    │ ~ 10^7 (JVM Heap Allocated) │
└─────────────────────────────────┴───────────────────────────────┴─────────────────────────────┘
```

> [!WARNING]
> In Java, **all arrays are allocated on the Heap** via the `new` keyword. However, memory limits still strictly apply:
> * An `int[10^7]` array consumes $10^7 \times 4 \text{ bytes} \approx 40 \text{ MB}$, which easily fits inside JVM's default heap ($256\text{ MB} - 4\text{ GB}$).
> * An `int[10^8]` array consumes $\approx 400 \text{ MB}$.
> * An `int[10^9]` array requires $\approx 4 \text{ GB}$ of contiguous memory $\implies$ **Throws `java.lang.OutOfMemoryError`!**
> 
> **Rule of Thumb**: You **cannot** use array hashing if input values exceed $\approx 10^7$.

---

## 4. Technique 2: Character Hashing (Strings)

Strings are sequences of characters. Computers store characters using integer **ASCII codes**:
* `'a'` = $97$, `'b'` = $98$, $\dots$, `'z'` = $122$
* `'A'` = $65$, `'B'` = $66$, $\dots$, `'Z'` = $90$

We can map characters directly to array indices using simple arithmetic.

### Lowercase Alphabet Mapping ($26$ Buckets)
If the string contains only lowercase characters (`'a'` to `'z'`), we map:
$$\mathbf{Index} = \mathbf{s.charAt(i) - 'a'}$$

```
Character:   'a'      'b'      'c'      ...     'z'
Formula:  'a' - 'a'  'b' - 'a' 'c' - 'a'      'z' - 'a'
Index:        0        1        2               25
```

```java
String s = "abcdabefc";
int[] hash = new int[26];

// Pre-storing
for (int i = 0; i < s.length(); i++) {
    hash[s.charAt(i) - 'a']++;
}

// Fetching
char query = 'a';
System.out.println("Frequency of " + query + ": " + hash[query - 'a']);
```

---

### All ASCII Characters Mapping ($256$ Buckets)
If the string contains mixed case letters, digits, or symbols (`'A'-'Z'`, `'a'-'z'`, spaces, `#`, `@`), allocate an array of size **$256$** and index directly with the character:

```java
String s = "Hello World! 123";
int[] hash = new int[256];

// Pre-storing
for (int i = 0; i < s.length(); i++) {
    hash[s.charAt(i)]++; // Implicit cast from char to int (0 to 255)
}

// Fetching
char query = 'l';
System.out.println("Frequency of " + query + ": " + hash[query]);
```

* **Time Complexity**: $\mathcal{O}(N)$ pre-storing, $\mathcal{O}(1)$ fetching.
* **Space Complexity**: $\mathcal{O}(1)$ auxiliary space (fixed array of 26 or 256 integers).

---

## 5. Technique 3: Hashing with Maps (`HashMap` vs `TreeMap`)

### Why Array Hashing Fails for Huge or Negative Numbers
Consider these two realistic problem scenarios:
1. **Huge Values**: $arr = [1, 10^9, 2, 10^9]$. To use array hashing, we would need `int[10^9 + 1]`, which triggers `OutOfMemoryError`.
2. **Negative Values**: $arr = [-5, 2, -5, 3]$. In Java, array indices cannot be negative (`arr[-5]` throws `ArrayIndexOutOfBoundsException`).

**The Solution**: We need dynamic key-value storage: **Maps**.

```
┌────────────────────────────────────────────────────────────────────────┐
│                        MAP KEY-VALUE MAPPING                           │
│                     Key (Element) ──▶ Value (Count)                    │
│                        10^9       ──▶       2                          │
│                         -5        ──▶       2                          │
│                          3        ──▶       1                          │
└────────────────────────────────────────────────────────────────────────┘
```

---

### `HashMap` (Unordered) vs `TreeMap` (Ordered) in Java

In Java, the two primary `Map` implementations represent two fundamentally different data structures:

```
Feature                  HashMap<K, V>                  TreeMap<K, V>
┌───────────────────────┬──────────────────────────────┬──────────────────────────────┐
│ Underlying Structure  │ Hash Table (Buckets + Lists) │ Red-Black Tree (Self-balance)│
│ Ordering of Keys      │ Unordered / Random           │ Strictly Sorted (Natural)    │
│ Average Time (Get/Put)│ O(1) Constant Time           │ O(log N) Logarithmic Time    │
│ Worst Time (Get/Put)  │ O(N) (Severe Collisions)     │ O(log N) Guaranteed          │
│ Allows Null Keys?     │ Yes (One null key)           │ No (Throws NullPointer)      │
│ Memory Overhead       │ Low (Array + Node wrappers)  │ Higher (Tree node pointers)  │
└───────────────────────┴──────────────────────────────┴──────────────────────────────┘
```

### Java Map Frequency Idiom
In modern Java, use `getOrDefault()` to increment counts concisely:

```java
Map<Integer, Integer> map = new HashMap<>();

// Pre-storing
for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}

// Fetching
int query = 1000000000;
int freq = map.getOrDefault(query, 0); // returns 0 if query not in map!
```

### Iterating Over a Map in Java
```java
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int element = entry.getKey();
    int frequency = entry.getValue();
    System.out.println(element + " -> " + frequency);
}
```

---

## 6. Under the Hood: The Division Rule & Collision Resolution

How does a `HashMap` take an arbitrary number like $10^9$ or a string like `"karnVen"` and store it inside a bounded array of buckets?

### The Division Method Hash Function
The most fundamental hash function is the **Division Method (Modulo Rule)**:

$$\mathbf{Index} = \mathbf{Key} \pmod{\mathbf{M}}$$

Where:
* $\mathbf{Key}$: The element to store.
* $\mathbf{M}$: The number of buckets in the hash table.

```
Suppose Hash Table Size M = 10 (Indices 0 to 9)

Insert 12 ──▶ 12 % 10 = 2 ──▶ Place in Bucket 2
Insert 35 ──▶ 35 % 10 = 5 ──▶ Place in Bucket 5
Insert 48 ──▶ 48 % 10 = 8 ──▶ Place in Bucket 8
Insert 22 ──▶ 22 % 10 = 2 ──▶ COLLISION! Bucket 2 is already occupied by 12!
```

---

### Why Choose a Prime Table Size?
If $M$ is a power of 2 (e.g., $M = 2^k = 16$), then $Key \pmod{16}$ only depends on the lowest $k$ bits of the key. Any repeating binary patterns in the data cause massive clustering.
* Choosing a **prime number** (e.g., $11, 13, 10^5 + 7$) ensures the hash residues distribute uniformly across all buckets, minimizing clustering.

---

### Collision Resolution: Separate Chaining & Open Addressing

When two distinct keys produce the same hash index, a **Collision** occurs.

#### 1. Separate Chaining (Used by Java's `HashMap`)
Each slot in the hash table is not a single element, but the **head of a Linked List** (bucket):

```
Bucket Index
[ 0 ] ──▶ null
[ 1 ] ──▶ null
[ 2 ] ──▶ [ Key: 12, Val: 1 ] ──▶ [ Key: 22, Val: 1 ] ──▶ [ Key: 92, Val: 1 ] ──▶ null
[ 3 ] ──▶ null
...
[ 5 ] ──▶ [ Key: 35, Val: 1 ] ──▶ null
```
* When inserting $22$: Hash to index $2$, traverse the linked list. If key exists, update value; if not, append a new node to the chain.
* When looking up $92$: Hash to index $2$, walk the linked list comparing keys until $92$ is found.

#### 2. Open Addressing (Linear Probing)
If bucket `hash(key)` is full, search linearly for the **next empty slot**:
$$	ext{probe}(i) = (h(k) + i) \pmod M \quad 	ext{for } i = 1, 2, 3, \dots$$

---

### Why Worst-Case $O(N)$ Occurs (and Java 8 Treeification)

> [!IMPORTANT]
> **Why do interviewers say `HashMap` worst-case is $\mathcal{O}(N)$?**
> If a malicious input or an extremely flawed hash function hashes **every single element into the exact same bucket** (e.g., all elements map to index 2), the bucket degenerates into a single linked list of length $N$.
> * Searching for an element requires traversing all $N$ nodes in the chain: $\mathcal{O}(N)$.

```
Degenerate Bucket Index 2:
[Head] ──▶ Node 1 ──▶ Node 2 ──▶ Node 3 ──▶ ... ──▶ Node N  (O(N) search!)
```

#### The Java 8+ Engineering Masterpiece: Treeification
To defend against worst-case $\mathcal{O}(N)$ denial-of-service collision attacks:
* When any bucket chain in a Java `HashMap` exceeds **8 nodes** (`TREEIFY_THRESHOLD = 8`) and total table capacity $\ge 64$, Java dynamically converts the linked list into a **Red-Black Self-Balancing Binary Search Tree**.
* Search time inside that collided bucket drops from **$\mathcal{O}(N)$ down to $\mathcal{O}(\log N)$**!

---

## 7. Striver Sheet Homework Problems: Highest & Lowest Frequency

In the lecture, Striver assigns the classic frequency analysis homework:

> **Problem**: Given an array of integers, find the element with the **highest frequency** and the element with the **lowest frequency**. If multiple elements tie, return any or the smaller one.

```
Example:
Input:  arr = [10, 5, 10, 15, 10, 5]
Counts: 10 -> 3, 5 -> 2, 15 -> 1
Highest Frequency: 10 (frequency = 3)
Lowest Frequency:  15 (frequency = 1)
```

### Complete Java 21 Implementation
```java
import java.util.*;

public class FrequencyAnalysis {

    public static void findHighestAndLowest(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count Frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0, minFreq = arr.length;
        int maxEle = -1, minEle = -1;

        // Step 2: Iterate through map entrySet
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            // Check Highest
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            // Check Lowest
            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("Element with Highest Frequency: " + maxEle + " (Count: " + maxFreq + ")");
        System.out.println("Element with Lowest Frequency:  " + minEle + " (Count: " + minFreq + ")");
    }
}
```

* **Time Complexity**: $\mathcal{O}(N)$ to build map + $\mathcal{O}(K)$ to scan unique entries $\le \mathcal{O}(N)$. Total: $\mathcal{O}(N)$.
* **Space Complexity**: $\mathcal{O}(K)$ auxiliary space, where $K$ is the number of distinct elements ($\le N$).

---

## 8. Summary & Complexity Master Matrix

| Approach | Precomputation Time | Fetch Time | Auxiliary Space | When to Use |
| :--- | :--- | :--- | :--- | :--- |
| **Brute Force Scan** | $\mathcal{O}(1)$ | $\mathcal{O}(N)$ per query | $\mathcal{O}(1)$ | Only if $Q$ is tiny ($Q = 1$ or $2$) |
| **Number Hash Array** | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | $\mathcal{O}(	ext{MaxVal})$ | Elements $\ge 0$ and $	ext{MaxVal} \le 10^7$ |
| **Character Hash Array** | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | $\mathcal{O}(26)$ or $\mathcal{O}(256)$ | Always preferred for strings |
| **`HashMap<K, V>`** | $\mathcal{O}(N)$ avg | $\mathcal{O}(1)$ avg | $\mathcal{O}(K)$ | Huge numbers ($10^9$), negative values, objects |
| **`TreeMap<K, V>`** | $\mathcal{O}(N \log N)$ | $\mathcal{O}(\log N)$ | $\mathcal{O}(K)$ | When output requires sorted key order |

---

## 💻 Standalone Verification Suite
Compile and run the companion Java 21 verification suite:

```bash
javac 01-basics/04-hashing/BasicHashingDemo.java
java -cp 01-basics/04-hashing BasicHashingDemo
```
