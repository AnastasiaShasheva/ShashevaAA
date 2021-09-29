string.encode(encoding='UTF-8',errors='strict')

print("Четвертое задание")
second = int(input("Введите количество секунд"))
min_ = second // 60
second %= 60
hours = min_ // 60
min_ %= 60
days = hours // 24
hours %= 24
print(str(days) + ":" + str(hours) + ":" + str(min_) + ":" + str(second) + "\n")