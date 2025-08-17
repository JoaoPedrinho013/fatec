#include <iostream>

#include "../consoleAcento.h"

using namespace std;

int main()
{
    consoleAcento();
    
    int idade;

    cout << "Digite sua idade: ";
    cin >> idade;

    if (idade <= 11)
    {
        cout << "Você é uma criança\n";
    }
    else if (idade <= 16)
    {
        cout << "Você é um pré-adolescente\n";
    }
    else if (idade <= 17)
    {
        cout << "Você é um adolescente\n";
    }
    else if (idade <= 49)
    {
        cout << "Você é um adulto\n";
    }
    else
    {
        cout << "Você é um idoso\n";
    }

    return 0;
}
