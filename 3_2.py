string.encode(encoding='UTF-8',errors='strict')

print("Третье задание")
n = int(input("Введите n: "))
hours = n // 60
if hours >= 24:
    hours %= 24
if n >= 60:
    n %= 60
print(str(hours) + ":" + str(n) + "\n")