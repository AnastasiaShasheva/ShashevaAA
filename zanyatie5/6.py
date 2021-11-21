# -- coding: utf-8 --

def Sixth():
    k = 0
    S = 0

    while True:
        N = int(input())
        if N == 0:
            break
        S += N
        k += 1

    print(S/k)

Sixth()