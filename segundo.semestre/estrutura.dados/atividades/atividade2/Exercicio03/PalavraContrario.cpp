#include <iostream>
#include <cstring>
#include "../../atividade1/consoleAcento.h"
using namespace std;

int main() {
    consoleAcento();
    char palavra[10];

    cout << "Digite uma palavra (até 9 letras): ";
    cin >> palavra;

    int tamanho = strlen(palavra); 

    cout << "Palavra invertida: ";
    for (int i = tamanho - 1; i >= 0; i--) {
        cout << palavra[i];
    }
    return 0;
}
