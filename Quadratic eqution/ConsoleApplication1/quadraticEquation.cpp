#include <iostream>
#include <tuple>
#include <Windows.h>

using namespace std;

tuple<float, float> quadraticEqution(float a, float b, float c) {
    //Дескременант
    float d = b * b - 4 * a * c;

    //Корень
    float root = sqrt(d);

    //Уравнение для двух корней
    float rootEquation = root / (2 * a);

    //Первый корень
    float firstRoot = 0;

    //Второй корень
    float secondRoot = 0;

    if (d < 0) {
        cout << "There is no roots\n" << endl;
    } 
    
    else if (d == 0) {
        firstRoot = -b / (2 * a);

        cout << "Root is " << firstRoot << endl;
    } else {
        firstRoot = (-b + rootEquation);
        secondRoot = (-b - rootEquation);

        cout << "Root one is " << firstRoot << endl;
        cout << "Root two is " << secondRoot << endl;
    }

    return { firstRoot, secondRoot };
}

int main() {
    SetConsoleCP(1251);
    SetConsoleOutputCP(1251);

    quadraticEqution(6, 1, 9);
    quadraticEqution(1, 6, 9);
    quadraticEqution(1, 9, 6);
}