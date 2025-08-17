#include <iostream>

using namespace std;

int main() {
    // Área = (base maior + base menor) * altura / 2
    float baseMaior, baseMenor, altura, area;

    cout << "Digite a base maior: ";
    cin >> baseMaior;
    cout << "Digite a base menor: ";
    cin >> baseMenor;
    cout << "Digite a altura: ";
    cin >> altura;

    area = (((baseMaior + baseMenor) * altura ) / 2);

    cout << "A area do triangulo e: " << area << "cm";
    return 0;
}