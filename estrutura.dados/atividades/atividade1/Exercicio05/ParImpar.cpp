#include <iostream>

using namespace std;

int main()
{
    int num;

    cout << "Digite um valor: ";
    cin >> num;

    if (num % 2 == 0)
    {
        cout << "O numero e par" << endl;
    }
    else
    {
        cout << "O numero e impar" << endl;
    }
    return 0;
}
