string.encode(encoding='UTF-8',errors='strict')

print("Третье задание")
age = int(input("Введите возраст"))
name = input("Введите имя")
if (name != "Иван") and (0 < age < 75):
    if age >= 16:
        print("Поздравляем вы поступили в ВГУИТ\n")
    else:
        print("Осталось проучиться в школе " + str(16-age)+"\n")