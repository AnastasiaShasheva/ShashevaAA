# -- coding: utf-8 --

def First(N):
    i = 1
    while i <= N:
        print(i**2)
        i += 1


N = int(input("Введите N: "))
First(N)