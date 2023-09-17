#include <iostream>
#include <string>
using namespace std;

int a, b, c, d, h, l, l2, r, k, ost = 0, full;
bool flag1 = false, flag2 = false;
float ost2;

float arr1[5]; int arr[5];
string arr_str[5]{
    "длину комнаты: ",
    "ширину комнаты: ",
    "высоту комнаты : ",
    "ширину обоев: ",
    "длину обоев: "
};

float getValues(int id)
{
    while (true)
    {
        cout << "Введите " << arr_str[id];
        float a;
        cin >> a;

        if (cin.fail() || a <= 0)
        {
            cin.clear();
            cin.ignore(32767, '\n');
        }
        else
            return a;
    }
}
void Perevod()
{
    a = arr[0]; b = arr[1]; c = arr[2]; d = arr[3]; h = arr[4];
}

int main() {

    for (int i = 0; i < 5; i++)
    {
        arr1[i] = getValues(i);
    }

    for (int i = 0; i < 5; i++)
    {
        float p;
        p = arr1[i] * 100;
        arr[i] = int(p);
    }

    Perevod();

    l = (a+b)*2;
    k = h / c;
    l2 = l / d;

    if (l % d != 0) { l2++; flag1 = true;}
    r = l2 / k;
    if (l2 % k != 0) { r++; flag2 = true;}

    ost += ((h-(c*k))*r*d);
    if (flag1){ ost += ((l2*d - l)*c); }
    if (flag2) { ost += ((k*r-l2)*d*c);}

    full = d * h * r;
    ost2 = (ost*100/(d*h*r));
   
    cout << "Количество рулонов: " << r << endl;
    cout << "Процент остатка: " << ost2 << "%" << endl;

    return 0;
}
