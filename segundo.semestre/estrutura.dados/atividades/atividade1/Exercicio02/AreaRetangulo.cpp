#include <iostream>

using namespace std;

int main() {
    float altura, largura, area;

    cout << "Digite a altura: ";
    cin >> altura;
    cout << "Digite a largura: ";
    cin >> largura;

    area = altura * largura;

    cout << "A area do retangulo e: " << area << "cm";
    return 0;
}