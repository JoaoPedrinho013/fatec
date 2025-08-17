#include <iostream>

using namespace std;

int main() {
    float base, altura, area;

    cout << "Digite a base: ";
    cin >> base;
    cout << "Digite a altura: ";
    cin >> altura;

    area = (base * altura) / 2;

    cout << "A area do triangulo e: " << area << "cm";
    return 0;
}