#include <iostream>
#include "../../atividade1/consoleAcento.h"
using namespace std;

int main()
{
    consoleAcento();
    int vet[8], aux;

    for(int i=0; i < 8; i++){
        cout << "Digite um número: \n";
        cin>>vet[i];
    }


    for(int i=0; i < 8; i++){
        for(int j=i+1; j < 8; j++){
            if(vet[i] > vet[j]){
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
            }
        }
    }

    for(int i=0; i < 8; i++){
        cout << vet[i] << "\t";
    }




    return 0;
}
