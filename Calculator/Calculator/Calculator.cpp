#include <iostream>

using namespace std;

int main() {
    char operation;

    float num1, num2, result;

    cout << "Enter first num: ";
    cin >> num1;

    cout << "Enter second num: ";
    cin >> num2;

    cout << "Enter operation (+, -, *, /): ";
    cin >> operation;

    switch (operation) {
    case  '+':
         result = num1 + num2;
         break;
    case  '-':
        result = num1 - num2;
        break;
    case  '*':
        result = num1 * num2;
        break;
    case  '/':
        if (num2 == 0) {
            cout << "Error: division on zero" << endl;
            return 0;
        }
        result = num1 / num2;
        break;
    default:
        cout << "Error: wrong operation" << endl;
        break;
    }
    cout << num1 << " " << operation << " " << num2 << " = " << result << endl;
    return 0;
}