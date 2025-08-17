#include <iostream>

#include "../consoleAcento.h"

using namespace std;

int main(){
    consoleAcento();

    int ano;

    cout << "Digite um ano: ";
    cin >> ano;

    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
        cout << "O ano é Bissexto!\n";
    } else {
        cout << "O ano não é Bissexto!\n";
    }



    return 0;
}