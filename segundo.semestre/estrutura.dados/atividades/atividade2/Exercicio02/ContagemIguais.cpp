#include <iostream>
#include "../../atividade1/consoleAcento.h"

using namespace std;

int main(){
    consoleAcento();
    int arrayNum[100];
    int num;
    int contador = 0;
    int somador = 0;
    int ultNum = -1;

    while(contador < 100) {
        cout << "Digite o " << contador+1 << "° número (0 para parar): ";
        cin >> num;
        if (num == 0) {
            break;
        }
        arrayNum[contador] = num;
        ultNum = num;
        contador++;
    }

    cout << "\nO ultimo número lido foi o " << ultNum << ". \n";
    for (int i = 0; i < contador; i++) {
        if(arrayNum[i] == ultNum) {
            somador++;
        }
    }
    cout << "E esse número se repetiu " << somador << " vezes.";

    return 0;
}