string.encode(encoding='UTF-8',errors='strict')

print("Шестое задание")
def cvet(x1, y1, x2, y2):
	if (int(x1) % 2) == (int(y1) % 2):
		posit1 = True
	else:
		posit1 = False
		
	if (int(x2) % 2) == (int(y2) % 2):
		posit2 = True
	else:
		posit2 = False
	
	if posit1 == posit2:
		return "Да"
	else:
		return "Нет"
posit = input("Введите 4 координаты через пробелы").split()
print(str(cvet(posit[0], posit[1], posit[2], posit[3]))+"\n")