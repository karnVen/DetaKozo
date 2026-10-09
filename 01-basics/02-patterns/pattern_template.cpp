/**
 * @file pattern_template.cpp
 * @brief Template for Striver A2Z Pattern Solutions
 * 
 * ?? AI-bou Learning Method:
 * 1. Geometry Breakdown: Rows (i) vs Columns (j)
 * 2. Formula Derivation: Stars, Spaces, Numbers, Chars
 * 3. Dry Run / Trace
 * 4. Complexity: Time & Space
 */

#include <iostream>

using namespace std;

void printPattern(int n) {
    // 1. Outer Loop: Rows (0 to n-1)
    for (int i = 0; i < n; i++) {
        // 2. Inner Loop(s): Columns / Spaces / Values
        for (int j = 0; j < n; j++) {
            cout << "* ";
        }
        // 3. Newline after each row
        cout << "\n";
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n = 5;
    cout << "Pattern Output for N = " << n << ":\n";
    printPattern(n);

    return 0;
}
