string.encode(encoding='UTF-8',errors='strict')

print("Седьмое задание")
number = input("Введите число")
arr = list(number)
last = int(arr[-1])
if (last == 0) or (last == 2) or (last == 4) or (last == 6) or (last == 8):
    print(str(number) + " четное")
else:
    print(str(number) + " нечетное")