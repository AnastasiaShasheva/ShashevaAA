string.encode(encoding='UTF-8',errors='strict')

print("Пятое задание")
a = int(input("Введите а"))
b = int(input("Введите b"))
c = int(input("Введите c"))
def min_(x1, x2, x3):
	arr = [x1, x2, x3]
	return min(arr)
print("Минимальное число: " + str(min_(a, b, c)) + "\n")