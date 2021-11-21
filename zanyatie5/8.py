# -- coding: utf-8 --

def Eighth():
    k_max = k = 0
    N = 0
    N_0 = 0

    while True:
        N_0 = N
        N = int(input())
        if N == 0:
            break

        if N == N_0:
            k += 1
            k_max = max(k, k_max)

        else:
            k = 0

    print(k_max+1)

Eighth()