/**
 * ============================================================================
 * ?? Pattern 01: Rectangular Star Pattern
 * TakeUForward: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-solve-any-pattern-problems/#pattern-1
 * Difficulty: Easy
 * ============================================================================
 * 
 * ?? Target Output for N = 5:
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * 
 * ?? Logic & Geometry Breakdown:
 * - Rows (Outer Loop): `i` goes from 0 to N-1 (Total N rows).
 * - Columns (Inner Loop): In every row `i`, print exactly N stars (`* `).
 * - Row Termination: Output `\n` after inner loop finishes.
 * 
 * ?? Complexity:
 * - Time Complexity: O(N^2) ? N rows * N columns = N * N operations.
 * - Space Complexity: O(1) ? No extra space used besides loop variables.
 */

#include <iostream>

using namespace std;

void pattern1(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << "* ";
        }
        cout << "\n";
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cout << "Enter N (e.g. 5): ";
    if (!(cin >> n)) {
        n = 5;
    }

    cout << "\n--- Output for N = " << n << " ---\n";
    pattern1(n);

    return 0;
}
