#include <iostream>
#include "../consoleAcento.h"
#include <algorithm>
using namespace std;

int main()
{
    consoleAcento();

    int numeros[4];

   for (int i = 0; i < 4; i++) {
    cout << "Digite o " << i+1 << "° número: ";
    cin >> numeros[i];
   }
   // media dos numeros
    int soma = 0;
    for (int n : numeros) { 
        soma += n;
    }
    double media = (double)soma / 4;
    // maior e menor usando algorithm
    int maior = *max_element(numeros, numeros + 4);
    int menor = *min_element(numeros, numeros + 4);

    cout << "Dos números informados,\n O maior número é o " << maior << "\n O menor número é o " << menor << " \n A média entre os números digitados é " << media << "!";
    return 0;
}
