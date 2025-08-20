#include <iostream>
#include "../../atividade1/consoleAcento.h"
using namespace std;

int main() {
    consoleAcento();
    int vetorV[10];
    long long vetorW[10];

    for(int i = 0; i < 10; i++) {
        cout << "Digite o " << i+1 << "° número: ";
        cin >> vetorV[i];
    }

    for(int i = 0; i < 10; i++) {
        if(vetorV[i] < 0) {
            vetorW[i] = -1;
        } else {
            long long fatorial = 1;
            for(int f = 1; f <= vetorV[i]; f++) {
                fatorial *= f;
            }
            vetorW[i] = fatorial;
        }
    }

    cout << "\nFatoriais:\n";
    for(int i = 0; i < 10; i++) {
        if(vetorW[i] == -1)
            cout << "Inválido ";
        else
            cout << vetorW[i] << " ";
    }
    cout << endl;

    return 0;
}
