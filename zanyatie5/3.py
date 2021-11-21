# -- coding: utf-8 --

def Third(N):
    i = 2
    k = 1

    while N > i:
        k += 1
        i *= 2
        if i > N:
            i /= 2
            k -= 2
            break

    print(k)
    print(int(i))


N = int(input("Введите N: "))
Third(N)