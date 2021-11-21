# -- coding: utf-8 --

def Fourth(x, y):
    k = 1

    while x < y:
        x *= 1.1
        k += 1

    print(k)

x = float(input("Введите x: "))
y = float(input("Введите y: "))
Fourth(x, y)