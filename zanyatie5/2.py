# -- coding: utf-8 --

def Second(N):
    i = 2
    while i <= N:
        if N % i == 0:
            print(i)
            break
        i += 1

N = int(input("Введите N: "))
Second(N)