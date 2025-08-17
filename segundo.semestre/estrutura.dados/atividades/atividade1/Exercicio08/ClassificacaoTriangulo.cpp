#include <iostream>
#include "../consoleAcento.h"

using namespace std;

int main()
{
    consoleAcento();

    int ladoA, ladoB, ladoC;
    cout << "Classificação de Triângulos!\n";
    cout << "Digite o lado A: ";
    cin >> ladoA;
    cout << "Digite o lado B: ";
    cin >> ladoB;
    cout << "Digite o lado C: ";
    cin >> ladoC;

    
    if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
        cout << "Os lados informados não formam um triângulo!\n";
        return 0;
    }

    if (ladoA == ladoB && ladoB == ladoC) {
        cout << "O Triângulo é Equilátero!\n";
    } 
    else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
        cout << "O Triângulo é Escaleno!\n";
    } 
    else {
        cout << "O Triângulo é Isósceles!\n";
    }

    return 0;
}
