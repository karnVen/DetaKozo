#include<bits/stdc++.h>
using namespace std;
int main() {
    // Declare a variable to store the user's age
    int age;

    // Ask the user to enter their age
    cout << "Enter your age: ";
    cin >> age;  // Take input from the user

    // Check if the user is 18 or older
    if (age >= 18) {
        // If true, print that the user is an adult
        cout << "You are an adult." << endl;
    } else {
        // Otherwise, print that the user is not an adult
        cout << "You are not an adult." << endl;
    }

    return 0; // End of program
}

