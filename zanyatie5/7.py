# -- coding: utf-8 --

def Seventh():
    k = 0
    N = 0
    N_0 = 0

    while True:
        N_0 = N
        N = int(input())
        if N == 0:
            break
        if N > N_0:
            k += 1

    print(k-1)

Seventh()