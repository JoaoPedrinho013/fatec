#include <iostream>
#include <cmath>

using namespace std;

int main() {
    float a, b, c, d, x1, x2;

    cout << "Digite 3 valores (a b c):\n";
    cin >> a >> b >> c;

    d = (b * b) - 4 * a * c;

    if (d > 0) {
        x1 = (-b + sqrt(d)) / (2 * a);
        x2 = (-b - sqrt(d)) / (2 * a);

        cout << "As saidas sao " << x1 << " e " << x2 << "\n";

    } else if (d == 0) {
        x1 = -b / (2 * a);
        cout << "O valor e " << x1 << "\n";
    } else {
        cout << "Nao existe raiz real\n";
    }

    return 0;
}

