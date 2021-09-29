string.encode(encoding='UTF-8',errors='strict')

print("Седьмое задание")
def vis(year):
	if (year % 4 == 0) and (year % 100 != 0) and (year % 400 == 0):
		return ("Год високосный" + "\n")
	else:
		return ("Год не високосный" + "\n")
year = int(input("Введите год: "))
print(vis(year))