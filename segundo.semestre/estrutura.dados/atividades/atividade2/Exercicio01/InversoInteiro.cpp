#include <iostream>
#include "../../atividade1/consoleAcento.h"

using namespace std;

int main(){
    consoleAcento();
    int numeros[10];


    for(int i = 1; i<= 10; i++){
        cout << "Digite o " << i << "° número: ";
        cin >> numeros[i];
        if (numeros[i] < 0){
            cout << "Número negativo digitado!";
            break;
        }

    }
    
    for(int i = 0; i < 10; i++){
        cout << numeros[i] * (-1) << "\n";
    }
}